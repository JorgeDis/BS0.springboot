package com.spring.BS0.springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controllers {

    @GetMapping("/user/{nombre}")
    public String getUsuario(@PathVariable String nombre){
        return "Hola "+nombre;
    }

    @PostMapping("/useradd")
    public Usuario setUsuario(@RequestBody Usuario usuario){
        usuario.setEdad(usuario.getEdad()+1);
        return usuario;
    }

}
