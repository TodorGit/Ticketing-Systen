/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author home
 */
@Entity
@Table(name = "scheduletable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Scheduletable.findAll", query = "SELECT s FROM Scheduletable s"),
    @NamedQuery(name = "Scheduletable.findBySchid", query = "SELECT s FROM Scheduletable s WHERE s.schid = :schid"),
    @NamedQuery(name = "Scheduletable.findByArrivalTime", query = "SELECT s FROM Scheduletable s WHERE s.arrivalTime = :arrivalTime")})
public class Scheduletable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "schid")
    private Integer schid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "arrivalTime")
    @Temporal(TemporalType.TIME)
    private Date arrivalTime;
    @JoinColumn(name = "fkstation", referencedColumnName = "stid")
    @ManyToOne(optional = false)
    private Stations fkstation;

    public Scheduletable() {
    }

    public Scheduletable(Integer schid) {
        this.schid = schid;
    }

    public Scheduletable(Integer schid, Date arrivalTime) {
        this.schid = schid;
        this.arrivalTime = arrivalTime;
    }

    public Integer getSchid() {
        return schid;
    }

    public void setSchid(Integer schid) {
        this.schid = schid;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Stations getFkstation() {
        return fkstation;
    }

    public void setFkstation(Stations fkstation) {
        this.fkstation = fkstation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schid != null ? schid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Scheduletable)) {
            return false;
        }
        Scheduletable other = (Scheduletable) object;
        if ((this.schid == null && other.schid != null) || (this.schid != null && !this.schid.equals(other.schid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkg.Scheduletable[ schid=" + schid + " ]";
    }
    
}
