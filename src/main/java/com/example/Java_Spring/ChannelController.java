package com.example.Java_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/channels")
public class ChannelController {

    private final ChannelService channelService;

    @Autowired
    public ChannelController (ChannelService channelService) {
        this.channelService = channelService;
    }

    @PostMapping
    public ChannelDTO  createChannel(@RequestBody ChannelDTO channelDTO) {
        return channelService.createChannel(channelDTO);
    }

    @GetMapping
    public List<ChannelDTO> getAllChannels(){
        return channelService.getAllChannels();
    }

    @PostMapping("/{channelId}/messages")
    public ChannelDetail addMessage(@PathVariable Long channelId, @RequestParam String message) {
        return channelService.addMessage(channelId, message);
    }
}
