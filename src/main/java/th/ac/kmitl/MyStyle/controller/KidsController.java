package th.ac.kmitl.MyStyle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;


@Controller
public class KidsController {

    @RequestMapping("/kids")
    public String getKidsPage(Model model) {
        ArrayList<String> kidss = new ArrayList<>();
        //kidss.add("Tops");
        //kidss.add("Bottoms");

        model.addAttribute("allKidss", kidss);
        return "kids";
    }
}