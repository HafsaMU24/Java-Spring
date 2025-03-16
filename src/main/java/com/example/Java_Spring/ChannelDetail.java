package com.example.Java_Spring;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class ChannelDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Message cannot be empty")
    private String message;

    @ManyToOne
    @JoinColumn(name = "channel_id", nullable = false)
    private Channel channel;

    public ChannelDetail(){}

    public ChannelDetail(String message, Channel channel){
        this.message = message;
        this.channel = channel;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public  String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public Channel getChannel(){
        return channel;
    }
    public void setChannel(Channel channel){
        this.channel = channel;
    }
}
