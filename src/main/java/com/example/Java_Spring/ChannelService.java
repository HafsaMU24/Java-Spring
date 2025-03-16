package com.example.Java_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChannelService {

    private final ChannelRepository channelRepository;
    private final ChannelDetailRepository channelDetailRepository;
    private final ChannelMapper channelMapper;

    @Autowired
    public ChannelService(ChannelRepository channelRepository, ChannelDetailRepository channelDetailRepository, ChannelMapper channelMapper) {
        this.channelRepository = channelRepository;
        this.channelDetailRepository = channelDetailRepository;
        this.channelMapper = channelMapper;
    }

    @Transactional
    public ChannelDTO createChannel(ChannelDTO channelDTO) {
        Channel channel = channelMapper.toEntity(channelDTO);
        channel = channelRepository.save(channel);
        return channelMapper.toDTO(channel);
    }
    public List<ChannelDTO> getAllChannels(){
        return channelRepository.findAll()
                .stream()
                .map(channelMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    public ChannelDetail addMessage(Long channelId, String message) {
        Channel channel = channelRepository.findById(channelId)
                .orElseThrow(() -> new RuntimeException("channel not found"));
        ChannelDetail channelDetail = new ChannelDetail(message, channel);
        return channelDetailRepository.save(channelDetail);
    }
}
