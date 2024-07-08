package kz.islam.study.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request,
                            Model model){
        String a= request.getParameter("name");
        model.addAttribute("first", a);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }
}
