/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uteq.sga.SystemSchoolv12.Entity.Estudiantes;
import uteq.sga.SystemSchoolv12.Entity.Pagos;
import uteq.sga.SystemSchoolv12.Services.IEstudiantesServices;
import uteq.sga.SystemSchoolv12.Services.IPagosServices;

/**
 *
 * @author capur
 */
@Controller
@RequestMapping("/Admin/Pagos")
public class PagosController {
    
    @Autowired
    private IPagosServices pgserv;
    
    @Autowired
    private IEstudiantesServices estuserv;
    
    @RequestMapping("/listar")
    public String page(Model model) {
        List<Pagos> pagos = pgserv.listarTodos();
        model.addAttribute("titulo", "Listado de Pagos de Aranceles");
        model.addAttribute("pagos", pagos);
        return "/Administrator/Pagoslist";
    }
    @RequestMapping("/create")
    public String crear(Model model){
        Pagos pagos = new Pagos();
        List<Estudiantes> estu = estuserv.listarTodos();
        model.addAttribute("titulo", "Registro nuevo Pago de Aranceles");
        model.addAttribute("pagos", pagos);
        model.addAttribute("estudiante", estuserv);
        return "/Administrator/PagosAdd";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Pagos user){
        pgserv.guardar(user);
        System.out.println("Registro guardado correctamente");
        return "redirect:/Admin/Pagos/listar";
    }
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model){
        Pagos pagos = pgserv.buscaById(id);
        List<Estudiantes> estu = estuserv.listarTodos();
        model.addAttribute("titulo", "Editar Pago de Aranceles");
        model.addAttribute("pagos", pagos);
        model.addAttribute("estudiante", estuserv);
        return "/Administrator/PagosAdd";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id, Model model){
        pgserv.eliminar(id);
         return "redirect:/Admin/Pagos/listar";
    }
}
