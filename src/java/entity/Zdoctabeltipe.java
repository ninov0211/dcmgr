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
@Table(name = "ZDOCTABELTIPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdoctabeltipe.findAll", query = "SELECT z FROM Zdoctabeltipe z"),
    @NamedQuery(name = "Zdoctabeltipe.findByZdoctabeltipeid", query = "SELECT z FROM Zdoctabeltipe z WHERE z.zdoctabeltipeid = :zdoctabeltipeid"),
    @NamedQuery(name = "Zdoctabeltipe.findByNamatipe", query = "SELECT z FROM Zdoctabeltipe z WHERE z.namatipe = :namatipe")})
public class Zdoctabeltipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOCTABELTIPEID", nullable = false)
    private Integer zdoctabeltipeid;
    @Size(max = 255)
    @Column(name = "NAMATIPE", length = 255)
    private String namatipe;

    public Zdoctabeltipe() {
    }

    public Zdoctabeltipe(Integer zdoctabeltipeid) {
        this.zdoctabeltipeid = zdoctabeltipeid;
    }

    public Integer getZdoctabeltipeid() {
        return zdoctabeltipeid;
    }

    public void setZdoctabeltipeid(Integer zdoctabeltipeid) {
        this.zdoctabeltipeid = zdoctabeltipeid;
    }

    public String getNamatipe() {
        return namatipe;
    }

    public void setNamatipe(String namatipe) {
        this.namatipe = namatipe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdoctabeltipeid != null ? zdoctabeltipeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdoctabeltipe)) {
            return false;
        }
        Zdoctabeltipe other = (Zdoctabeltipe) object;
        if ((this.zdoctabeltipeid == null && other.zdoctabeltipeid != null) || (this.zdoctabeltipeid != null && !this.zdoctabeltipeid.equals(other.zdoctabeltipeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zdoctabeltipe[ zdoctabeltipeid=" + zdoctabeltipeid + " ]";
    }
    
}
