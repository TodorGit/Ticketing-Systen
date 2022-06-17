<%-- 
    Document   : TicketGenerator
    Created on : 12 Jun 2022, 18:12:38
    Author     : home
--%>

<%@page import="Control.Generator"%>
<%@page import="Model.Ticket"%>
<%@page import="Model.Stations"%>
<%@page import="java.util.List"%>
<%@page import="Control.ReSTClient"%>
<%@page import="java.io.StringWriter"%>
<%@page import="javax.xml.bind.Marshaller"%>
<%@page import="javax.xml.bind.JAXBContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="TicketGenerator.jsp" id="formUser">
            <label>Start Station</label>
            <select name="startStation" id="stations">
    <%
            List<Stations> list = ReSTClient.getStations();    
            for(int i = 0; i < list.size();i++)
            {      
                out.print("<option value =" + i +">"+list.get(i).getStname()+"</option>");      
                
            }
            
    %>
            </select><br>
            <label>End Station</label>
            <select name="endStation" id="stations">
                <%
            List<Stations> secondList = ReSTClient.getStations();    
            for(int i = 0; i < secondList.size();i++)
            {      
                out.print("<option value =" + i +">"+secondList.get(i).getStname()+"</option>");                
            }
    %>
            </select><br>
            Expiry Date: <input type="date" id="date" name="date">
            <input type="submit" value="Marshall">
        </form>
        <br>
       <%
       String xml_ticket = null;
       if(request.getParameter("startStation")!= null &&
           request.getParameter("endStation") != null &&
           request.getParameter("date") != null )
       {
          int startZone  = Integer.parseInt(request.getParameter("startStation"));
          int endZone = Integer.parseInt(request.getParameter("endStation"));
          Ticket ticket = new Ticket(list.get(startZone).getStname(),list.get(endZone).getStname(),
          String.valueOf(list.get(startZone).getStZone()), String.valueOf(list.get(endZone).getStZone()),false,false);     
          xml_ticket = Generator.generate(ticket);
       }


       
       %>

            
         <textarea rows ="8" cols="70">
          <%

          out.print(xml_ticket);
           
            
        %>  
         </textarea>
         

    </body>
</html>
