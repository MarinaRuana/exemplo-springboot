package com.example.exemplo.controller;

import com.example.exemplo.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController  // Indica que essa classe é um controller Rest
@RequestMapping("/user") //Indica que o "/user" é usado para acionar esse controler
public class Hello {

    @GetMapping("/ola/{nome}/{id}")// Este método é acionado por uma requisição GET
    public String digaHello(@PathVariable String nome, @PathVariable int id){
        return "Ola " + nome + " !" + " " + id ;
    }

    @GetMapping("/ola")// Este método é acionado por uma requisição GET
    public String digaHello2(@RequestParam String nome, @RequestParam int id){
        return "Ola! " + nome + " !" + " " + id ;
    }

    @PostMapping
    public ResponseEntity<UserDto> getUser(@RequestBody User user){
        UserDto userDto = new UserDto(user);
        if(user.getId() == 123) {
            return new ResponseEntity(userDto, HttpStatus.OK);
        }
        return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
    }
}
