package com.learn.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Bank.entity.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer> {

}
