package com.example.Java_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscribers")
public class SubscriberController {
    @Autowired
    private SubscriberService subscriberService;

    @GetMapping
    public ResponseEntity<List<Subscriber>> getAllSubscribers(){
        return ResponseEntity.ok(subscriberService.getAllSubscribers());
    }

    @PostMapping
    public ResponseEntity<Subscriber> createSubscriber(@RequestBody Subscriber subscriber) {
        return ResponseEntity.ok(subscriberService.createSubscriber(subscriber));
    }
}
