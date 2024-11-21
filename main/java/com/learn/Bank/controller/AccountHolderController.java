package com.learn.Bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Bank.Dto.AccountHolderDto;
import com.learn.Bank.service.AccountHolderService;

@RestController
@RequestMapping("/accountholders")

public class AccountHolderController {
	
AccountHolderService accountholService;

public ResponseEntity<AccountHolderDto> addaccounth(@RequestBody AccountHolderDto accountHolderDto);

}
