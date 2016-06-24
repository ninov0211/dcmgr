/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "ZDOCTABEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdoctabel.findAll", query = "SELECT z FROM Zdoctabel z"),
    @NamedQuery(name = "Zdoctabel.findByZdoctabelid", query = "SELECT z FROM Zdoctabel z WHERE z.zdoctabelid = :zdoctabelid"),
    @NamedQuery(name = "Zdoctabel.findByNamadocument", query = "SELECT z FROM Zdoctabel z WHERE z.namadocument = :namadocument"),
    @NamedQuery(name = "Zdoctabel.findByTypeid", query = "SELECT z FROM Zdoctabel z WHERE z.typeid = :typeid"),
    @NamedQuery(name = "Zdoctabel.findByZdeptZdepid", query = "SELECT z FROM Zdoctabel z WHERE z.zdeptZdepid = :zdeptZdepid"),
    @NamedQuery(name = "Zdoctabel.findByZdocdept", query = "SELECT z FROM Zdoctabel z WHERE z.zdocdept = :zdocdept"),
    @NamedQuery(name = "Zdoctabel.findByZdoctabeltipeZdoctabeltipeid", query = "SELECT z FROM Zdoctabel z WHERE z.zdoctabeltipeZdoctabeltipeid = :zdoctabeltipeZdoctabeltipeid")})
public class Zdoctabel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOCTABELID", nullable = false)
    private Integer zdoctabelid;
    @Size(max = 255)
    @Column(name = "NAMADOCUMENT", length = 255)
    private String namadocument;
    @Column(name = "TYPEID")
    private Integer typeid;
    @Column(name = "ZDEPT_ZDEPID")
    private Integer zdeptZdepid;
    @Column(name = "ZDOCDEPT")
    private Integer zdocdept;
    @Column(name = "ZDOCTABELTIPE_ZDOCTABELTIPEID")
    private Integer zdoctabeltipeZdoctabeltipeid;
    @OneToMany(mappedBy = "zdoctabelid")
    private Collection<Zdoc> zdocCollection;
    @OneToMany(mappedBy = "zdoctabelid1")
    private Collection<Zprivilage> zprivilageCollection;
    @OneToMany(mappedBy = "zdoctabelZdoctabelid")
    private Collection<Zprivilage> zprivilageCollection1;

    public Zdoctabel() {
    }

    public Zdoctabel(Integer zdoctabelid) {
        this.zdoctabelid = zdoctabelid;
    }

    public Integer getZdoctabelid() {
        return zdoctabelid;
    }

    public void setZdoctabelid(Integer zdoctabelid) {
        this.zdoctabelid = zdoctabelid;
    }

    public String getNamadocument() {
        return namadocument;
    }

    public void setNamadocument(String namadocument) {
        this.namadocument = namadocument;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getZdeptZdepid() {
        return zdeptZdepid;
    }

    public void setZdeptZdepid(Integer zdeptZdepid) {
        this.zdeptZdepid = zdeptZdepid;
    }

    public Integer getZdocdept() {
        return zdocdept;
    }

    public void setZdocdept(Integer zdocdept) {
        this.zdocdept = zdocdept;
    }

    public Integer getZdoctabeltipeZdoctabeltipeid() {
        return zdoctabeltipeZdoctabeltipeid;
    }

    public void setZdoctabeltipeZdoctabeltipeid(Integer zdoctabeltipeZdoctabeltipeid) {
        this.zdoctabeltipeZdoctabeltipeid = zdoctabeltipeZdoctabeltipeid;
    }

    @XmlTransient
    public Collection<Zdoc> getZdocCollection() {
        return zdocCollection;
    }

    public void setZdocCollection(Collection<Zdoc> zdocCollection) {
        this.zdocCollection = zdocCollection;
    }

    @XmlTransient
    public Collection<Zprivilage> getZprivilageCollection() {
        return zprivilageCollection;
    }

    public void setZprivilageCollection(Collection<Zprivilage> zprivilageCollection) {
        this.zprivilageCollection = zprivilageCollection;
    }

    @XmlTransient
    public Collection<Zprivilage> getZprivilageCollection1() {
        return zprivilageCollection1;
    }

    public void setZprivilageCollection1(Collection<Zprivilage> zprivilageCollection1) {
        this.zprivilageCollection1 = zprivilageCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdoctabelid != null ? zdoctabelid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdoctabel)) {
            return false;
        }
        Zdoctabel other = (Zdoctabel) object;
        if ((this.zdoctabelid == null && other.zdoctabelid != null) || (this.zdoctabelid != null && !this.zdoctabelid.equals(other.zdoctabelid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zdoctabel[ zdoctabelid=" + zdoctabelid + " ]";
    }
    
}
