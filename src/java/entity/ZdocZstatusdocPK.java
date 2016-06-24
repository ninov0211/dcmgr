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
public class ZdocZstatusdocPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ZSTATUSDOCS_ZSTATUSDOCID", nullable = false)
    private int zstatusdocsZstatusdocid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOC_ZDOCID", nullable = false)
    private long zdocZdocid;

    public ZdocZstatusdocPK() {
    }

    public ZdocZstatusdocPK(int zstatusdocsZstatusdocid, long zdocZdocid) {
        this.zstatusdocsZstatusdocid = zstatusdocsZstatusdocid;
        this.zdocZdocid = zdocZdocid;
    }

    public int getZstatusdocsZstatusdocid() {
        return zstatusdocsZstatusdocid;
    }

    public void setZstatusdocsZstatusdocid(int zstatusdocsZstatusdocid) {
        this.zstatusdocsZstatusdocid = zstatusdocsZstatusdocid;
    }

    public long getZdocZdocid() {
        return zdocZdocid;
    }

    public void setZdocZdocid(long zdocZdocid) {
        this.zdocZdocid = zdocZdocid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) zstatusdocsZstatusdocid;
        hash += (int) zdocZdocid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZdocZstatusdocPK)) {
            return false;
        }
        ZdocZstatusdocPK other = (ZdocZstatusdocPK) object;
        if (this.zstatusdocsZstatusdocid != other.zstatusdocsZstatusdocid) {
            return false;
        }
        if (this.zdocZdocid != other.zdocZdocid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZdocZstatusdocPK[ zstatusdocsZstatusdocid=" + zstatusdocsZstatusdocid + ", zdocZdocid=" + zdocZdocid + " ]";
    }
    
}
