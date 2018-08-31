package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

/**
 * @author Evgeny Borisov
 */
@Controller
public class HelloController {

    public String hi(ModelMap model) {
        model.put("name","Vasya");
        model.put("name2","Vasya");
        model.put("name3","Vasya");
        return "hi";
    }
}
