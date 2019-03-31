package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping("/converting")
    public String converting(Model model){
        return "convert";
    }
    @PostMapping("/converted")
    public String convert(@RequestParam String rate, String usd, Model model){
        float r = Float.parseFloat(rate);
        float u = Float.parseFloat(usd);
        float vnd = r * u;
        model.addAttribute("vnd",vnd);
        return "converted";
    }
}
