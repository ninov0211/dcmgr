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
@Table(name = "ZDOCPERUBAHAN_ZDOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZdocperubahanZdoc.findAll", query = "SELECT z FROM ZdocperubahanZdoc z"),
    @NamedQuery(name = "ZdocperubahanZdoc.findByZdoccollectionZdocid", query = "SELECT z FROM ZdocperubahanZdoc z WHERE z.zdocperubahanZdocPK.zdoccollectionZdocid = :zdoccollectionZdocid"),
    @NamedQuery(name = "ZdocperubahanZdoc.findByZdocperubahancollectionZdocperubahanid", query = "SELECT z FROM ZdocperubahanZdoc z WHERE z.zdocperubahanZdocPK.zdocperubahancollectionZdocperubahanid = :zdocperubahancollectionZdocperubahanid")})
public class ZdocperubahanZdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ZdocperubahanZdocPK zdocperubahanZdocPK;
    @JoinColumn(name = "ZDOCPERUBAHANCOLLECTION_ZDOCPERUBAHANID", referencedColumnName = "ZDOCPERUBAHANID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Zdocperubahan zdocperubahan;

    public ZdocperubahanZdoc() {
    }

    public ZdocperubahanZdoc(ZdocperubahanZdocPK zdocperubahanZdocPK) {
        this.zdocperubahanZdocPK = zdocperubahanZdocPK;
    }

    public ZdocperubahanZdoc(long zdoccollectionZdocid, long zdocperubahancollectionZdocperubahanid) {
        this.zdocperubahanZdocPK = new ZdocperubahanZdocPK(zdoccollectionZdocid, zdocperubahancollectionZdocperubahanid);
    }

    public ZdocperubahanZdocPK getZdocperubahanZdocPK() {
        return zdocperubahanZdocPK;
    }

    public void setZdocperubahanZdocPK(ZdocperubahanZdocPK zdocperubahanZdocPK) {
        this.zdocperubahanZdocPK = zdocperubahanZdocPK;
    }

    public Zdocperubahan getZdocperubahan() {
        return zdocperubahan;
    }

    public void setZdocperubahan(Zdocperubahan zdocperubahan) {
        this.zdocperubahan = zdocperubahan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdocperubahanZdocPK != null ? zdocperubahanZdocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZdocperubahanZdoc)) {
            return false;
        }
        ZdocperubahanZdoc other = (ZdocperubahanZdoc) object;
        if ((this.zdocperubahanZdocPK == null && other.zdocperubahanZdocPK != null) || (this.zdocperubahanZdocPK != null && !this.zdocperubahanZdocPK.equals(other.zdocperubahanZdocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZdocperubahanZdoc[ zdocperubahanZdocPK=" + zdocperubahanZdocPK + " ]";
    }
    
}
