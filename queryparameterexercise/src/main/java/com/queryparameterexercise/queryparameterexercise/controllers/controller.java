package com.queryparameterexercise.queryparameterexercise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class controller {
    @GetMapping("/ciao")
    public String ciao(@RequestParam(required = true) String nome, @RequestParam(required = true) String provincia){
        return "ciao " + nome + ", come e' il tempo in " + provincia + "?";

    }
}
