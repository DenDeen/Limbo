package be.ucll.spamapp.controller;

import be.ucll.spamapp.domain.Facade;
import be.ucll.spamapp.domain.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@ComponentScan
@Controller
public class ProfileController {
    ProfileController(){}

    @GetMapping("/profile/?name={email}")
    public String load(Model model, @PathVariable String email) {
        User user = Facade.getUser(email);
        System.out.println(user.getEmail());

        model.addAttribute("profile", user);
        return "profile";
    }
}
