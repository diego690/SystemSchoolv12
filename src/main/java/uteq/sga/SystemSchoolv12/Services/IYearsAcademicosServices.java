/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Services;

import java.util.List;
import uteq.sga.SystemSchoolv12.Entity.YearsAcademicos;

/**
 *
 * @author capur
 */
public interface IYearsAcademicosServices {
    public List<YearsAcademicos> listarTodos();
    public void guardar(YearsAcademicos actividad);
    public YearsAcademicos buscaById(Integer id);
    public void eliminar(Integer id);
}
