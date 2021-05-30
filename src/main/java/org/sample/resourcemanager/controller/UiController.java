package org.sample.resourcemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UiController {

    @RequestMapping("/home")
    public String index() {
        return "index";
    }

}
