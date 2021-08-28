/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author capur
 */
@Entity
@Table(name = "horarioclase", catalog = "Sis_SGA", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horarioclase.findAll", query = "SELECT h FROM Horarioclase h"),
    @NamedQuery(name = "Horarioclase.findByHorarioId", query = "SELECT h FROM Horarioclase h WHERE h.horarioId = :horarioId"),
    @NamedQuery(name = "Horarioclase.findByDia", query = "SELECT h FROM Horarioclase h WHERE h.dia = :dia")})
public class Horarioclase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "horario_id")
    private Integer horarioId;
    @Basic(optional = false)
    @Column(name = "dia")
    private String dia;
    @JoinColumn(name = "idasignatura", referencedColumnName = "idasignatura")
    @ManyToOne(optional = false)
    private Asignaturas idasignatura;
    @JoinColumn(name = "aula_id", referencedColumnName = "aula_id")
    @ManyToOne(optional = false)
    private Aula aulaId;
    @JoinColumn(name = "idcarrera", referencedColumnName = "idcarrera")
    @ManyToOne(optional = false)
    private Carreras idcarrera;
    @JoinColumn(name = "iddocente", referencedColumnName = "iddocente")
    @ManyToOne(optional = false)
    private Docentes iddocente;
    @JoinColumn(name = "time_id", referencedColumnName = "time_id")
    @ManyToOne(optional = false)
    private Time timeId;

    public Horarioclase() {
    }

    public Horarioclase(Integer horarioId) {
        this.horarioId = horarioId;
    }

    public Horarioclase(Integer horarioId, String dia) {
        this.horarioId = horarioId;
        this.dia = dia;
    }

    public Integer getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Integer horarioId) {
        this.horarioId = horarioId;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Asignaturas getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Asignaturas idasignatura) {
        this.idasignatura = idasignatura;
    }

    public Aula getAulaId() {
        return aulaId;
    }

    public void setAulaId(Aula aulaId) {
        this.aulaId = aulaId;
    }

    public Carreras getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(Carreras idcarrera) {
        this.idcarrera = idcarrera;
    }

    public Docentes getIddocente() {
        return iddocente;
    }

    public void setIddocente(Docentes iddocente) {
        this.iddocente = iddocente;
    }

    public Time getTimeId() {
        return timeId;
    }

    public void setTimeId(Time timeId) {
        this.timeId = timeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (horarioId != null ? horarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horarioclase)) {
            return false;
        }
        Horarioclase other = (Horarioclase) object;
        if ((this.horarioId == null && other.horarioId != null) || (this.horarioId != null && !this.horarioId.equals(other.horarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uteq.sga.SystemSchoolv12.Entity.Horarioclase[ horarioId=" + horarioId + " ]";
    }
    
}
