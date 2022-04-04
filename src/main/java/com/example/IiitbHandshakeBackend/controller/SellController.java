package com.example.IiitbHandshakeBackend.controller;

import com.example.IiitbHandshakeBackend.entity.Sell;
import com.example.IiitbHandshakeBackend.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sell")
public class SellController {
    @Autowired
    private SellService sellService;

    @PostMapping("/addItem")
    public ResponseEntity<?> addItem(@RequestBody Sell sell){
        return ResponseEntity.ok(sellService.addItem(sell));
    }
}
