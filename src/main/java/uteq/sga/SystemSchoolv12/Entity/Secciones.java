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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "secciones", catalog = "Sis_SGA", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Secciones.findAll", query = "SELECT s FROM Secciones s"),
    @NamedQuery(name = "Secciones.findBySeccionId", query = "SELECT s FROM Secciones s WHERE s.seccionId = :seccionId"),
    @NamedQuery(name = "Secciones.findByNombreseccion", query = "SELECT s FROM Secciones s WHERE s.nombreseccion = :nombreseccion")})
public class Secciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "seccion_id")
    private Integer seccionId;
    @Column(name = "nombreseccion")
    private String nombreseccion;
    @JoinColumn(name = "idyearacademico", referencedColumnName = "idyearacademico")
    @ManyToOne
    private YearsAcademicos idyearacademico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seccionId")
    private Collection<Asignaciones> asignacionesCollection;
    @OneToMany(mappedBy = "seccionId")
    private Collection<Asignaturas> asignaturasCollection;
    @OneToMany(mappedBy = "seccionId")
    private Collection<Materias> materiasCollection;

    public Secciones() {
    }

    public Secciones(Integer seccionId) {
        this.seccionId = seccionId;
    }

    public Integer getSeccionId() {
        return seccionId;
    }

    public void setSeccionId(Integer seccionId) {
        this.seccionId = seccionId;
    }

    public String getNombreseccion() {
        return nombreseccion;
    }

    public void setNombreseccion(String nombreseccion) {
        this.nombreseccion = nombreseccion;
    }

    public YearsAcademicos getIdyearacademico() {
        return idyearacademico;
    }

    public void setIdyearacademico(YearsAcademicos idyearacademico) {
        this.idyearacademico = idyearacademico;
    }

    @XmlTransient
    public Collection<Asignaciones> getAsignacionesCollection() {
        return asignacionesCollection;
    }

    public void setAsignacionesCollection(Collection<Asignaciones> asignacionesCollection) {
        this.asignacionesCollection = asignacionesCollection;
    }

    @XmlTransient
    public Collection<Asignaturas> getAsignaturasCollection() {
        return asignaturasCollection;
    }

    public void setAsignaturasCollection(Collection<Asignaturas> asignaturasCollection) {
        this.asignaturasCollection = asignaturasCollection;
    }

    @XmlTransient
    public Collection<Materias> getMateriasCollection() {
        return materiasCollection;
    }

    public void setMateriasCollection(Collection<Materias> materiasCollection) {
        this.materiasCollection = materiasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seccionId != null ? seccionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Secciones)) {
            return false;
        }
        Secciones other = (Secciones) object;
        if ((this.seccionId == null && other.seccionId != null) || (this.seccionId != null && !this.seccionId.equals(other.seccionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uteq.sga.SystemSchoolv12.Entity.Secciones[ seccionId=" + seccionId + " ]";
    }
    
}
