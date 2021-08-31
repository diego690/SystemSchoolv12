/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uteq.sga.SystemSchoolv12.Services.IUsuariosServices;

/**
 *
 * @author capur
 */
@Controller
public class IndexController {
    
    @Autowired
    private IUsuariosServices userv;
    
    @RequestMapping("/")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/index";
    }
    @GetMapping("/login")
    public String login(){
        return "login2";
    }
    
    @PostMapping("/init")
    public String login(@RequestParam("user") String user, Model model){
        String ud="";
        String u="";
        
        if(user.equals("admin")){
            ud="/Administrator/index";
            u="Administrador";
        }
        if(user.equals("student")){
            ud="/Student/index";
            u="Student";
        }
        model.addAttribute("use", u);
        model.addAttribute("userr", user);
        return ud;
    }
    
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("Titulo", "Registro Representante");
        model.addAttribute("TituloLogin", "Puedes Iniciar Sesion o Registrarte");
        return "register";
    }
     @GetMapping("/logout")
    public String logout(){
        return "login";
    }
    
    
    
}
