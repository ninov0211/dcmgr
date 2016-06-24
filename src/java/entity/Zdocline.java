/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZDOCLINE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdocline.findAll", query = "SELECT z FROM Zdocline z"),
    @NamedQuery(name = "Zdocline.findByZdocLineId", query = "SELECT z FROM Zdocline z WHERE z.zdocLineId = :zdocLineId"),
    @NamedQuery(name = "Zdocline.findByAlasan", query = "SELECT z FROM Zdocline z WHERE z.alasan = :alasan"),
    @NamedQuery(name = "Zdocline.findByRespondApprove", query = "SELECT z FROM Zdocline z WHERE z.respondApprove = :respondApprove"),
    @NamedQuery(name = "Zdocline.findByTglApproval", query = "SELECT z FROM Zdocline z WHERE z.tglApproval = :tglApproval"),
    @NamedQuery(name = "Zdocline.findByTglRespon", query = "SELECT z FROM Zdocline z WHERE z.tglRespon = :tglRespon"),
    @NamedQuery(name = "Zdocline.findByZstatususerid", query = "SELECT z FROM Zdocline z WHERE z.zstatususerid = :zstatususerid"),
    @NamedQuery(name = "Zdocline.findByZuserid", query = "SELECT z FROM Zdocline z WHERE z.zuserid = :zuserid")})
public class Zdocline implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOC_LINE_ID", nullable = false)
    private Integer zdocLineId;
    @Size(max = 255)
    @Column(name = "ALASAN", length = 255)
    private String alasan;
    @Column(name = "RESPOND_APPROVE")
    private Short respondApprove;
    @Column(name = "TGL_APPROVAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglApproval;
    @Column(name = "TGL_RESPON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglRespon;
    @Column(name = "ZSTATUSUSERID")
    private Integer zstatususerid;
    @Column(name = "ZUSERID")
    private Integer zuserid;
    @JoinTable(name = "ZDOCLINE_ZSTATUS", joinColumns = {
        @JoinColumn(name = "ZDOCLINE_ZDOC_LINE_ID", referencedColumnName = "ZDOC_LINE_ID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "ZSTATUSUSERS_ZSTATUS_ID", referencedColumnName = "ZSTATUS_ID", nullable = false)})
    @ManyToMany
    private Collection<Zstatus> zstatusCollection;
    @JoinColumn(name = "ZDOCID", referencedColumnName = "ZDOCID")
    @ManyToOne
    private Zdoc zdocid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zdocline")
    private Collection<ZdoclineZdoc> zdoclineZdocCollection;

    public Zdocline() {
    }

    public Zdocline(Integer zdocLineId) {
        this.zdocLineId = zdocLineId;
    }

    public Integer getZdocLineId() {
        return zdocLineId;
    }

    public void setZdocLineId(Integer zdocLineId) {
        this.zdocLineId = zdocLineId;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public Short getRespondApprove() {
        return respondApprove;
    }

    public void setRespondApprove(Short respondApprove) {
        this.respondApprove = respondApprove;
    }

    public Date getTglApproval() {
        return tglApproval;
    }

    public void setTglApproval(Date tglApproval) {
        this.tglApproval = tglApproval;
    }

    public Date getTglRespon() {
        return tglRespon;
    }

    public void setTglRespon(Date tglRespon) {
        this.tglRespon = tglRespon;
    }

    public Integer getZstatususerid() {
        return zstatususerid;
    }

    public void setZstatususerid(Integer zstatususerid) {
        this.zstatususerid = zstatususerid;
    }

    public Integer getZuserid() {
        return zuserid;
    }

    public void setZuserid(Integer zuserid) {
        this.zuserid = zuserid;
    }

    @XmlTransient
    public Collection<Zstatus> getZstatusCollection() {
        return zstatusCollection;
    }

    public void setZstatusCollection(Collection<Zstatus> zstatusCollection) {
        this.zstatusCollection = zstatusCollection;
    }

    public Zdoc getZdocid() {
        return zdocid;
    }

    public void setZdocid(Zdoc zdocid) {
        this.zdocid = zdocid;
    }

    @XmlTransient
    public Collection<ZdoclineZdoc> getZdoclineZdocCollection() {
        return zdoclineZdocCollection;
    }

    public void setZdoclineZdocCollection(Collection<ZdoclineZdoc> zdoclineZdocCollection) {
        this.zdoclineZdocCollection = zdoclineZdocCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdocLineId != null ? zdocLineId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdocline)) {
            return false;
        }
        Zdocline other = (Zdocline) object;
        if ((this.zdocLineId == null && other.zdocLineId != null) || (this.zdocLineId != null && !this.zdocLineId.equals(other.zdocLineId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zdocline[ zdocLineId=" + zdocLineId + " ]";
    }
    
}
