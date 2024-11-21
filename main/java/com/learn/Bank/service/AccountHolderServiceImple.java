package com.learn.Bank.service;

import java.util.UUID;

import com.learn.Bank.Dto.AccountHolderDto;
import com.learn.Bank.repository.AccountHolderRepository;

public class AccountHolderServiceImple implements AccountHolderService{
	
	AccountHolderRepository accountRepository;
	
	@Override
	public AccountHolderDto addAccountHolderDto(AccountHolderDto accountHolderDto) {
		UUID randomUUID= UUID.randomUUID();
		int accountnumber=randomUUID.toString();
		accountHolderDto.setAccountNumber(accountnumber);
		return null;
	}

}
