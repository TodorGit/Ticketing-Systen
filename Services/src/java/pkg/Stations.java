/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author home
 */
@Entity
@Table(name = "stations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stations.findAll", query = "SELECT s FROM Stations s"),
    @NamedQuery(name = "Stations.findByStid", query = "SELECT s FROM Stations s WHERE s.stid = :stid"),
    @NamedQuery(name = "Stations.findByStname", query = "SELECT s FROM Stations s WHERE s.stname = :stname"),
    @NamedQuery(name = "Stations.findByStZone", query = "SELECT s FROM Stations s WHERE s.stZone = :stZone")})
public class Stations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stid")
    private Integer stid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "stname")
    private String stname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stZone")
    private int stZone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkstation")
    private Collection<Scheduletable> scheduletableCollection;

    public Stations() {
    }

    public Stations(Integer stid) {
        this.stid = stid;
    }

    public Stations(Integer stid, String stname, int stZone) {
        this.stid = stid;
        this.stname = stname;
        this.stZone = stZone;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public int getStZone() {
        return stZone;
    }

    public void setStZone(int stZone) {
        this.stZone = stZone;
    }

    @XmlTransient
    public Collection<Scheduletable> getScheduletableCollection() {
        return scheduletableCollection;
    }

    public void setScheduletableCollection(Collection<Scheduletable> scheduletableCollection) {
        this.scheduletableCollection = scheduletableCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stid != null ? stid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stations)) {
            return false;
        }
        Stations other = (Stations) object;
        if ((this.stid == null && other.stid != null) || (this.stid != null && !this.stid.equals(other.stid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkg.Stations[ stid=" + stid + " ]";
    }
    
}
