package com.learn.Bank.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountHolderDto {
	
	private int accountNumber;
	private String fName;
	private String lName;
	private int pin;
	private int age;

}
