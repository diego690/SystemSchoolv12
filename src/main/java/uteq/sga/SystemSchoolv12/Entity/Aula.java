/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author capur
 */
@Entity
@Table(name = "aula", catalog = "Sis_SGA", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aula.findAll", query = "SELECT a FROM Aula a"),
    @NamedQuery(name = "Aula.findByAulaId", query = "SELECT a FROM Aula a WHERE a.aulaId = :aulaId"),
    @NamedQuery(name = "Aula.findByAula", query = "SELECT a FROM Aula a WHERE a.aula = :aula"),
    @NamedQuery(name = "Aula.findByCantidadEstudiantes", query = "SELECT a FROM Aula a WHERE a.cantidadEstudiantes = :cantidadEstudiantes")})
public class Aula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "aula_id")
    private Integer aulaId;
    @Basic(optional = false)
    @Column(name = "aula")
    private String aula;
    @Column(name = "cantidad_estudiantes")
    private Integer cantidadEstudiantes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aulaId")
    private Collection<Asignaciones> asignacionesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aulaId")
    private Collection<Horarioclase> horarioclaseCollection;

    public Aula() {
    }

    public Aula(Integer aulaId) {
        this.aulaId = aulaId;
    }

    public Aula(Integer aulaId, String aula) {
        this.aulaId = aulaId;
        this.aula = aula;
    }

    public Integer getAulaId() {
        return aulaId;
    }

    public void setAulaId(Integer aulaId) {
        this.aulaId = aulaId;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Integer getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(Integer cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    @XmlTransient
    public Collection<Asignaciones> getAsignacionesCollection() {
        return asignacionesCollection;
    }

    public void setAsignacionesCollection(Collection<Asignaciones> asignacionesCollection) {
        this.asignacionesCollection = asignacionesCollection;
    }

    @XmlTransient
    public Collection<Horarioclase> getHorarioclaseCollection() {
        return horarioclaseCollection;
    }

    public void setHorarioclaseCollection(Collection<Horarioclase> horarioclaseCollection) {
        this.horarioclaseCollection = horarioclaseCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aulaId != null ? aulaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aula)) {
            return false;
        }
        Aula other = (Aula) object;
        if ((this.aulaId == null && other.aulaId != null) || (this.aulaId != null && !this.aulaId.equals(other.aulaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uteq.sga.SystemSchoolv12.Entity.Aula[ aulaId=" + aulaId + " ]";
    }
    
}
