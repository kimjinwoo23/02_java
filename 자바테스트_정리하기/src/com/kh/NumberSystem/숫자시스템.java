package com.kh.NumberSystem;

public class 숫자시스템 {

	public static void main(String[] args) {
		
		int 숫자 = 42;
		
		//42라는 숫자를 2진수로 변환 
		String 이진수 = Integer.toBinaryString(숫자);
		System.out.println(이진수);
		
		String 팔진수 = Integer.toOctalString(숫자);
		System.out.println(팔진수);
		
		//42를->2진수로 변환된 값을 가져와서 10진수로 변환 
		String 이진수2 = "101010";
		int 십진수 = Integer.parseInt(이진수2,2);
		System.out.println(십진수);
		
		//(2~16) 진수 - > 십진수 parseInt를 사용해서 변경
		
		//팔진수를 십진수 변환 
		String 팔진수2 = "52";
		int 십진수2 = Integer.parseInt(팔진수2,8);
		System.out.println(십진수2);
		
	}

}
