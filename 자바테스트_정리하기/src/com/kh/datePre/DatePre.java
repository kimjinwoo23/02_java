package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {
	public static void main(String[] args) {
		//현재 날짜 시간
		Date now = new Date();
		
		System.out.println(now);
		//형식을 SimpleDateFormat 사용해서 변경
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//now로 받은 날짜를 문자열로 SimpleDateFormat 사용해서 변경
		String formatDate = sdf.format(now);
		System.out.println("날짜 형식 변경 : " + formatDate);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		String formatsdf2 = sdf2.format(now);
		System.out.println(formatsdf2);
		
		//문자열을(SimpleDateFormat-String) 날짜(Date)로 변경 
		String 문자열 = "2024 -04-30 15:30:45";
		
		try {
			Date parseDate = sdf.parse(문자열);
			System.out.println(parseDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
