package com.example.Java_Spring;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ChannelMapper {

    ChannelMapper INSTANCE = Mappers.getMapper(ChannelMapper.class);

   // Konverterar Channel till channelDTO, ignorerar ChannelDetail om det inte behövs
@Mapping(target = "channelDetail", ignore = true)
    ChannelDTO toDTO(Channel channel);
  // Konverterar ChannelDTO till Channel
    Channel toEntity(ChannelDTO dto);
    }

