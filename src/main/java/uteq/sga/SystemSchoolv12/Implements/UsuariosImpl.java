/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Implements;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uteq.sga.SystemSchoolv12.Entity.Usuarios;
import uteq.sga.SystemSchoolv12.Repositorys.IUsuarioRepository;
import uteq.sga.SystemSchoolv12.Services.IUsuariosServices;

/**
 *
 * @author capur
 */
@Service
public class UsuariosImpl implements IUsuariosServices{
    
    @Autowired
    private IUsuarioRepository userepo;

    @Override
    public List<Usuarios> listarTodos() {
        return (List<Usuarios>) userepo.findAll();
    }

    @Override
    public void guardar(Usuarios actividad) {
        userepo.save(actividad);
    }

    @Override
    public Usuarios buscaById(Integer id) {
        return userepo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Integer id) {
        userepo.deleteById(id);
    }
    
}
