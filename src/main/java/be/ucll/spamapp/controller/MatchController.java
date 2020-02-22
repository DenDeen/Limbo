package be.ucll.spamapp.controller;

import be.ucll.spamapp.domain.Facade;
import be.ucll.spamapp.domain.MatchService;
import be.ucll.spamapp.domain.User;
import be.ucll.spamapp.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@ComponentScan
@Controller
public class MatchController {


    public MatchController() {

    }

    @GetMapping("/matches")
    public String load(Model model, @CookieValue(value = "email") String email) {
        //model.addAttribute("photopath", Facade.getPhotoPaths(email).get(0));
        //model.addAttribute("name", Facade.getPotentiele(email).get(0));
        System.out.println(email);

        model.addAttribute("matches", Facade.getMatches(email));
        return "matches";
    }

/*
    @GetMapping("/matches")
    public String printMatches(Model model){
        model.addAttribute("matches", matchService.getMatches());
        return "matches";
    }
*/
}
