package com.sumit.model;

public class Dog {

	private int id;
	private String name;
	private int age;
	
	public static Dog of(int id,String name,int age)
	{
		Dog dog = new Dog();
		dog.setId(id);
		dog.setName(name);
		dog.setAge(age);
		return dog;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
