/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.beans.Transient;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author home
 */
@XmlRootElement
public class Stations {
    
    private int stid, stZone;
    private String stname;
//    Gate gate = new Gate(stZone);

    public Stations() {
    }

    public Stations(int stid, int stZone, String stname) {
        this.stid = stid;
        this.stZone = stZone;
        this.stname = stname;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public int getStZone() {
        return stZone;
    }

    public void setStZone(int stZone) {
        this.stZone = stZone;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }
    
//    @Transient
//    public Validation allow(String xml)
//    {
//        return gate.allow(xml);
//    }
//    @Transient
//    public boolean deny(String xml){
//        return gate.deny(xml);
//    }
    


}
