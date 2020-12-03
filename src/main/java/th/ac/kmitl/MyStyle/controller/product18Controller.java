package th.ac.kmitl.MyStyle.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class product18Controller {

    @RequestMapping("/product18")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "MYSTYLE");

        return "product18";
    }
}
