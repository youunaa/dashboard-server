package com.okestro.server.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
@CrossOrigin
public class TestController {

    @ResponseBody
    @GetMapping("/healthy")
    public String healthyCheck() {
        return "ok";
    }

}
