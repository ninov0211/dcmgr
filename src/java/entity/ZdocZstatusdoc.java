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
@Table(name = "ZDOC_ZSTATUSDOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZdocZstatusdoc.findAll", query = "SELECT z FROM ZdocZstatusdoc z"),
    @NamedQuery(name = "ZdocZstatusdoc.findByZstatusdocsZstatusdocid", query = "SELECT z FROM ZdocZstatusdoc z WHERE z.zdocZstatusdocPK.zstatusdocsZstatusdocid = :zstatusdocsZstatusdocid"),
    @NamedQuery(name = "ZdocZstatusdoc.findByZdocZdocid", query = "SELECT z FROM ZdocZstatusdoc z WHERE z.zdocZstatusdocPK.zdocZdocid = :zdocZdocid")})
public class ZdocZstatusdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ZdocZstatusdocPK zdocZstatusdocPK;
    @JoinColumn(name = "ZSTATUSDOCS_ZSTATUSDOCID", referencedColumnName = "ZSTATUSDOCID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Zstatusdoc zstatusdoc;

    public ZdocZstatusdoc() {
    }

    public ZdocZstatusdoc(ZdocZstatusdocPK zdocZstatusdocPK) {
        this.zdocZstatusdocPK = zdocZstatusdocPK;
    }

    public ZdocZstatusdoc(int zstatusdocsZstatusdocid, long zdocZdocid) {
        this.zdocZstatusdocPK = new ZdocZstatusdocPK(zstatusdocsZstatusdocid, zdocZdocid);
    }

    public ZdocZstatusdocPK getZdocZstatusdocPK() {
        return zdocZstatusdocPK;
    }

    public void setZdocZstatusdocPK(ZdocZstatusdocPK zdocZstatusdocPK) {
        this.zdocZstatusdocPK = zdocZstatusdocPK;
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
        hash += (zdocZstatusdocPK != null ? zdocZstatusdocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZdocZstatusdoc)) {
            return false;
        }
        ZdocZstatusdoc other = (ZdocZstatusdoc) object;
        if ((this.zdocZstatusdocPK == null && other.zdocZstatusdocPK != null) || (this.zdocZstatusdocPK != null && !this.zdocZstatusdocPK.equals(other.zdocZstatusdocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZdocZstatusdoc[ zdocZstatusdocPK=" + zdocZstatusdocPK + " ]";
    }
    
}
