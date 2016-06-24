/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZSTATUSDOC_ZDOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZstatusdocZdoc.findAll", query = "SELECT z FROM ZstatusdocZdoc z"),
    @NamedQuery(name = "ZstatusdocZdoc.findByZstatusdoccollectionZstatusdocid", query = "SELECT z FROM ZstatusdocZdoc z WHERE z.zstatusdocZdocPK.zstatusdoccollectionZstatusdocid = :zstatusdoccollectionZstatusdocid"),
    @NamedQuery(name = "ZstatusdocZdoc.findByZdoccollectionZdocid", query = "SELECT z FROM ZstatusdocZdoc z WHERE z.zstatusdocZdocPK.zdoccollectionZdocid = :zdoccollectionZdocid")})
public class ZstatusdocZdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ZstatusdocZdocPK zstatusdocZdocPK;
    @JoinColumn(name = "ZSTATUSDOCCOLLECTION_ZSTATUSDOCID", referencedColumnName = "ZSTATUSDOCID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Zstatusdoc zstatusdoc;

    public ZstatusdocZdoc() {
    }

    public ZstatusdocZdoc(ZstatusdocZdocPK zstatusdocZdocPK) {
        this.zstatusdocZdocPK = zstatusdocZdocPK;
    }

    public ZstatusdocZdoc(int zstatusdoccollectionZstatusdocid, long zdoccollectionZdocid) {
        this.zstatusdocZdocPK = new ZstatusdocZdocPK(zstatusdoccollectionZstatusdocid, zdoccollectionZdocid);
    }

    public ZstatusdocZdocPK getZstatusdocZdocPK() {
        return zstatusdocZdocPK;
    }

    public void setZstatusdocZdocPK(ZstatusdocZdocPK zstatusdocZdocPK) {
        this.zstatusdocZdocPK = zstatusdocZdocPK;
    }

    public Zstatusdoc getZstatusdoc() {
        return zstatusdoc;
    }

    public void setZstatusdoc(Zstatusdoc zstatusdoc) {
        this.zstatusdoc = zstatusdoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zstatusdocZdocPK != null ? zstatusdocZdocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZstatusdocZdoc)) {
            return false;
        }
        ZstatusdocZdoc other = (ZstatusdocZdoc) object;
        if ((this.zstatusdocZdocPK == null && other.zstatusdocZdocPK != null) || (this.zstatusdocZdocPK != null && !this.zstatusdocZdocPK.equals(other.zstatusdocZdocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZstatusdocZdoc[ zstatusdocZdocPK=" + zstatusdocZdocPK + " ]";
    }
    
}
