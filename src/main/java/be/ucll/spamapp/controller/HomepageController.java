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


    public HomepageController(){

    }

    @GetMapping("/homepage")
    public String load(Model model, @CookieValue(value = "email") String email) {
        try{
        model.addAttribute("user", Facade.getPotentiele(email).get(0));
        model.addAttribute("nextUser", Facade.getPotentiele(email).get(1));

        model.addAttribute("email", email);
        return "homepage";
        }
        catch (Exception e){
            return "geenMatches";
        }
    }

    @GetMapping("/swipe")
    public String swipe(Model model, @CookieValue(value = "email") String email, @RequestParam(value="direction") String direction){
        try{
            model.addAttribute("user", Facade.swipe(email, 1));
            model.addAttribute("nextUser", Facade.getPotentiele(email).get(1));
            model.addAttribute("email", email);
            return "homepage";
        }
        catch (Exception e){
            return "geenMatches";
        }


    }



    /*@PostMapping("/login")
    public String loginSubmit(@ModelAttribute("account") Account account, Model model ){
        model.addAttribute(account);
        System.out.println(account.getEmail());
        return "homepage";
    }*/
}