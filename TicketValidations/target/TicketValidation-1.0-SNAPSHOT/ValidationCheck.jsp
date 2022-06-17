<%-- 
    Document   : ValidationCheck
    Created on : 12 Jun 2022, 18:25:34
    Author     : home
--%>

<%@page import="Model.Ticket"%>
<%@page import="java.io.StringReader"%>
<%@page import="javax.xml.bind.Unmarshaller"%>
<%@page import="javax.xml.bind.JAXBContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    </head>
    <body>
        <form action="ValidationCheck.jsp" id="usrform">
             <textarea name="unmarshaller" rows="12" cols="50"></textarea>
             <input type="submit" value="UnMarshall">
         </form>

        <%
            
         if(request.getParameter("unmarshaller") != null){
                
                JAXBContext context = JAXBContext.newInstance(Ticket.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                StringReader reader = new StringReader(request.getParameter("unmarshaller"));
                Ticket ticket =(Ticket) unmarshaller.unmarshal(reader);
               
                
            }
        
        %>   
    </body>
</html>
