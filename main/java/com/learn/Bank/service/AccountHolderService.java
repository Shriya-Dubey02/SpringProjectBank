package com.learn.Bank.service;

import java.util.List;

import com.learn.Bank.Dto.AccountHolderDto;
import com.learn.Bank.entity.AccountHolder;

public interface AccountHolderService {
	
	// to add user
	AccountHolderDto addaccounth(AccountHolderDto accountHolderDto);
	
	List<AccountHolderDto> getallAccountHolderDtos();
	
	AccountHolderDto getAccountHolderByIdAccountHolderDto(Integer Id);
	
	AccountHolderDto updaDto(Integer accountNumber,AccountHolderDto accountDto);
	
	Integer deleteAccountHol(Integer accountNumber);
	

}
