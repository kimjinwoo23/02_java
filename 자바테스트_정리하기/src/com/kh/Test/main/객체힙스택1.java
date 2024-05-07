package com.kh.Test.main;

public class 객체힙스택1 {

	public static void main(String[] args) {
		car 차 = new car();
		
		car 차1 = new car("소나타 ", 2019 , "화이트");
		System.out.println("차 :" + 차);
	
		System.out.println(	차.get차이름());
		System.out.println(차.get색상());
		System.out.println(차.get모델년도());
		
		
		System.out.println("차1 :" + 차1);
	
		System.out.println(차1.get차이름());
		System.out.println(차1.get모델년도());
		System.out.println(차1.get색상());
	}

}
