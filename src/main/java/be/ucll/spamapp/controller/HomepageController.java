package be.ucll.spamapp.controller;

import be.ucll.spamapp.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.stream.Collectors;

@ComponentScan
@Controller
public class HomepageController {

    @Autowired
    Users users;

    public HomepageController(){

    }

    @GetMapping("/homepage")
    public String load(Model model, @CookieValue(value = "email") String email) {
        model.addAttribute("potential", users.getPersons());
        System.out.println(email);
        model.addAttribute("email", email);
        return "homepage";
    }

    @GetMapping("/newcard")
    public String newCard(Model model){
        model.addAttribute("potential", users.getPersons());
        return "homepage";
    }



    /*@PostMapping("/login")
    public String loginSubmit(@ModelAttribute("account") Account account, Model model ){
        model.addAttribute(account);
        System.out.println(account.getEmail());
        return "homepage";
    }*/
}