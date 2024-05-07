package com.kh.CollectionEx;
/*
 Date
 	날짜와 시간을 나타내는 클래스 
 	현재시간이나 특정시점의 시간을 표현 
 	날짜와 시간연산을 위한 다양한 기능을 제공하지 않기때문에 
 	java.time 폴더에 LocalDate LocalTime 등 다양한 클래스를 새롭게 도입함
 	
 	Date 에서 변형된 날짜값으로 사용하는것을 권장 
 	
 SimpleDateFormat
 	년도	 월  일 	 시간 분	초 요일 
	yyyy-MM-dd , HH:mm:ss eeee
	
	기본값 
	SimpleDateFormat 변수명 = new SimpleDateFormat(); //24.5.3.오전 10:44로표기
	특정 시간이나 날짜만 출력하고싶다면 format으로 출력하기
	
	
 	날짜 및 시간을 개발자나 사용자가 원하는 기준으로 형식을 맞춰서 사용 
 	사용자가 지정한 패턴을 문자열로 형식화 하거나 
 	문자열을 날짜 객체로 변환해서 사용하는 기능을 제공 
 	
  	format(Date date) :날짜 시간 형식 
  					: 날짜(Date) ->문자열(String)
  	parse(String date) : 문자열을 날짜 시간 형식으로 변환 
  						문자열로 이루어진 날짜를  -> 날짜(Date)
 
 
 
 
 */
public class 날짜 {

}
