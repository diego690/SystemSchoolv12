/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Implements;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uteq.sga.SystemSchoolv12.Entity.EntregaTareas;
import uteq.sga.SystemSchoolv12.Repositorys.IEntregaTareasRepository;
import uteq.sga.SystemSchoolv12.Services.IEntregaTareasServices;

/**
 *
 * @author capur
 */
@Service
public class EntregaTareasImpl implements IEntregaTareasServices{
    
    @Autowired
    private IEntregaTareasRepository entregatarepo;

    @Override
    public List<EntregaTareas> listarTodos() {
        return (List<EntregaTareas>) entregatarepo.findAll();
    }

    @Override
    public void guardar(EntregaTareas actividad) {
        entregatarepo.save(actividad);
    }

    @Override
    public EntregaTareas buscaById(Integer id) {
        return entregatarepo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Integer id) {
       entregatarepo.deleteById(id);
    }
    
}
