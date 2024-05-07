package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		//Date로 현재날짜를 받아서 년 월 일 출력하기 
		//Date는 최초 1회만 호출 
		//SimpleDateFormat sdf1 =
		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String fsdf1 = sdf1.format(d);
		System.out.println(fsdf1);
		
			String 날짜 = "2024-05-03";
		
		try {
			Date parseDate1 = sdf1.parse(날짜);
			System.out.println(parseDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//문자열(SimpleDateFormat-String) -> 날짜(Date)변경
		//Date parseDate1 

		//시 분 초 
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String sdf22 = sdf2.format(d);
		System.out.println(sdf22);
		
		//문자열(SimpleDateFormat-String) -> 날짜(Date)변경
				//Date parseDate2
		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat();
		String formatsdf3 = sdf3.format(d);
		System.out.println(formatsdf3);
		
		//문자열(SimpleDateFormat-String) -> 날짜(Date)변경
				//Date parseDate3
		
		
	}
	
}
