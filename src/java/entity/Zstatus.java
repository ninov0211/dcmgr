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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "ZSTATUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zstatus.findAll", query = "SELECT z FROM Zstatus z"),
    @NamedQuery(name = "Zstatus.findByZstatusId", query = "SELECT z FROM Zstatus z WHERE z.zstatusId = :zstatusId"),
    @NamedQuery(name = "Zstatus.findByDescript", query = "SELECT z FROM Zstatus z WHERE z.descript = :descript"),
    @NamedQuery(name = "Zstatus.findByName", query = "SELECT z FROM Zstatus z WHERE z.name = :name")})
public class Zstatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZSTATUS_ID", nullable = false)
    private Integer zstatusId;
    @Size(max = 255)
    @Column(name = "DESCRIPT", length = 255)
    private String descript;
    @Size(max = 255)
    @Column(name = "NAME", length = 255)
    private String name;
    @ManyToMany(mappedBy = "zstatusCollection")
    private Collection<Zdocline> zdoclineCollection;

    public Zstatus() {
    }

    public Zstatus(Integer zstatusId) {
        this.zstatusId = zstatusId;
    }

    public Integer getZstatusId() {
        return zstatusId;
    }

    public void setZstatusId(Integer zstatusId) {
        this.zstatusId = zstatusId;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Zdocline> getZdoclineCollection() {
        return zdoclineCollection;
    }

    public void setZdoclineCollection(Collection<Zdocline> zdoclineCollection) {
        this.zdoclineCollection = zdoclineCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zstatusId != null ? zstatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zstatus)) {
            return false;
        }
        Zstatus other = (Zstatus) object;
        if ((this.zstatusId == null && other.zstatusId != null) || (this.zstatusId != null && !this.zstatusId.equals(other.zstatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zstatus[ zstatusId=" + zstatusId + " ]";
    }
    
}
