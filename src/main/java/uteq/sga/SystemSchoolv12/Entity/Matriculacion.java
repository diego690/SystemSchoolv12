/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author capur
 */
@Entity
@Table(name = "matriculacion", catalog = "Sis_SGA", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matriculacion.findAll", query = "SELECT m FROM Matriculacion m"),
    @NamedQuery(name = "Matriculacion.findByIdmatriculacion", query = "SELECT m FROM Matriculacion m WHERE m.idmatriculacion = :idmatriculacion"),
    @NamedQuery(name = "Matriculacion.findByIdestudiante", query = "SELECT m FROM Matriculacion m WHERE m.idestudiante = :idestudiante"),
    @NamedQuery(name = "Matriculacion.findByCurso", query = "SELECT m FROM Matriculacion m WHERE m.curso = :curso"),
    @NamedQuery(name = "Matriculacion.findByEstadomatricula", query = "SELECT m FROM Matriculacion m WHERE m.estadomatricula = :estadomatricula"),
    @NamedQuery(name = "Matriculacion.findByDocumentosrevisados", query = "SELECT m FROM Matriculacion m WHERE m.documentosrevisados = :documentosrevisados"),
    @NamedQuery(name = "Matriculacion.findByFechainscripcion", query = "SELECT m FROM Matriculacion m WHERE m.fechainscripcion = :fechainscripcion"),
    @NamedQuery(name = "Matriculacion.findByFechamatricula", query = "SELECT m FROM Matriculacion m WHERE m.fechamatricula = :fechamatricula"),
    @NamedQuery(name = "Matriculacion.findByAniolectivo", query = "SELECT m FROM Matriculacion m WHERE m.aniolectivo = :aniolectivo"),
    @NamedQuery(name = "Matriculacion.findByAula", query = "SELECT m FROM Matriculacion m WHERE m.aula = :aula")})
public class Matriculacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmatriculacion")
    private Integer idmatriculacion;
    @Basic(optional = false)
    @Column(name = "idestudiante")
    private int idestudiante;
    @Basic(optional = false)
    @Column(name = "curso")
    private int curso;
    @Column(name = "estadomatricula")
    private String estadomatricula;
    @Column(name = "documentosrevisados")
    private String documentosrevisados;
    @Column(name = "fechainscripcion")
    @Temporal(TemporalType.DATE)
    private Date fechainscripcion;
    @Column(name = "fechamatricula")
    @Temporal(TemporalType.DATE)
    private Date fechamatricula;
    @Column(name = "aniolectivo")
    private Integer aniolectivo;
    @Column(name = "aula")
    private Integer aula;

    public Matriculacion() {
    }

    public Matriculacion(Integer idmatriculacion) {
        this.idmatriculacion = idmatriculacion;
    }

    public Matriculacion(Integer idmatriculacion, int idestudiante, int curso) {
        this.idmatriculacion = idmatriculacion;
        this.idestudiante = idestudiante;
        this.curso = curso;
    }

    public Integer getIdmatriculacion() {
        return idmatriculacion;
    }

    public void setIdmatriculacion(Integer idmatriculacion) {
        this.idmatriculacion = idmatriculacion;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getEstadomatricula() {
        return estadomatricula;
    }

    public void setEstadomatricula(String estadomatricula) {
        this.estadomatricula = estadomatricula;
    }

    public String getDocumentosrevisados() {
        return documentosrevisados;
    }

    public void setDocumentosrevisados(String documentosrevisados) {
        this.documentosrevisados = documentosrevisados;
    }

    public Date getFechainscripcion() {
        return fechainscripcion;
    }

    public void setFechainscripcion(Date fechainscripcion) {
        this.fechainscripcion = fechainscripcion;
    }

    public Date getFechamatricula() {
        return fechamatricula;
    }

    public void setFechamatricula(Date fechamatricula) {
        this.fechamatricula = fechamatricula;
    }

    public Integer getAniolectivo() {
        return aniolectivo;
    }

    public void setAniolectivo(Integer aniolectivo) {
        this.aniolectivo = aniolectivo;
    }

    public Integer getAula() {
        return aula;
    }

    public void setAula(Integer aula) {
        this.aula = aula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmatriculacion != null ? idmatriculacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matriculacion)) {
            return false;
        }
        Matriculacion other = (Matriculacion) object;
        if ((this.idmatriculacion == null && other.idmatriculacion != null) || (this.idmatriculacion != null && !this.idmatriculacion.equals(other.idmatriculacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uteq.sga.SystemSchoolv12.Entity.Matriculacion[ idmatriculacion=" + idmatriculacion + " ]";
    }
    
}
