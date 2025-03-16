package com.example.Java_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubscriberService {
    @Autowired
    private SubscriberRepository subscriberRepository;

    public List<Subscriber> getAllSubscribers(){
        return subscriberRepository.findAll();
    }
  @Transactional
    public Subscriber createSubscriber(Subscriber subscriber){
        return subscriberRepository.save(subscriber);
    }
}
