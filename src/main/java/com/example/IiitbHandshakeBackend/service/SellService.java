package com.example.IiitbHandshakeBackend.service;

import com.example.IiitbHandshakeBackend.entity.Sell;
import com.example.IiitbHandshakeBackend.repo.SellRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellService {
    @Autowired
    private SellRepo sellRepo;

    public Sell addItem(Sell sell){
        sell.setAvailable(true);
        return sellRepo.save(sell);
    }

    public Sell getDetails(int id){
        return sellRepo.findById(id).orElse(null);
    }
}
