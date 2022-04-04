package com.example.IiitbHandshakeBackend.service;

import com.example.IiitbHandshakeBackend.entity.Donate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonateService {
    @Autowired
    private DonateService donateService;

    public Donate addItem(Donate donate){
        donate.setAvailable(true);
        return donateService.addItem(donate);
    }
}
