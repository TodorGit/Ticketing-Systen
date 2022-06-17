/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author home
 */
@XmlRootElement
public class Ticket {
    
    private String startStation,endStation, startZone, endZone  ;
    private boolean entered, exited;

    public Ticket(String startStation, String endStation, String startZone, String endZone, boolean entered, boolean exited) {
        this.startStation = startStation;
        this.endStation = endStation;
        this.startZone = startZone;
        this.endZone = endZone;
        this.entered = entered;
        this.exited = exited;
    }

    public Ticket() {
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public String getStartZone() {
        return startZone;
    }

    public void setStartZone(String startZone) {
        this.startZone = startZone;
    }

    public String getEndZone() {
        return endZone;
    }

    public void setEndZone(String endZone) {
        this.endZone = endZone;
    }

    public boolean isEntered() {
        return entered;
    }

    public void setEntered(boolean entered) {
        this.entered = entered;
    }

    public boolean isExited() {
        return exited;
    }

    public void setExited(boolean exited) {
        this.exited = exited;
    }


    
    

}
