/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Implements;

import java.util.List;
import org.springframework.stereotype.Service;
import uteq.sga.SystemSchoolv12.Entity.PlanEstudio;
import uteq.sga.SystemSchoolv12.Services.IPlanEstudioServices;

/**
 *
 * @author capur
 */
@Service
public class PlanEstudioImpl implements IPlanEstudioServices{

    @Override
    public List<PlanEstudio> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(PlanEstudio actividad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlanEstudio buscaById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
