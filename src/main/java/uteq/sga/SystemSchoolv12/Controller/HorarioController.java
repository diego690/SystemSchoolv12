/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SystemSchoolv12.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author capur
 */
@Controller
@RequestMapping("/Admin/Horario2")
public class HorarioController {
    
    @RequestMapping("/ver")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/Administrator/Horario2";
    }
    
}
