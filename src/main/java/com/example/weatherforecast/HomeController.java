package com.example.weatherforecast;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(ModelMap map){
        map.put("a",20);
        return "home";

    }
}
