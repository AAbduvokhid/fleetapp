package uz.snow.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicationController {
    @GetMapping("/home")
    public String home() {
        return "index";
    }
    @GetMapping("/widgets")
    public String widget () {
        return "widgets";
    }
}
