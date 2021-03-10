package com.sumit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DogDto {

	@JsonProperty("dog_id")
	private int dogId;
	
	@JsonProperty("dog_name")
	private String dogName;
	
	@JsonProperty("dog_age")
	private int dogAge;

	public int getDogId() {
		return dogId;
	}

	public void setDogId(int dogId) {
		this.dogId = dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getDogAge() {
		return dogAge;
	}

	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
}
