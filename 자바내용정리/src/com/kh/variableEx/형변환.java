package com.kh.variableEx;
/*
 (자료)형변환 
 데이터 타입을 변환하는 것 
 변환에는 자동으로 변환하는 형변환 
 강제로 변환하는 형변환 
 
 자동으로 형변환이 가능한 경우는 자료형의 byte가 서로 같거나 
 변환하는 결과가 변환 전 byte보다 클 경우에는 자동으로 형변환이 가능 
 큰 byte에서 작은 byte로 넘어갈때는 큰 그릇에서 작은그릇으로 
 이동하기 때문에 강제로 넣어줘야함 ( 강제로넣을경우 데이터손실가능성존재)
 
 자동형변환 ()를 생략해도되고 생략하지않아도 됨 
 예시 
 int 숫자 = 10; 
 double 실수 = (double) 10; //(double)이 생략되도가능 
 
 강제형변환은 () 를 무조건넣어줘야함 
 예시 
 	double 실수 = 1.0;
 	int 숫자 = (int)실수;
 	
 	메서드 호출을 통한 형변환 
 	
 	객체자료형.parse자료형(변환할 값);
 	Integer.parseInt(변환할String 변수);
 	Double.parseDouble(변환할 String변수);
 	
 	일부 데이터들은 메서들을 통해 값 변환이 진행됨 
 	문자열 String 으로 닮은 값을 숫자계열로 변경하고싶을때 많이사용 
 	
 	예를 들어 문자열을 정수로 변환하길 원한다면 
 	String 핸드폰번호 = "01012345678";
 	Integer.parseInt(핸드폰번호);//숫자로변경
 	
 	숫자자료형 -> String 
 	객체자료형.toString(변환할숫자변수);
 	Integer.toString(변환할 숫자변수);
 	Double.toString(변환할 숫자변수);
 
 
 
 
 */
public class 형변환 {

	
	
}
