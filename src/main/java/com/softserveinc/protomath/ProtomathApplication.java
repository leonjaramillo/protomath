package com.softserveinc.protomath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//App used to get the square and the cube of any number
//Executes with http://localhost:8080 or the specific vendor's URL
@SpringBootApplication
@RestController
public class ProtomathApplication {

    Calculator calculator;
    
    public static void main(String[] args) {
        SpringApplication.run(ProtomathApplication.class, args);
    }

    //Executes with http://localhost:8080/
    @GetMapping("/")
    public String index() {
        return String.format("Welcome! This app helps you to get the square or the cube of any number and to test CI, CD and test coverage.");
    }    

    //Executes with http://localhost:8080/hola or http://localhost:8080/hola?name=John
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    
    //Executes with http://localhost:8080/cuadrado or http://localhost:8080/cuadrado?number=5
    @GetMapping("/square")
    public String square(@RequestParam(value = "number", defaultValue = "0") Double number) {
        this.calculator = new Calculator();
        return String.format("The square of %f is %f", number, this.calculator.square(number));
    }
    
    //Executes with http://localhost:8080/cubo or http://localhost:8080/cubo?number=5
    @GetMapping("/cube")
    public String cube(@RequestParam(value = "number", defaultValue = "0") Double number) {
        this.calculator = new Calculator();
        return String.format("The cube of %f is %f", number, this.calculator.cube(number));
    }
}
