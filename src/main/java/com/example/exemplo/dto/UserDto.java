package com.example.exemplo.dto;


import com.example.exemplo.controller.User;

public class UserDto {

    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UserDto(User user){
        this.nome = user.getNome();
    }
}
