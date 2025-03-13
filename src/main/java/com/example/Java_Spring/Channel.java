package com.example.Java_Spring;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Channel name is required")
    private String name;

    @OneToMany(mappedBy = "channel",cascade = CascadeType.ALL)
    private List<ChannelDetail> message;

       public Channel(){}
           public Channel(String name){
               this.name = name;
           }
        public Long getId(){
               return id;
           }
           public void setId(Long id){
               this.id = id;
           }
           public String getName(){
               return name;
           }
           public void setName(String name){
               this.name = name;
           }
           public List<ChannelDetail> getMessages(){
               return messages;
           }
           public void setMessages(List<ChannelDetail> messages){
               this.messages = messages;
           }
    }

