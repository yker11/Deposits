package com.MsDeposits.service;

import com.MsDeposits.model.Deposits;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

public interface IServiceDeposits {

    Flux<Deposits> findAll();

    Flux<Deposits> findDepositsByDay(Date fecha);

    Mono<Deposits> save(Deposits deposit);

}
