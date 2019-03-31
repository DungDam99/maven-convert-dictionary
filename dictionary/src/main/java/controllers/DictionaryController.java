package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/translating")
    public String converting(Model model){
        return "translating";
    }

    @PostMapping("/translated")
    public String converted(@RequestParam String textSearch, Model model){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển sách");
        dictionary.put("computer", "Máy tính");

        String result = dictionary.get(textSearch);

        model.addAttribute("textSearch", textSearch);

        if (result != null) {
            model.addAttribute("result", result);
        }else{
            model.addAttribute("result", "Not found!");
        }

        return "translated";
    }
}
