package com.learn.Bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountHolder {
	
	@Id
	private int accountNumber;
	@Column(nullable = false)
	private String fName;
	@Column(nullable = false)
	private String lName;
	@Column(nullable= false, unique = true)
	private int pin;
	@Column(nullable = false)
	private int age;
	
	

}
