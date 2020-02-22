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
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

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
    public ModelAndView loginSubmit(@ModelAttribute("account") Account account, Model model , HttpServletResponse response){

        model.addAttribute(account);
        System.out.println(account.getEmail());
        Cookie cookie = new Cookie("email", account.getEmail());
        response.addCookie(cookie);

        return new ModelAndView("redirect:/homepage");
    }

}

