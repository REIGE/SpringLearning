package com.reige.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by REIGE on 2017/10/28.
 */
@Controller
public class FreemarkerController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("Name","name");
        return "/freemarker-demo";
    }
}
