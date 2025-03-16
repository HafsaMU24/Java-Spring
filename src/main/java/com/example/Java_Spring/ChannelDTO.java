package com.example.Java_Spring;

import java.util.List;

public class ChannelDTO {

    private Long id;

    private String name;

    private ChannelDetail channelDetail;

    private List<Long> messagesId;

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ChannelDetail getChannelDetail() {
        return channelDetail;
    }

    public void setChannelDetail(ChannelDetail channelDetail) {
        this.channelDetail = channelDetail;
    }
}