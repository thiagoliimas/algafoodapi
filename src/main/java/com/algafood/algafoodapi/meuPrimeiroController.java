package com.algafood.algafoodapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/hello")
@Controller
public class meuPrimeiroController {

    @GetMapping
    @ResponseBody
    public String hello() {
        return "Hello";
    }
}
