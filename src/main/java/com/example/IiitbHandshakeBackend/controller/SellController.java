package com.example.IiitbHandshakeBackend.controller;

import com.example.IiitbHandshakeBackend.entity.Sell;
import com.example.IiitbHandshakeBackend.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/sell")
public class SellController {
    @Autowired
    private SellService sellService;

    @PostMapping("/addItem")
    public ResponseEntity<?> addItem(@RequestBody Sell sell){
        return ResponseEntity.ok(sellService.addItem(sell));
    }

    @GetMapping("/getDetails/{sid}")
    public ResponseEntity<?> getDetails(@PathVariable("sid") int sid){
        return ResponseEntity.ok(sellService.getDetails(sid));
    }
}
