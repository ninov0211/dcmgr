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
public class ZdoclineZdocPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOCLINECOLLECTION_ZDOC_LINE_ID", nullable = false)
    private int zdoclinecollectionZdocLineId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOCCOLLECTION_ZDOCID", nullable = false)
    private long zdoccollectionZdocid;

    public ZdoclineZdocPK() {
    }

    public ZdoclineZdocPK(int zdoclinecollectionZdocLineId, long zdoccollectionZdocid) {
        this.zdoclinecollectionZdocLineId = zdoclinecollectionZdocLineId;
        this.zdoccollectionZdocid = zdoccollectionZdocid;
    }

    public int getZdoclinecollectionZdocLineId() {
        return zdoclinecollectionZdocLineId;
    }

    public void setZdoclinecollectionZdocLineId(int zdoclinecollectionZdocLineId) {
        this.zdoclinecollectionZdocLineId = zdoclinecollectionZdocLineId;
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
        hash += (int) zdoclinecollectionZdocLineId;
        hash += (int) zdoccollectionZdocid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZdoclineZdocPK)) {
            return false;
        }
        ZdoclineZdocPK other = (ZdoclineZdocPK) object;
        if (this.zdoclinecollectionZdocLineId != other.zdoclinecollectionZdocLineId) {
            return false;
        }
        if (this.zdoccollectionZdocid != other.zdoccollectionZdocid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZdoclineZdocPK[ zdoclinecollectionZdocLineId=" + zdoclinecollectionZdocLineId + ", zdoccollectionZdocid=" + zdoccollectionZdocid + " ]";
    }
    
}
