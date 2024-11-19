package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldRestController {

    @GetMapping({"/hello","/hm","hola"})
    public String helloWorld() {
        System.out.println("Solicitud Ejecutada");
        return "Hello World";
    }

}
