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

    @Autowired
    Account account;
    public IndexController(){

    }

    @GetMapping("/")
    public String printRestaurants(Model model) {
        model.addAttribute("account", new Account());
        return "index";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute("account") Account account, Model model ){
        model.addAttribute(account);
        System.out.println(account.getEmail());
        return "homepage";
    }
}

