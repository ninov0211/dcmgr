/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "ZUSER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zuser.findAll", query = "SELECT z FROM Zuser z"),
    @NamedQuery(name = "Zuser.findByZuserid", query = "SELECT z FROM Zuser z WHERE z.zuserid = :zuserid"),
    @NamedQuery(name = "Zuser.findByLeveladmid", query = "SELECT z FROM Zuser z WHERE z.leveladmid = :leveladmid"),
    @NamedQuery(name = "Zuser.findByLevelsysid", query = "SELECT z FROM Zuser z WHERE z.levelsysid = :levelsysid"),
    @NamedQuery(name = "Zuser.findByUseremail", query = "SELECT z FROM Zuser z WHERE z.useremail = :useremail"),
    @NamedQuery(name = "Zuser.findByUsername", query = "SELECT z FROM Zuser z WHERE z.username = :username"),
    @NamedQuery(name = "Zuser.findByUserpass", query = "SELECT z FROM Zuser z WHERE z.userpass = :userpass"),
    @NamedQuery(name = "Zuser.findByZactiveuser", query = "SELECT z FROM Zuser z WHERE z.zactiveuser = :zactiveuser"),
    @NamedQuery(name = "Zuser.findByZdeptZdepid", query = "SELECT z FROM Zuser z WHERE z.zdeptZdepid = :zdeptZdepid"),
    @NamedQuery(name = "Zuser.findByZdeptid1", query = "SELECT z FROM Zuser z WHERE z.zdeptid1 = :zdeptid1"),
    @NamedQuery(name = "Zuser.findByZuserleveladmZuserLevelAdmId", query = "SELECT z FROM Zuser z WHERE z.zuserleveladmZuserLevelAdmId = :zuserleveladmZuserLevelAdmId"),
    @NamedQuery(name = "Zuser.findByZuserlevelsysZuserLevelSysId", query = "SELECT z FROM Zuser z WHERE z.zuserlevelsysZuserLevelSysId = :zuserlevelsysZuserLevelSysId")})
public class Zuser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZUSERID", nullable = false)
    private Integer zuserid;
    @Column(name = "LEVELADMID")
    private Integer leveladmid;
    @Column(name = "LEVELSYSID")
    private Integer levelsysid;
    @Size(max = 255)
    @Column(name = "USEREMAIL", length = 255)
    private String useremail;
    @Size(max = 255)
    @Column(name = "USERNAME", length = 255)
    private String username;
    @Size(max = 255)
    @Column(name = "USERPASS", length = 255)
    private String userpass;
    @Column(name = "ZACTIVEUSER")
    private Short zactiveuser;
    @Column(name = "ZDEPT_ZDEPID")
    private Integer zdeptZdepid;
    @Column(name = "ZDEPTID1")
    private Integer zdeptid1;
    @Column(name = "ZUSERLEVELADM_ZUSER_LEVEL_ADM_ID")
    private Integer zuserleveladmZuserLevelAdmId;
    @Column(name = "ZUSERLEVELSYS_ZUSER_LEVEL_SYS_ID")
    private Integer zuserlevelsysZuserLevelSysId;
    @OneToMany(mappedBy = "zuserId")
    private Collection<Zdocrencanadist> zdocrencanadistCollection;
    @OneToMany(mappedBy = "zuserid")
    private Collection<Zdocdistribusi> zdocdistribusiCollection;
    @OneToMany(mappedBy = "zuserid")
    private Collection<Zdoc> zdocCollection;
    @OneToMany(mappedBy = "zuserid1")
    private Collection<Zprivilage> zprivilageCollection;
    @OneToMany(mappedBy = "zuserZuserid")
    private Collection<Zprivilage> zprivilageCollection1;
    @OneToMany(mappedBy = "zusersZuserid")
    private Collection<ZdoclineZuser> zdoclineZuserCollection;

    public Zuser() {
    }

    public Zuser(Integer zuserid) {
        this.zuserid = zuserid;
    }

    public Integer getZuserid() {
        return zuserid;
    }

    public void setZuserid(Integer zuserid) {
        this.zuserid = zuserid;
    }

    public Integer getLeveladmid() {
        return leveladmid;
    }

    public void setLeveladmid(Integer leveladmid) {
        this.leveladmid = leveladmid;
    }

    public Integer getLevelsysid() {
        return levelsysid;
    }

    public void setLevelsysid(Integer levelsysid) {
        this.levelsysid = levelsysid;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public Short getZactiveuser() {
        return zactiveuser;
    }

    public void setZactiveuser(Short zactiveuser) {
        this.zactiveuser = zactiveuser;
    }

    public Integer getZdeptZdepid() {
        return zdeptZdepid;
    }

    public void setZdeptZdepid(Integer zdeptZdepid) {
        this.zdeptZdepid = zdeptZdepid;
    }

    public Integer getZdeptid1() {
        return zdeptid1;
    }

    public void setZdeptid1(Integer zdeptid1) {
        this.zdeptid1 = zdeptid1;
    }

    public Integer getZuserleveladmZuserLevelAdmId() {
        return zuserleveladmZuserLevelAdmId;
    }

    public void setZuserleveladmZuserLevelAdmId(Integer zuserleveladmZuserLevelAdmId) {
        this.zuserleveladmZuserLevelAdmId = zuserleveladmZuserLevelAdmId;
    }

    public Integer getZuserlevelsysZuserLevelSysId() {
        return zuserlevelsysZuserLevelSysId;
    }

    public void setZuserlevelsysZuserLevelSysId(Integer zuserlevelsysZuserLevelSysId) {
        this.zuserlevelsysZuserLevelSysId = zuserlevelsysZuserLevelSysId;
    }

    @XmlTransient
    public Collection<Zdocrencanadist> getZdocrencanadistCollection() {
        return zdocrencanadistCollection;
    }

    public void setZdocrencanadistCollection(Collection<Zdocrencanadist> zdocrencanadistCollection) {
        this.zdocrencanadistCollection = zdocrencanadistCollection;
    }

    @XmlTransient
    public Collection<Zdocdistribusi> getZdocdistribusiCollection() {
        return zdocdistribusiCollection;
    }

    public void setZdocdistribusiCollection(Collection<Zdocdistribusi> zdocdistribusiCollection) {
        this.zdocdistribusiCollection = zdocdistribusiCollection;
    }

    @XmlTransient
    public Collection<Zdoc> getZdocCollection() {
        return zdocCollection;
    }

    public void setZdocCollection(Collection<Zdoc> zdocCollection) {
        this.zdocCollection = zdocCollection;
    }

    @XmlTransient
    public Collection<Zprivilage> getZprivilageCollection() {
        return zprivilageCollection;
    }

    public void setZprivilageCollection(Collection<Zprivilage> zprivilageCollection) {
        this.zprivilageCollection = zprivilageCollection;
    }

    @XmlTransient
    public Collection<Zprivilage> getZprivilageCollection1() {
        return zprivilageCollection1;
    }

    public void setZprivilageCollection1(Collection<Zprivilage> zprivilageCollection1) {
        this.zprivilageCollection1 = zprivilageCollection1;
    }

    @XmlTransient
    public Collection<ZdoclineZuser> getZdoclineZuserCollection() {
        return zdoclineZuserCollection;
    }

    public void setZdoclineZuserCollection(Collection<ZdoclineZuser> zdoclineZuserCollection) {
        this.zdoclineZuserCollection = zdoclineZuserCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zuserid != null ? zuserid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zuser)) {
            return false;
        }
        Zuser other = (Zuser) object;
        if ((this.zuserid == null && other.zuserid != null) || (this.zuserid != null && !this.zuserid.equals(other.zuserid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zuser[ zuserid=" + zuserid + " ]";
    }
    
}
