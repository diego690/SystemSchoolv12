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
@Table(name = "documentos_estudiante", catalog = "Sis_SGA", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocumentosEstudiante.findAll", query = "SELECT d FROM DocumentosEstudiante d"),
    @NamedQuery(name = "DocumentosEstudiante.findByDocumentoId", query = "SELECT d FROM DocumentosEstudiante d WHERE d.documentoId = :documentoId"),
    @NamedQuery(name = "DocumentosEstudiante.findByDescripciondocumento", query = "SELECT d FROM DocumentosEstudiante d WHERE d.descripciondocumento = :descripciondocumento"),
    @NamedQuery(name = "DocumentosEstudiante.findByDocumento", query = "SELECT d FROM DocumentosEstudiante d WHERE d.documento = :documento"),
    @NamedQuery(name = "DocumentosEstudiante.findByIdestudiante", query = "SELECT d FROM DocumentosEstudiante d WHERE d.idestudiante = :idestudiante"),
    @NamedQuery(name = "DocumentosEstudiante.findByFechasubida", query = "SELECT d FROM DocumentosEstudiante d WHERE d.fechasubida = :fechasubida")})
public class DocumentosEstudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "documento_id")
    private Integer documentoId;
    @Basic(optional = false)
    @Column(name = "descripciondocumento")
    private String descripciondocumento;
    @Basic(optional = false)
    @Column(name = "documento")
    private String documento;
    @Column(name = "idestudiante")
    private Integer idestudiante;
    @Column(name = "fechasubida")
    @Temporal(TemporalType.DATE)
    private Date fechasubida;

    public DocumentosEstudiante() {
    }

    public DocumentosEstudiante(Integer documentoId) {
        this.documentoId = documentoId;
    }

    public DocumentosEstudiante(Integer documentoId, String descripciondocumento, String documento) {
        this.documentoId = documentoId;
        this.descripciondocumento = descripciondocumento;
        this.documento = documento;
    }

    public Integer getDocumentoId() {
        return documentoId;
    }

    public void setDocumentoId(Integer documentoId) {
        this.documentoId = documentoId;
    }

    public String getDescripciondocumento() {
        return descripciondocumento;
    }

    public void setDescripciondocumento(String descripciondocumento) {
        this.descripciondocumento = descripciondocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Integer idestudiante) {
        this.idestudiante = idestudiante;
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
        hash += (documentoId != null ? documentoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentosEstudiante)) {
            return false;
        }
        DocumentosEstudiante other = (DocumentosEstudiante) object;
        if ((this.documentoId == null && other.documentoId != null) || (this.documentoId != null && !this.documentoId.equals(other.documentoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uteq.sga.SystemSchoolv12.Entity.DocumentosEstudiante[ documentoId=" + documentoId + " ]";
    }
    
}
