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
@Table(name = "ZDOCLINE_ZDOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZdoclineZdoc.findAll", query = "SELECT z FROM ZdoclineZdoc z"),
    @NamedQuery(name = "ZdoclineZdoc.findByZdoclinecollectionZdocLineId", query = "SELECT z FROM ZdoclineZdoc z WHERE z.zdoclineZdocPK.zdoclinecollectionZdocLineId = :zdoclinecollectionZdocLineId"),
    @NamedQuery(name = "ZdoclineZdoc.findByZdoccollectionZdocid", query = "SELECT z FROM ZdoclineZdoc z WHERE z.zdoclineZdocPK.zdoccollectionZdocid = :zdoccollectionZdocid")})
public class ZdoclineZdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ZdoclineZdocPK zdoclineZdocPK;
    @JoinColumn(name = "ZDOCLINECOLLECTION_ZDOC_LINE_ID", referencedColumnName = "ZDOC_LINE_ID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Zdocline zdocline;

    public ZdoclineZdoc() {
    }

    public ZdoclineZdoc(ZdoclineZdocPK zdoclineZdocPK) {
        this.zdoclineZdocPK = zdoclineZdocPK;
    }

    public ZdoclineZdoc(int zdoclinecollectionZdocLineId, long zdoccollectionZdocid) {
        this.zdoclineZdocPK = new ZdoclineZdocPK(zdoclinecollectionZdocLineId, zdoccollectionZdocid);
    }

    public ZdoclineZdocPK getZdoclineZdocPK() {
        return zdoclineZdocPK;
    }

    public void setZdoclineZdocPK(ZdoclineZdocPK zdoclineZdocPK) {
        this.zdoclineZdocPK = zdoclineZdocPK;
    }

    public Zdocline getZdocline() {
        return zdocline;
    }

    public void setZdocline(Zdocline zdocline) {
        this.zdocline = zdocline;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdoclineZdocPK != null ? zdoclineZdocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZdoclineZdoc)) {
            return false;
        }
        ZdoclineZdoc other = (ZdoclineZdoc) object;
        if ((this.zdoclineZdocPK == null && other.zdoclineZdocPK != null) || (this.zdoclineZdocPK != null && !this.zdoclineZdocPK.equals(other.zdoclineZdocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZdoclineZdoc[ zdoclineZdocPK=" + zdoclineZdocPK + " ]";
    }
    
}
