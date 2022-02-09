package com.MsDeposits.controller;

import com.MsDeposits.model.Deposits;
import com.MsDeposits.service.IServiceDeposits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class ControllerDeposits {

    @Autowired
    IServiceDeposits service;

    @GetMapping("/getDeposits")
    public Flux<Deposits> getDeposit() {
        return service.findAll();
    }

    @GetMapping("/getDepositsByDay")
    public Flux<Deposits> getDepositsByDay(@PathVariable("fecha") Date fecha) {

        return service.findDepositsByDay(fecha);
    }

    @PostMapping("/postDeposits")
    Mono<Deposits> postDeposit(@RequestBody Deposits deposit) {
        return service.save(deposit);
    }
}
