package be.ucll.spamapp.controller;

import be.ucll.spamapp.domain.Restaurant;
import be.ucll.spamapp.domain.Restaurants;
import be.ucll.spamapp.domain.Spam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@ComponentScan
@Controller
public class IndexController {

    @Autowired
    private Restaurants restaurants;
    public IndexController(){

    }

    @GetMapping("/")
    public String printRestaurants(Model model) {
        model.addAttribute("restaurants", restaurants.getRestaurants());
        return "index";
    }
}

