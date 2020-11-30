package th.ac.kmitl.MyStyle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@Controller

public class WomenController {


    @RequestMapping("/women")
    public String getWomenPage(Model model) {
        ArrayList<String> womens = new ArrayList<>();
        womens.add("Tops");
        womens.add("Bottoms");

        model.addAttribute("allWomens", womens);
        return "women";
    }
}

