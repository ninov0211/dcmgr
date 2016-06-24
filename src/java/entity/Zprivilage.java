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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZPRIVILAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zprivilage.findAll", query = "SELECT z FROM Zprivilage z"),
    @NamedQuery(name = "Zprivilage.findByZprivilageid", query = "SELECT z FROM Zprivilage z WHERE z.zprivilageid = :zprivilageid"),
    @NamedQuery(name = "Zprivilage.findByCreatedoc", query = "SELECT z FROM Zprivilage z WHERE z.createdoc = :createdoc"),
    @NamedQuery(name = "Zprivilage.findByDeletedoc", query = "SELECT z FROM Zprivilage z WHERE z.deletedoc = :deletedoc"),
    @NamedQuery(name = "Zprivilage.findByMaxprint", query = "SELECT z FROM Zprivilage z WHERE z.maxprint = :maxprint"),
    @NamedQuery(name = "Zprivilage.findByName", query = "SELECT z FROM Zprivilage z WHERE z.name = :name"),
    @NamedQuery(name = "Zprivilage.findByUpdatedoc", query = "SELECT z FROM Zprivilage z WHERE z.updatedoc = :updatedoc"),
    @NamedQuery(name = "Zprivilage.findByViewdoc", query = "SELECT z FROM Zprivilage z WHERE z.viewdoc = :viewdoc"),
    @NamedQuery(name = "Zprivilage.findByZprint", query = "SELECT z FROM Zprivilage z WHERE z.zprint = :zprint")})
public class Zprivilage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZPRIVILAGEID", nullable = false)
    private Integer zprivilageid;
    @Column(name = "CREATEDOC")
    private Short createdoc;
    @Column(name = "DELETEDOC")
    private Short deletedoc;
    @Column(name = "MAXPRINT")
    private Short maxprint;
    @Size(max = 255)
    @Column(name = "NAME", length = 255)
    private String name;
    @Column(name = "UPDATEDOC")
    private Short updatedoc;
    @Column(name = "VIEWDOC")
    private Short viewdoc;
    @Column(name = "ZPRINT")
    private Short zprint;
    @JoinColumn(name = "ZDOCTABELID1", referencedColumnName = "ZDOCTABELID")
    @ManyToOne
    private Zdoctabel zdoctabelid1;
    @JoinColumn(name = "ZDOCTABEL_ZDOCTABELID", referencedColumnName = "ZDOCTABELID")
    @ManyToOne
    private Zdoctabel zdoctabelZdoctabelid;
    @JoinColumn(name = "ZUSERID1", referencedColumnName = "ZUSERID")
    @ManyToOne
    private Zuser zuserid1;
    @JoinColumn(name = "ZUSER_ZUSERID", referencedColumnName = "ZUSERID")
    @ManyToOne
    private Zuser zuserZuserid;

    public Zprivilage() {
    }

    public Zprivilage(Integer zprivilageid) {
        this.zprivilageid = zprivilageid;
    }

    public Integer getZprivilageid() {
        return zprivilageid;
    }

    public void setZprivilageid(Integer zprivilageid) {
        this.zprivilageid = zprivilageid;
    }

    public Short getCreatedoc() {
        return createdoc;
    }

    public void setCreatedoc(Short createdoc) {
        this.createdoc = createdoc;
    }

    public Short getDeletedoc() {
        return deletedoc;
    }

    public void setDeletedoc(Short deletedoc) {
        this.deletedoc = deletedoc;
    }

    public Short getMaxprint() {
        return maxprint;
    }

    public void setMaxprint(Short maxprint) {
        this.maxprint = maxprint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getUpdatedoc() {
        return updatedoc;
    }

    public void setUpdatedoc(Short updatedoc) {
        this.updatedoc = updatedoc;
    }

    public Short getViewdoc() {
        return viewdoc;
    }

    public void setViewdoc(Short viewdoc) {
        this.viewdoc = viewdoc;
    }

    public Short getZprint() {
        return zprint;
    }

    public void setZprint(Short zprint) {
        this.zprint = zprint;
    }

    public Zdoctabel getZdoctabelid1() {
        return zdoctabelid1;
    }

    public void setZdoctabelid1(Zdoctabel zdoctabelid1) {
        this.zdoctabelid1 = zdoctabelid1;
    }

    public Zdoctabel getZdoctabelZdoctabelid() {
        return zdoctabelZdoctabelid;
    }

    public void setZdoctabelZdoctabelid(Zdoctabel zdoctabelZdoctabelid) {
        this.zdoctabelZdoctabelid = zdoctabelZdoctabelid;
    }

    public Zuser getZuserid1() {
        return zuserid1;
    }

    public void setZuserid1(Zuser zuserid1) {
        this.zuserid1 = zuserid1;
    }

    public Zuser getZuserZuserid() {
        return zuserZuserid;
    }

    public void setZuserZuserid(Zuser zuserZuserid) {
        this.zuserZuserid = zuserZuserid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zprivilageid != null ? zprivilageid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zprivilage)) {
            return false;
        }
        Zprivilage other = (Zprivilage) object;
        if ((this.zprivilageid == null && other.zprivilageid != null) || (this.zprivilageid != null && !this.zprivilageid.equals(other.zprivilageid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zprivilage[ zprivilageid=" + zprivilageid + " ]";
    }
    
}
