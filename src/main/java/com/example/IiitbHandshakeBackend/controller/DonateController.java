package com.example.IiitbHandshakeBackend.controller;

import com.example.IiitbHandshakeBackend.entity.Donate;
import com.example.IiitbHandshakeBackend.service.DonateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/Donate")
public class DonateController {
    @Autowired
    private DonateService donateService;

    @PostMapping("/addItem")
    public ResponseEntity<?> addItem(@RequestBody Donate donate){
        return ResponseEntity.ok(donateService.addItem(donate));
    }

    @GetMapping("/getDetails/{did}")
    public ResponseEntity<?> getDetails(@PathVariable("did") int did){
        return ResponseEntity.ok(donateService.getDetails(did));
    }
}
