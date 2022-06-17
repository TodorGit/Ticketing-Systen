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
@Table(name = "prices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prices.findAll", query = "SELECT p FROM Prices p"),
    @NamedQuery(name = "Prices.findByPriceId", query = "SELECT p FROM Prices p WHERE p.priceId = :priceId"),
    @NamedQuery(name = "Prices.findByStartTime", query = "SELECT p FROM Prices p WHERE p.startTime = :startTime"),
    @NamedQuery(name = "Prices.findByEndTime", query = "SELECT p FROM Prices p WHERE p.endTime = :endTime"),
    @NamedQuery(name = "Prices.findByPrice", query = "SELECT p FROM Prices p WHERE p.price = :price")})
public class Prices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "priceId")
    private Integer priceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "startTime")
    @Temporal(TemporalType.TIME)
    private Date startTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "endTime")
    @Temporal(TemporalType.TIME)
    private Date endTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private float price;

    public Prices() {
    }

    public Prices(Integer priceId) {
        this.priceId = priceId;
    }

    public Prices(Integer priceId, Date startTime, Date endTime, float price) {
        this.priceId = priceId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (priceId != null ? priceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prices)) {
            return false;
        }
        Prices other = (Prices) object;
        if ((this.priceId == null && other.priceId != null) || (this.priceId != null && !this.priceId.equals(other.priceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkg.Prices[ priceId=" + priceId + " ]";
    }
    
}
