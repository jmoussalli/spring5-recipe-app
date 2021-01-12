package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Package :  guru.springframework.controllers
 * Created by jerom on 19/12/2020 at 19:40
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        System.out.println("Tagada Tsoin Tsoin fsqfqs !");
        return "index";
    }
}
