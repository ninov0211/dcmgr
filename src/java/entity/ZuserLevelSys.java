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
@Table(name = "ZUSER_LEVEL_SYS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZuserLevelSys.findAll", query = "SELECT z FROM ZuserLevelSys z"),
    @NamedQuery(name = "ZuserLevelSys.findByZuserLevelSysId", query = "SELECT z FROM ZuserLevelSys z WHERE z.zuserLevelSysId = :zuserLevelSysId"),
    @NamedQuery(name = "ZuserLevelSys.findByName", query = "SELECT z FROM ZuserLevelSys z WHERE z.name = :name")})
public class ZuserLevelSys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZUSER_LEVEL_SYS_ID", nullable = false)
    private Integer zuserLevelSysId;
    @Size(max = 255)
    @Column(name = "NAME", length = 255)
    private String name;

    public ZuserLevelSys() {
    }

    public ZuserLevelSys(Integer zuserLevelSysId) {
        this.zuserLevelSysId = zuserLevelSysId;
    }

    public Integer getZuserLevelSysId() {
        return zuserLevelSysId;
    }

    public void setZuserLevelSysId(Integer zuserLevelSysId) {
        this.zuserLevelSysId = zuserLevelSysId;
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
        hash += (zuserLevelSysId != null ? zuserLevelSysId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZuserLevelSys)) {
            return false;
        }
        ZuserLevelSys other = (ZuserLevelSys) object;
        if ((this.zuserLevelSysId == null && other.zuserLevelSysId != null) || (this.zuserLevelSysId != null && !this.zuserLevelSysId.equals(other.zuserLevelSysId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZuserLevelSys[ zuserLevelSysId=" + zuserLevelSysId + " ]";
    }
    
}
