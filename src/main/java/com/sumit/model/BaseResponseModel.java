package com.sumit.model;

public class BaseResponseModel {

	private Dog dog;
	
	private ErrorModel error;

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public ErrorModel getError() {
		return error;
	}

	public void setError(ErrorModel error) {
		this.error = error;
	}
	
}
