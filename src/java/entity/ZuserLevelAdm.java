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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dinov
 */
@Entity
@Table(name = "ZUSER_LEVEL_ADM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZuserLevelAdm.findAll", query = "SELECT z FROM ZuserLevelAdm z"),
    @NamedQuery(name = "ZuserLevelAdm.findByZuserLevelAdmId", query = "SELECT z FROM ZuserLevelAdm z WHERE z.zuserLevelAdmId = :zuserLevelAdmId"),
    @NamedQuery(name = "ZuserLevelAdm.findByLevelAdmNo", query = "SELECT z FROM ZuserLevelAdm z WHERE z.levelAdmNo = :levelAdmNo"),
    @NamedQuery(name = "ZuserLevelAdm.findByName", query = "SELECT z FROM ZuserLevelAdm z WHERE z.name = :name")})
public class ZuserLevelAdm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZUSER_LEVEL_ADM_ID", nullable = false)
    private Integer zuserLevelAdmId;
    @Column(name = "LEVEL_ADM_NO")
    private Integer levelAdmNo;
    @Size(max = 255)
    @Column(name = "NAME", length = 255)
    private String name;

    public ZuserLevelAdm() {
    }

    public ZuserLevelAdm(Integer zuserLevelAdmId) {
        this.zuserLevelAdmId = zuserLevelAdmId;
    }

    public Integer getZuserLevelAdmId() {
        return zuserLevelAdmId;
    }

    public void setZuserLevelAdmId(Integer zuserLevelAdmId) {
        this.zuserLevelAdmId = zuserLevelAdmId;
    }

    public Integer getLevelAdmNo() {
        return levelAdmNo;
    }

    public void setLevelAdmNo(Integer levelAdmNo) {
        this.levelAdmNo = levelAdmNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zuserLevelAdmId != null ? zuserLevelAdmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZuserLevelAdm)) {
            return false;
        }
        ZuserLevelAdm other = (ZuserLevelAdm) object;
        if ((this.zuserLevelAdmId == null && other.zuserLevelAdmId != null) || (this.zuserLevelAdmId != null && !this.zuserLevelAdmId.equals(other.zuserLevelAdmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZuserLevelAdm[ zuserLevelAdmId=" + zuserLevelAdmId + " ]";
    }
    
}
