package vn.teo.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.teo.hello.bean.GlobalConfig;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @Autowired
    private GlobalConfig globalConfig;

    @Value("${message}")
    private String message;

    @Value("${environment}")
    private String environment;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/")
    public String welcome(Model model, HttpServletRequest request) {
        model.addAttribute("name", globalConfig.getName());
        model.addAttribute("website", globalConfig.getWebsite());
        model.addAttribute("facebook", globalConfig.getFacebook());
        model.addAttribute("message", message);
        model.addAttribute("menus", globalConfig.getMenus());
        model.addAttribute("environment", environment);
        String message2 = messageSource.getMessage("hello", null, "default message", request.getLocale());
        model.addAttribute("message2", message2);
        return "index";
    }

}
