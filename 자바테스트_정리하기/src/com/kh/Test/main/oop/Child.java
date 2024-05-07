package com.kh.Test.main.oop;
//자식클래스로 부모클래스를 상속 extends 인터페이스가 아니라 클래스를 상속받을떄는
//하나밖에 상속을 못받기떄문에 extends를 사용 후 하나의 클래스만 작성
public class Child extends Parent{
//필드 
	int 자식변수;
	
	public Child() {
		// TODO Auto-generated constructor stub
	}
	
			//부모 변수는 Parent 에서 가져올 예정
	public Child(/*int 부모변수 ,*/ int 자식변수) {
		//super();//부모변수에 어떻게받아서 가져가겠다라는 것이 없기때문에 뜨는 에러 
		//부모변수에도 기본생성자를 넣어서 작성 
		this.자식변수 = 자식변수;
	}
	
	
	public void 자식메서드() {
		super.부모메서드();
		System.out.println("자식도 호출함");
	}
	
	
}
