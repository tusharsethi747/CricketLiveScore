package com.crick.apis.CrickInformerBackend.controller;


import com.crick.apis.CrickInformerBackend.entities.Match;
import com.crick.apis.CrickInformerBackend.services.CrickService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/Match")

public class MatchController {
    public CrickService crickService;
    public MatchController(CrickService crickService) {
        this.crickService = crickService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatch() throws InterruptedException {
//        System.out.println("getting live match");
        return new ResponseEntity<>(this.crickService.getLiveMatch(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Match>> getMatch() throws InterruptedException {
        return new ResponseEntity<>(this.crickService.getAllMatches(), HttpStatus.OK);
    }

}
