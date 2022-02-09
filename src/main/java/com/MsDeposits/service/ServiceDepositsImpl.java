package com.MsDeposits.service;


import com.MsDeposits.model.Deposits;
import com.MsDeposits.repository.IDepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service
public class ServiceDepositsImpl implements IServiceDeposits {

    @Autowired
    IDepositRepository repository;

    @Override
    public Flux<Deposits> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<Deposits> findDepositsByDay(Date fecha) {
        return repository.findAll().filter(x -> x.getFecha() == fecha);
    }

    @Override
    public Mono<Deposits> save(Deposits deposit) {
        return repository.save(deposit);
    }


}
