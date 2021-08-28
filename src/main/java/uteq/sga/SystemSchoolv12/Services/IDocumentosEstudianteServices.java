/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Services;

import java.util.List;
import uteq.sga.SystemSchoolv12.Entity.DocumentosEstudiante;

/**
 *
 * @author capur
 */
public interface IDocumentosEstudianteServices {
    public List<DocumentosEstudiante> listarTodos();
    public void guardar(DocumentosEstudiante actividad);
    public DocumentosEstudiante buscaById(Integer id);
    public void eliminar(Integer id);
}
