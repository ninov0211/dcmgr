/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author dinov
 */
@Embeddable
public class ZdocperubahanZdocPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOCCOLLECTION_ZDOCID", nullable = false)
    private long zdoccollectionZdocid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOCPERUBAHANCOLLECTION_ZDOCPERUBAHANID", nullable = false)
    private long zdocperubahancollectionZdocperubahanid;

    public ZdocperubahanZdocPK() {
    }

    public ZdocperubahanZdocPK(long zdoccollectionZdocid, long zdocperubahancollectionZdocperubahanid) {
        this.zdoccollectionZdocid = zdoccollectionZdocid;
        this.zdocperubahancollectionZdocperubahanid = zdocperubahancollectionZdocperubahanid;
    }

    public long getZdoccollectionZdocid() {
        return zdoccollectionZdocid;
    }

    public void setZdoccollectionZdocid(long zdoccollectionZdocid) {
        this.zdoccollectionZdocid = zdoccollectionZdocid;
    }

    public long getZdocperubahancollectionZdocperubahanid() {
        return zdocperubahancollectionZdocperubahanid;
    }

    public void setZdocperubahancollectionZdocperubahanid(long zdocperubahancollectionZdocperubahanid) {
        this.zdocperubahancollectionZdocperubahanid = zdocperubahancollectionZdocperubahanid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) zdoccollectionZdocid;
        hash += (int) zdocperubahancollectionZdocperubahanid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZdocperubahanZdocPK)) {
            return false;
        }
        ZdocperubahanZdocPK other = (ZdocperubahanZdocPK) object;
        if (this.zdoccollectionZdocid != other.zdoccollectionZdocid) {
            return false;
        }
        if (this.zdocperubahancollectionZdocperubahanid != other.zdocperubahancollectionZdocperubahanid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZdocperubahanZdocPK[ zdoccollectionZdocid=" + zdoccollectionZdocid + ", zdocperubahancollectionZdocperubahanid=" + zdocperubahancollectionZdocperubahanid + " ]";
    }
    
}
