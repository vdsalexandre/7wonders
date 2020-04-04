package vds.app.wonders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home(@RequestParam(name = "player", required = false, defaultValue = "") String player, Model model) {
        model.addAttribute("player", player);
        return "home";
    }
}
