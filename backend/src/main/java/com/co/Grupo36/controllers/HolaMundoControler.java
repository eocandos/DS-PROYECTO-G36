package com.co.Grupo36.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoControler {

    @GetMapping("/hola")
    public String saludar() {

        return  "Hola Grupo 36";
    }

    @GetMapping("/hi")
    public String saludar2() {

        return  "Hello group 36";
    }


}
