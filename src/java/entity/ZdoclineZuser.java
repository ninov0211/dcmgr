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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZDOCLINE_ZUSER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZdoclineZuser.findAll", query = "SELECT z FROM ZdoclineZuser z"),
    @NamedQuery(name = "ZdoclineZuser.findByZdoclineZdocLineId", query = "SELECT z FROM ZdoclineZuser z WHERE z.zdoclineZdocLineId = :zdoclineZdocLineId")})
public class ZdoclineZuser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOCLINE_ZDOC_LINE_ID", nullable = false)
    private Integer zdoclineZdocLineId;
    @JoinColumn(name = "ZUSERS_ZUSERID", referencedColumnName = "ZUSERID")
    @ManyToOne
    private Zuser zusersZuserid;

    public ZdoclineZuser() {
    }

    public ZdoclineZuser(Integer zdoclineZdocLineId) {
        this.zdoclineZdocLineId = zdoclineZdocLineId;
    }

    public Integer getZdoclineZdocLineId() {
        return zdoclineZdocLineId;
    }

    public void setZdoclineZdocLineId(Integer zdoclineZdocLineId) {
        this.zdoclineZdocLineId = zdoclineZdocLineId;
    }

    public Zuser getZusersZuserid() {
        return zusersZuserid;
    }

    public void setZusersZuserid(Zuser zusersZuserid) {
        this.zusersZuserid = zusersZuserid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdoclineZdocLineId != null ? zdoclineZdocLineId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZdoclineZuser)) {
            return false;
        }
        ZdoclineZuser other = (ZdoclineZuser) object;
        if ((this.zdoclineZdocLineId == null && other.zdoclineZdocLineId != null) || (this.zdoclineZdocLineId != null && !this.zdoclineZdocLineId.equals(other.zdoclineZdocLineId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZdoclineZuser[ zdoclineZdocLineId=" + zdoclineZdocLineId + " ]";
    }
    
}
