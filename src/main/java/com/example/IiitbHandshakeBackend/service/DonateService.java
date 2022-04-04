package com.example.IiitbHandshakeBackend.service;

import com.example.IiitbHandshakeBackend.entity.Donate;
import com.example.IiitbHandshakeBackend.repo.DonateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonateService {
    @Autowired
    private DonateRepo donateRepo;

    public Donate addItem(Donate donate){
        donate.setAvailable(true);
        return donateRepo.save(donate);
    }

    public Donate getDetails(int did){
        return donateRepo.findById(did).orElse(null);
    }
}
