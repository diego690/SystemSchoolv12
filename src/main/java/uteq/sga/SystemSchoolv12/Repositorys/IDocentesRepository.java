/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uteq.sga.SystemSchoolv12.Entity.Docentes;

/**
 *
 * @author capur
 */
@Repository
public interface IDocentesRepository extends CrudRepository<Docentes, Integer>{
    
}
