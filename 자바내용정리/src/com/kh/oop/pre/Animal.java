package com.kh.oop.pre;
//상속 부모
public class Animal {
//필드 
	private String name;
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//메서드 
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public void makeSound() {
		System.out.println(name + "가 소리를 냅니다 ");
	}
	
	
	
	
	
	
}
