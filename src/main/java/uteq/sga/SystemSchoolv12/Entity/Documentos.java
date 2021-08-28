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
@Table(name = "documentos", catalog = "Sis_SGA", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documentos.findAll", query = "SELECT d FROM Documentos d"),
    @NamedQuery(name = "Documentos.findByIddocumento", query = "SELECT d FROM Documentos d WHERE d.iddocumento = :iddocumento"),
    @NamedQuery(name = "Documentos.findByIdtipodocumento", query = "SELECT d FROM Documentos d WHERE d.idtipodocumento = :idtipodocumento"),
    @NamedQuery(name = "Documentos.findByDescripcion", query = "SELECT d FROM Documentos d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "Documentos.findByDocumento", query = "SELECT d FROM Documentos d WHERE d.documento = :documento"),
    @NamedQuery(name = "Documentos.findByIdusuario", query = "SELECT d FROM Documentos d WHERE d.idusuario = :idusuario"),
    @NamedQuery(name = "Documentos.findByFechasubida", query = "SELECT d FROM Documentos d WHERE d.fechasubida = :fechasubida")})
public class Documentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddocumento")
    private Integer iddocumento;
    @Basic(optional = false)
    @Column(name = "idtipodocumento")
    private int idtipodocumento;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "documento")
    private String documento;
    @Column(name = "idusuario")
    private Integer idusuario;
    @Column(name = "fechasubida")
    @Temporal(TemporalType.DATE)
    private Date fechasubida;

    public Documentos() {
    }

    public Documentos(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public Documentos(Integer iddocumento, int idtipodocumento) {
        this.iddocumento = iddocumento;
        this.idtipodocumento = idtipodocumento;
    }

    public Integer getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public int getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(int idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Date getFechasubida() {
        return fechasubida;
    }

    public void setFechasubida(Date fechasubida) {
        this.fechasubida = fechasubida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddocumento != null ? iddocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentos)) {
            return false;
        }
        Documentos other = (Documentos) object;
        if ((this.iddocumento == null && other.iddocumento != null) || (this.iddocumento != null && !this.iddocumento.equals(other.iddocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uteq.sga.SystemSchoolv12.Entity.Documentos[ iddocumento=" + iddocumento + " ]";
    }
    
}
