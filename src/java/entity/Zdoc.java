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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZDOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdoc.findAll", query = "SELECT z FROM Zdoc z"),
    @NamedQuery(name = "Zdoc.findByZdocid", query = "SELECT z FROM Zdoc z WHERE z.zdocid = :zdocid"),
    @NamedQuery(name = "Zdoc.findByAlasanpenerbitan", query = "SELECT z FROM Zdoc z WHERE z.alasanpenerbitan = :alasanpenerbitan"),
    @NamedQuery(name = "Zdoc.findByFileupload", query = "SELECT z FROM Zdoc z WHERE z.fileupload = :fileupload"),
    @NamedQuery(name = "Zdoc.findByJuduldoc", query = "SELECT z FROM Zdoc z WHERE z.juduldoc = :juduldoc"),
    @NamedQuery(name = "Zdoc.findByKeteranganperubahan", query = "SELECT z FROM Zdoc z WHERE z.keteranganperubahan = :keteranganperubahan"),
    @NamedQuery(name = "Zdoc.findByName", query = "SELECT z FROM Zdoc z WHERE z.name = :name"),
    @NamedQuery(name = "Zdoc.findByNodraft", query = "SELECT z FROM Zdoc z WHERE z.nodraft = :nodraft"),
    @NamedQuery(name = "Zdoc.findByNomordocument", query = "SELECT z FROM Zdoc z WHERE z.nomordocument = :nomordocument"),
    @NamedQuery(name = "Zdoc.findByNotadcperubahan", query = "SELECT z FROM Zdoc z WHERE z.notadcperubahan = :notadcperubahan"),
    @NamedQuery(name = "Zdoc.findByNotadcsosialisasi", query = "SELECT z FROM Zdoc z WHERE z.notadcsosialisasi = :notadcsosialisasi"),
    @NamedQuery(name = "Zdoc.findByRevisi", query = "SELECT z FROM Zdoc z WHERE z.revisi = :revisi"),
    @NamedQuery(name = "Zdoc.findByRevisinumber", query = "SELECT z FROM Zdoc z WHERE z.revisinumber = :revisinumber"),
    @NamedQuery(name = "Zdoc.findByTanggaldoc", query = "SELECT z FROM Zdoc z WHERE z.tanggaldoc = :tanggaldoc"),
    @NamedQuery(name = "Zdoc.findByTgldraft", query = "SELECT z FROM Zdoc z WHERE z.tgldraft = :tgldraft"),
    @NamedQuery(name = "Zdoc.findByTglrencanaberlaku", query = "SELECT z FROM Zdoc z WHERE z.tglrencanaberlaku = :tglrencanaberlaku"),
    @NamedQuery(name = "Zdoc.findByZactive", query = "SELECT z FROM Zdoc z WHERE z.zactive = :zactive"),
    @NamedQuery(name = "Zdoc.findByZdoctabelZdoctabelid", query = "SELECT z FROM Zdoc z WHERE z.zdoctabelZdoctabelid = :zdoctabelZdoctabelid"),
    @NamedQuery(name = "Zdoc.findByZstatusdoc", query = "SELECT z FROM Zdoc z WHERE z.zstatusdoc = :zstatusdoc"),
    @NamedQuery(name = "Zdoc.findByZurgent", query = "SELECT z FROM Zdoc z WHERE z.zurgent = :zurgent")})
public class Zdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ZDOCID", nullable = false)
    private Integer zdocid;
    @Size(max = 255)
    @Column(name = "ALASANPENERBITAN", length = 255)
    private String alasanpenerbitan;
    @Size(max = 255)
    @Column(name = "FILEUPLOAD", length = 255)
    private String fileupload;
    @Size(max = 255)
    @Column(name = "JUDULDOC", length = 255)
    private String juduldoc;
    @Size(max = 255)
    @Column(name = "KETERANGANPERUBAHAN", length = 255)
    private String keteranganperubahan;
    @Size(max = 255)
    @Column(name = "NAME", length = 255)
    private String name;
    @Size(max = 255)
    @Column(name = "NODRAFT", length = 255)
    private String nodraft;
    @Size(max = 255)
    @Column(name = "NOMORDOCUMENT", length = 255)
    private String nomordocument;
    @Size(max = 255)
    @Column(name = "NOTADCPERUBAHAN", length = 255)
    private String notadcperubahan;
    @Size(max = 255)
    @Column(name = "NOTADCSOSIALISASI", length = 255)
    private String notadcsosialisasi;
    @Size(max = 255)
    @Column(name = "REVISI", length = 255)
    private String revisi;
    @Column(name = "REVISINUMBER")
    private Short revisinumber;
    @Column(name = "TANGGALDOC")
    @Temporal(TemporalType.DATE)
    private Date tanggaldoc;
    @Column(name = "TGLDRAFT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tgldraft;
    @Column(name = "TGLRENCANABERLAKU")
    @Temporal(TemporalType.DATE)
    private Date tglrencanaberlaku;
    @Column(name = "ZACTIVE")
    private Short zactive;
    @Column(name = "ZDOCTABEL_ZDOCTABELID")
    private Integer zdoctabelZdoctabelid;
    @Column(name = "ZSTATUSDOC")
    private Integer zstatusdoc;
    @Column(name = "ZURGENT")
    private Short zurgent;
    @OneToMany(mappedBy = "zdocid")
    private Collection<Zdocline> zdoclineCollection;
    @JoinColumn(name = "ZDOCTABELID", referencedColumnName = "ZDOCTABELID")
    @ManyToOne
    private Zdoctabel zdoctabelid;
    @JoinColumn(name = "ZUSERID", referencedColumnName = "ZUSERID")
    @ManyToOne
    private Zuser zuserid;

    public Zdoc() {
    }

    public Zdoc(Integer zdocid) {
        this.zdocid = zdocid;
    }

    public Integer getZdocid() {
        return zdocid;
    }

    public void setZdocid(Integer zdocid) {
        this.zdocid = zdocid;
    }

    public String getAlasanpenerbitan() {
        return alasanpenerbitan;
    }

    public void setAlasanpenerbitan(String alasanpenerbitan) {
        this.alasanpenerbitan = alasanpenerbitan;
    }

    public String getFileupload() {
        return fileupload;
    }

    public void setFileupload(String fileupload) {
        this.fileupload = fileupload;
    }

    public String getJuduldoc() {
        return juduldoc;
    }

    public void setJuduldoc(String juduldoc) {
        this.juduldoc = juduldoc;
    }

    public String getKeteranganperubahan() {
        return keteranganperubahan;
    }

    public void setKeteranganperubahan(String keteranganperubahan) {
        this.keteranganperubahan = keteranganperubahan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNodraft() {
        return nodraft;
    }

    public void setNodraft(String nodraft) {
        this.nodraft = nodraft;
    }

    public String getNomordocument() {
        return nomordocument;
    }

    public void setNomordocument(String nomordocument) {
        this.nomordocument = nomordocument;
    }

    public String getNotadcperubahan() {
        return notadcperubahan;
    }

    public void setNotadcperubahan(String notadcperubahan) {
        this.notadcperubahan = notadcperubahan;
    }

    public String getNotadcsosialisasi() {
        return notadcsosialisasi;
    }

    public void setNotadcsosialisasi(String notadcsosialisasi) {
        this.notadcsosialisasi = notadcsosialisasi;
    }

    public String getRevisi() {
        return revisi;
    }

    public void setRevisi(String revisi) {
        this.revisi = revisi;
    }

    public Short getRevisinumber() {
        return revisinumber;
    }

    public void setRevisinumber(Short revisinumber) {
        this.revisinumber = revisinumber;
    }

    public Date getTanggaldoc() {
        return tanggaldoc;
    }

    public void setTanggaldoc(Date tanggaldoc) {
        this.tanggaldoc = tanggaldoc;
    }

    public Date getTgldraft() {
        return tgldraft;
    }

    public void setTgldraft(Date tgldraft) {
        this.tgldraft = tgldraft;
    }

    public Date getTglrencanaberlaku() {
        return tglrencanaberlaku;
    }

    public void setTglrencanaberlaku(Date tglrencanaberlaku) {
        this.tglrencanaberlaku = tglrencanaberlaku;
    }

    public Short getZactive() {
        return zactive;
    }

    public void setZactive(Short zactive) {
        this.zactive = zactive;
    }

    public Integer getZdoctabelZdoctabelid() {
        return zdoctabelZdoctabelid;
    }

    public void setZdoctabelZdoctabelid(Integer zdoctabelZdoctabelid) {
        this.zdoctabelZdoctabelid = zdoctabelZdoctabelid;
    }

    public Integer getZstatusdoc() {
        return zstatusdoc;
    }

    public void setZstatusdoc(Integer zstatusdoc) {
        this.zstatusdoc = zstatusdoc;
    }

    public Short getZurgent() {
        return zurgent;
    }

    public void setZurgent(Short zurgent) {
        this.zurgent = zurgent;
    }

    @XmlTransient
    public Collection<Zdocline> getZdoclineCollection() {
        return zdoclineCollection;
    }

    public void setZdoclineCollection(Collection<Zdocline> zdoclineCollection) {
        this.zdoclineCollection = zdoclineCollection;
    }

    public Zdoctabel getZdoctabelid() {
        return zdoctabelid;
    }

    public void setZdoctabelid(Zdoctabel zdoctabelid) {
        this.zdoctabelid = zdoctabelid;
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
        hash += (zdocid != null ? zdocid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdoc)) {
            return false;
        }
        Zdoc other = (Zdoc) object;
        if ((this.zdocid == null && other.zdocid != null) || (this.zdocid != null && !this.zdocid.equals(other.zdocid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zdoc[ zdocid=" + zdocid + " ]";
    }
    
}
