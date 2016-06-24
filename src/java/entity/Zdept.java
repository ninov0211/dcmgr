/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZDEPT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdept.findAll", query = "SELECT z FROM Zdept z"),
    @NamedQuery(name = "Zdept.findByZdepid", query = "SELECT z FROM Zdept z WHERE z.zdepid = :zdepid"),
    @NamedQuery(name = "Zdept.findByDescrip", query = "SELECT z FROM Zdept z WHERE z.descrip = :descrip"),
    @NamedQuery(name = "Zdept.findByName", query = "SELECT z FROM Zdept z WHERE z.name = :name")})
public class Zdept implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ZDEPID", nullable = false)
    private Integer zdepid;
    @Size(max = 255)
    @Column(name = "DESCRIP", length = 255)
    private String descrip;
    @Size(max = 255)
    @Column(name = "NAME", length = 255)
    private String name;

    public Zdept() {
    }

    public Zdept(Integer zdepid) {
        this.zdepid = zdepid;
    }

    public Integer getZdepid() {
        return zdepid;
    }

    public void setZdepid(Integer zdepid) {
        this.zdepid = zdepid;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdepid != null ? zdepid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdept)) {
            return false;
        }
        Zdept other = (Zdept) object;
        if ((this.zdepid == null && other.zdepid != null) || (this.zdepid != null && !this.zdepid.equals(other.zdepid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zdept[ zdepid=" + zdepid + " ]";
    }
    
}
