package com.kh.Test.main.oop;
//동물 하나만 상속 implements Animal 동물 이외에 여러파일을 ,로 작성가능
//파일의 종류는 interface여야함
//동물에서 makeSound가 사용되지않고있어서 dog에 에러가나옴
public class Dog implements Animal , AnimalEat{
	//Animal에 있는 인터페이스 메서드 구현
	@Override//주석같은 의미로 생략을해도 괜찮지만 개발자간의 어쩌구로 작성해라
	public void makeSound() {
		System.out.println("멍멍");
		
		
		
	}

	@Override
	public void eat() {
		System.out.println("냠냠");
		
	}
	
	
}
