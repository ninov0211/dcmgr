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
public class ZstatusdocZdocPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ZSTATUSDOCCOLLECTION_ZSTATUSDOCID", nullable = false)
    private int zstatusdoccollectionZstatusdocid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOCCOLLECTION_ZDOCID", nullable = false)
    private long zdoccollectionZdocid;

    public ZstatusdocZdocPK() {
    }

    public ZstatusdocZdocPK(int zstatusdoccollectionZstatusdocid, long zdoccollectionZdocid) {
        this.zstatusdoccollectionZstatusdocid = zstatusdoccollectionZstatusdocid;
        this.zdoccollectionZdocid = zdoccollectionZdocid;
    }

    public int getZstatusdoccollectionZstatusdocid() {
        return zstatusdoccollectionZstatusdocid;
    }

    public void setZstatusdoccollectionZstatusdocid(int zstatusdoccollectionZstatusdocid) {
        this.zstatusdoccollectionZstatusdocid = zstatusdoccollectionZstatusdocid;
    }

    public long getZdoccollectionZdocid() {
        return zdoccollectionZdocid;
    }

    public void setZdoccollectionZdocid(long zdoccollectionZdocid) {
        this.zdoccollectionZdocid = zdoccollectionZdocid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) zstatusdoccollectionZstatusdocid;
        hash += (int) zdoccollectionZdocid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZstatusdocZdocPK)) {
            return false;
        }
        ZstatusdocZdocPK other = (ZstatusdocZdocPK) object;
        if (this.zstatusdoccollectionZstatusdocid != other.zstatusdoccollectionZstatusdocid) {
            return false;
        }
        if (this.zdoccollectionZdocid != other.zdoccollectionZdocid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZstatusdocZdocPK[ zstatusdoccollectionZstatusdocid=" + zstatusdoccollectionZstatusdocid + ", zdoccollectionZdocid=" + zdoccollectionZdocid + " ]";
    }
    
}
