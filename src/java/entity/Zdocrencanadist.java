/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZDOCRENCANADIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdocrencanadist.findAll", query = "SELECT z FROM Zdocrencanadist z"),
    @NamedQuery(name = "Zdocrencanadist.findByZdocrencanadistid", query = "SELECT z FROM Zdocrencanadist z WHERE z.zdocrencanadistid = :zdocrencanadistid"),
    @NamedQuery(name = "Zdocrencanadist.findByZdocid", query = "SELECT z FROM Zdocrencanadist z WHERE z.zdocid = :zdocid")})
public class Zdocrencanadist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOCRENCANADISTID", nullable = false)
    private Long zdocrencanadistid;
    @Column(name = "ZDOCID")
    private BigInteger zdocid;
    @JoinColumn(name = "ZUSER_ID", referencedColumnName = "ZUSERID")
    @ManyToOne
    private Zuser zuserId;

    public Zdocrencanadist() {
    }

    public Zdocrencanadist(Long zdocrencanadistid) {
        this.zdocrencanadistid = zdocrencanadistid;
    }

    public Long getZdocrencanadistid() {
        return zdocrencanadistid;
    }

    public void setZdocrencanadistid(Long zdocrencanadistid) {
        this.zdocrencanadistid = zdocrencanadistid;
    }

    public BigInteger getZdocid() {
        return zdocid;
    }

    public void setZdocid(BigInteger zdocid) {
        this.zdocid = zdocid;
    }

    public Zuser getZuserId() {
        return zuserId;
    }

    public void setZuserId(Zuser zuserId) {
        this.zuserId = zuserId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdocrencanadistid != null ? zdocrencanadistid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdocrencanadist)) {
            return false;
        }
        Zdocrencanadist other = (Zdocrencanadist) object;
        if ((this.zdocrencanadistid == null && other.zdocrencanadistid != null) || (this.zdocrencanadistid != null && !this.zdocrencanadistid.equals(other.zdocrencanadistid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zdocrencanadist[ zdocrencanadistid=" + zdocrencanadistid + " ]";
    }
    
}
