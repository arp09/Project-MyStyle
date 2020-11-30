package th.ac.kmitl.MyStyle.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;


@Controller
public class MenController {

    @RequestMapping("/men")
    public String getMenPage(Model model) {
        ArrayList<String> mens = new ArrayList<>();
        mens.add("Tops");
        mens.add("Bottoms");

        model.addAttribute("allMens", mens);
        return "men";
    }
}





