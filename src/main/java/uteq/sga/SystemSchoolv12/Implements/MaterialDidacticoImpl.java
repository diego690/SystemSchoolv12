/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Implements;

import java.util.List;
import org.springframework.stereotype.Service;
import uteq.sga.SystemSchoolv12.Entity.MaterialDidactico;
import uteq.sga.SystemSchoolv12.Services.IMaterialDidacticoServices;

/**
 *
 * @author capur
 */
@Service
public class MaterialDidacticoImpl implements IMaterialDidacticoServices{

    @Override
    public List<MaterialDidactico> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(MaterialDidactico actividad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MaterialDidactico buscaById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
