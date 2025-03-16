package com.example.Java_Spring;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Channel name is required")
    private String name;

    @OneToMany(mappedBy = "channel", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ChannelDetail> messages = new HashSet<>();


    @ManyToMany
    @JoinTable(
            name = "channel_tags",
            joinColumns = @JoinColumn(name = "channel_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))

    private Set<Tag> tags = new HashSet<>();

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
           public Set<ChannelDetail> getMessages(){
               return messages;
           }
           public void setMessages(Set<ChannelDetail>messags) {
           this.messages = messags;
           }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags){
               this.tags = tags;
           }
    }

