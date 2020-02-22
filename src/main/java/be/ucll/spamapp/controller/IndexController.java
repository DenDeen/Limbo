package be.ucll.spamapp.controller;

import be.ucll.spamapp.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@ComponentScan
@Controller
public class IndexController {

    //@Autowired
    //private User user;
    public IndexController(){

    }

    @GetMapping("/login")
    public String printRestaurants(Model model) {
        //model.addAttribute("user", user.getAge());
        return "";
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam("email") String email, @RequestParam("password") String password){
        System.out.println(email);
        return "";
    }
}

