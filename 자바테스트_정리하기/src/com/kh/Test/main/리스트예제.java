package com.kh.Test.main;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트예제 {

	public static void main(String[] args) {
		//ArrayList생성
		ArrayList<String>리스트 = new ArrayList<>(Arrays.asList("바나나","오렌지"));
		//값추가 
		리스트.add("사과");
		
		System.out.println(리스트);
		
		리스트.remove("바나나");
		리스트.remove(0);
		System.out.println(리스트);//사과는 2번인덱스에서 0번으로 이동 
		
		리스트.set(0, "체리");
		System.out.println(리스트);
		
		
		리스트.add(2,"파파야");
		
		//리스트는 0부터 +1 해서 자리가 생기는것이기떄문에
		//1이 비어있어서 에러가남
		
		System.out.println(리스트);
		
		
		
		
	}
	
	
}
