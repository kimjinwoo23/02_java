package com.kh.datePre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre3 {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd/E");
		System.out.println(sdf);
		
		//sdf는 변환하고싶은 규칙일뿐이지 날짜를 가져올수있는건 아님
		String formatsdf = sdf.format(now);
		System.out.println(formatsdf);
		
		System.out.println("주민번호를 8자리 입력하세요");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		String formatsdf2 = sdf2.format(now);
		System.out.println(formatsdf2);
		
		
		
		
		System.out.println("주민번호를 6자리 입력하세요");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyMMdd");
		String formatsdf3 = sdf3.format(now);
		System.out.println(formatsdf3);
		
		
		
	}
	
	
	
	
}
