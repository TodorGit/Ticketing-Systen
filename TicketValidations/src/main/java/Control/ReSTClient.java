/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Stations;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author home
 */
public class ReSTClient {
    
    public static List<Stations> getStations()
    {
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target("http://localhost:8080/Service/webresources/pkg.stations");
        Invocation.Builder invocation = target.request(MediaType.APPLICATION_XML);
        Response response = invocation.get();
        List<Stations> list = response.readEntity(new GenericType<List<Stations>>(){});
        return list;
    }
}
