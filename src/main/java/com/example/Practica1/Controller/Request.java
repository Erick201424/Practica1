package com.example.Practica1.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Request {

    @GetMapping("get")
    public String get() { return "Hola, este es un GET"; }

    @PostMapping("post")
    public String post() { return "Hola, este es un POST"; }

    @PutMapping("put")
    public String put() { return "Hola, este es un PUT"; }

    @DeleteMapping("delete")
    public String delete() { return "Hola, este es un DELETE"; }
}
