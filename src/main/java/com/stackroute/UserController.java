package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    @RequestMapping("/")
    public String greet(Model model){
        User u = new User("harika");
        System.out.println("harika");
        model.addAttribute("name",u.getName());

        return "index";
    }
}
