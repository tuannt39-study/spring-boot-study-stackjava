package vn.teo.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.teo.hello.bean.GlobalConfig;

@Controller
public class HelloController {

    @Autowired
    private GlobalConfig globalConfig;

    @Value("${message}")
    private String message;

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("name", globalConfig.getName());
        model.addAttribute("website", globalConfig.getWebsite());
        model.addAttribute("facebook", globalConfig.getFacebook());
        model.addAttribute("message", message);
        model.addAttribute("menus", globalConfig.getMenus());
        return "index";
    }

}
