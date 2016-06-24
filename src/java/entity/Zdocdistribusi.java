/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZDOCDISTRIBUSI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdocdistribusi.findAll", query = "SELECT z FROM Zdocdistribusi z"),
    @NamedQuery(name = "Zdocdistribusi.findByZdocdistribusiid", query = "SELECT z FROM Zdocdistribusi z WHERE z.zdocdistribusiid = :zdocdistribusiid"),
    @NamedQuery(name = "Zdocdistribusi.findByName", query = "SELECT z FROM Zdocdistribusi z WHERE z.name = :name"),
    @NamedQuery(name = "Zdocdistribusi.findByTgldistribusi", query = "SELECT z FROM Zdocdistribusi z WHERE z.tgldistribusi = :tgldistribusi"),
    @NamedQuery(name = "Zdocdistribusi.findByZaccept", query = "SELECT z FROM Zdocdistribusi z WHERE z.zaccept = :zaccept"),
    @NamedQuery(name = "Zdocdistribusi.findByZdocid", query = "SELECT z FROM Zdocdistribusi z WHERE z.zdocid = :zdocid")})
public class Zdocdistribusi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ZDOCDISTRIBUSIID", nullable = false)
    private Long zdocdistribusiid;
    @Size(max = 255)
    @Column(name = "NAME", length = 255)
    private String name;
    @Column(name = "TGLDISTRIBUSI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tgldistribusi;
    @Column(name = "ZACCEPT")
    private Short zaccept;
    @Column(name = "ZDOCID")
    private BigInteger zdocid;
    @JoinColumn(name = "ZUSERID", referencedColumnName = "ZUSERID")
    @ManyToOne
    private Zuser zuserid;

    public Zdocdistribusi() {
    }

    public Zdocdistribusi(Long zdocdistribusiid) {
        this.zdocdistribusiid = zdocdistribusiid;
    }

    public Long getZdocdistribusiid() {
        return zdocdistribusiid;
    }

    public void setZdocdistribusiid(Long zdocdistribusiid) {
        this.zdocdistribusiid = zdocdistribusiid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTgldistribusi() {
        return tgldistribusi;
    }

    public void setTgldistribusi(Date tgldistribusi) {
        this.tgldistribusi = tgldistribusi;
    }

    public Short getZaccept() {
        return zaccept;
    }

    public void setZaccept(Short zaccept) {
        this.zaccept = zaccept;
    }

    public BigInteger getZdocid() {
        return zdocid;
    }

    public void setZdocid(BigInteger zdocid) {
        this.zdocid = zdocid;
    }

    public Zuser getZuserid() {
        return zuserid;
    }

    public void setZuserid(Zuser zuserid) {
        this.zuserid = zuserid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdocdistribusiid != null ? zdocdistribusiid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdocdistribusi)) {
            return false;
        }
        Zdocdistribusi other = (Zdocdistribusi) object;
        if ((this.zdocdistribusiid == null && other.zdocdistribusiid != null) || (this.zdocdistribusiid != null && !this.zdocdistribusiid.equals(other.zdocdistribusiid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zdocdistribusi[ zdocdistribusiid=" + zdocdistribusiid + " ]";
    }
    
}
