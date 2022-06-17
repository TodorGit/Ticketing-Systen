/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Ticket;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author home
 */
public class Generator {
    
    public static String generate(Ticket ticket)
    {
        String ex;
        try{
            
            JAXBContext context = JAXBContext.newInstance(Ticket.class);
            Marshaller marshall = context.createMarshaller();
            StringWriter writer = new StringWriter();
            marshall.marshal(ticket, writer);
            return writer.toString();
            
        }catch(JAXBException e)
        {
            System.out.println(e);
            ex = e.toString();
        }
        return ex;
    }
}
