package com.example.Java_Spring;

import jakarta.validation.constraints.NotBlank;

public class ChannelDTO {
    @NotBlank(message = "Channel name is required")
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
