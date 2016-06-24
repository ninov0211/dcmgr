/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZDOCPERUBAHAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdocperubahan.findAll", query = "SELECT z FROM Zdocperubahan z"),
    @NamedQuery(name = "Zdocperubahan.findByZdocperubahanid", query = "SELECT z FROM Zdocperubahan z WHERE z.zdocperubahanid = :zdocperubahanid"),
    @NamedQuery(name = "Zdocperubahan.findByMenjadi", query = "SELECT z FROM Zdocperubahan z WHERE z.menjadi = :menjadi"),
    @NamedQuery(name = "Zdocperubahan.findByName", query = "SELECT z FROM Zdocperubahan z WHERE z.name = :name"),
    @NamedQuery(name = "Zdocperubahan.findByYangdiubah", query = "SELECT z FROM Zdocperubahan z WHERE z.yangdiubah = :yangdiubah"),
    @NamedQuery(name = "Zdocperubahan.findByZdocid", query = "SELECT z FROM Zdocperubahan z WHERE z.zdocid = :zdocid")})
public class Zdocperubahan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOCPERUBAHANID", nullable = false)
    private Long zdocperubahanid;
    @Size(max = 255)
    @Column(name = "MENJADI", length = 255)
    private String menjadi;
    @Size(max = 255)
    @Column(name = "NAME", length = 255)
    private String name;
    @Size(max = 255)
    @Column(name = "YANGDIUBAH", length = 255)
    private String yangdiubah;
    @Column(name = "ZDOCID")
    private BigInteger zdocid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zdocperubahan")
    private Collection<ZdocperubahanZdoc> zdocperubahanZdocCollection;

    public Zdocperubahan() {
    }

    public Zdocperubahan(Long zdocperubahanid) {
        this.zdocperubahanid = zdocperubahanid;
    }

    public Long getZdocperubahanid() {
        return zdocperubahanid;
    }

    public void setZdocperubahanid(Long zdocperubahanid) {
        this.zdocperubahanid = zdocperubahanid;
    }

    public String getMenjadi() {
        return menjadi;
    }

    public void setMenjadi(String menjadi) {
        this.menjadi = menjadi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYangdiubah() {
        return yangdiubah;
    }

    public void setYangdiubah(String yangdiubah) {
        this.yangdiubah = yangdiubah;
    }

    public BigInteger getZdocid() {
        return zdocid;
    }

    public void setZdocid(BigInteger zdocid) {
        this.zdocid = zdocid;
    }

    @XmlTransient
    public Collection<ZdocperubahanZdoc> getZdocperubahanZdocCollection() {
        return zdocperubahanZdocCollection;
    }

    public void setZdocperubahanZdocCollection(Collection<ZdocperubahanZdoc> zdocperubahanZdocCollection) {
        this.zdocperubahanZdocCollection = zdocperubahanZdocCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdocperubahanid != null ? zdocperubahanid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdocperubahan)) {
            return false;
        }
        Zdocperubahan other = (Zdocperubahan) object;
        if ((this.zdocperubahanid == null && other.zdocperubahanid != null) || (this.zdocperubahanid != null && !this.zdocperubahanid.equals(other.zdocperubahanid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zdocperubahan[ zdocperubahanid=" + zdocperubahanid + " ]";
    }
    
}
