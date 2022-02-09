package com.MsDeposits.repository;

import com.MsDeposits.model.Deposits;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepositRepository extends ReactiveMongoRepository<Deposits, String> {


}
