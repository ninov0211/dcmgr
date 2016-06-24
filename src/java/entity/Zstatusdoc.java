/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * @author dinov
 */
@Entity
@Table(name = "ZSTATUSDOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zstatusdoc.findAll", query = "SELECT z FROM Zstatusdoc z"),
    @NamedQuery(name = "Zstatusdoc.findByZstatusdocid", query = "SELECT z FROM Zstatusdoc z WHERE z.zstatusdocid = :zstatusdocid"),
    @NamedQuery(name = "Zstatusdoc.findByStatusdescription", query = "SELECT z FROM Zstatusdoc z WHERE z.statusdescription = :statusdescription"),
    @NamedQuery(name = "Zstatusdoc.findByStatusname", query = "SELECT z FROM Zstatusdoc z WHERE z.statusname = :statusname")})
public class Zstatusdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZSTATUSDOCID", nullable = false)
    private Integer zstatusdocid;
    @Size(max = 255)
    @Column(name = "STATUSDESCRIPTION", length = 255)
    private String statusdescription;
    @Size(max = 255)
    @Column(name = "STATUSNAME", length = 255)
    private String statusname;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zstatusdoc")
    private Collection<ZstatusdocZdoc> zstatusdocZdocCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zstatusdoc")
    private Collection<ZdocZstatusdoc> zdocZstatusdocCollection;

    public Zstatusdoc() {
    }

    public Zstatusdoc(Integer zstatusdocid) {
        this.zstatusdocid = zstatusdocid;
    }

    public Integer getZstatusdocid() {
        return zstatusdocid;
    }

    public void setZstatusdocid(Integer zstatusdocid) {
        this.zstatusdocid = zstatusdocid;
    }

    public String getStatusdescription() {
        return statusdescription;
    }

    public void setStatusdescription(String statusdescription) {
        this.statusdescription = statusdescription;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    @XmlTransient
    public Collection<ZstatusdocZdoc> getZstatusdocZdocCollection() {
        return zstatusdocZdocCollection;
    }

    public void setZstatusdocZdocCollection(Collection<ZstatusdocZdoc> zstatusdocZdocCollection) {
        this.zstatusdocZdocCollection = zstatusdocZdocCollection;
    }

    @XmlTransient
    public Collection<ZdocZstatusdoc> getZdocZstatusdocCollection() {
        return zdocZstatusdocCollection;
    }

    public void setZdocZstatusdocCollection(Collection<ZdocZstatusdoc> zdocZstatusdocCollection) {
        this.zdocZstatusdocCollection = zdocZstatusdocCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zstatusdocid != null ? zstatusdocid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zstatusdoc)) {
            return false;
        }
        Zstatusdoc other = (Zstatusdoc) object;
        if ((this.zstatusdocid == null && other.zstatusdocid != null) || (this.zstatusdocid != null && !this.zstatusdocid.equals(other.zstatusdocid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zstatusdoc[ zstatusdocid=" + zstatusdocid + " ]";
    }
    
}
