package com.kh.Test.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate3 {

	public static void main(String[] args) {
		
		int 태어난년도 = 2000;
		int 태어난월 =2;
		int 태어난날짜 = 16;
		
		Calendar 현재 = Calendar.getInstance();
		int 현재년도 = 현재.get(Calendar.YEAR);
		int 현재월 = 현재.get(Calendar.MONTH);
		int 현재날짜 = 현재.get(Calendar.DAY_OF_MONTH);
		
		int 나이 =현재년도 - 태어난년도;
		
		if(현재월 < 태어난월 || (태어난월 == 현재월 && 현재날짜 < 태어난날짜)) {
			나이--;
		}
		Calendar 생일 = new GregorianCalendar(태어난년도,태어난월 -1,태어난날짜);
		SimpleDateFormat 날짜예쁘게작성 = new SimpleDateFormat("yyyy년 M월 d일");
		
		System.out.println("생일은 : " + 날짜예쁘게작성.format(생일.getTime()));
		System.out.println("현재 : " + 날짜예쁘게작성.format(현재.getTime()));
		System.out.println("나이 : " + 나이 + " 세");
	}
	
	
	
	
	
	
}
