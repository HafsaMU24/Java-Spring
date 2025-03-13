package com.example.Java_Spring;

import org.springframework.stereotype.Component;

@Component
public class ChannelMapper {
    public ChannelDTO toDTO(Channel channel){

        ChannelDTO dto = new ChannelDTO();
        dto.setName(channel.getName());
        return dto;
    }
    public  Channel toEntity(ChannelDTO dto){
        return new Channel(dto.getName());
    }
}
