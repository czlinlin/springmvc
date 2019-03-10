package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("apply")
public class ApplyController {

    @RequestMapping("p1")
    public String person1() {
        return "1";
    }

    @RequestMapping("p2")
    public String person2() {
        return "2";
    }
}
