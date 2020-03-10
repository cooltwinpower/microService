package com.microservice.board.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
	String name;
	int amount;
	
	public HelloResponseDto(String name, int amount) {
		setName(name);
		setAmount(amount);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private void setAmount(int amount) {
		this.amount = amount;
	}
}
