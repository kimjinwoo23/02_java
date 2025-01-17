package com.kh.Test.main;

public class ParseStringPre2 {
	public static void main(String[] args) {
		//1. String으로 받은 핸드폰번호를 정수로 변경
		String phoneNumber = "01012345678";
		int num1 = Integer.parseInt(phoneNumber);
		System.out.println(num1);
		

		//2. String으로 받은 점수를 실수로 변경
		String score = "88.9";
		double num2 = Double.parseDouble(score);
		System.out.println(num2);
		
		//3. 정수로 받은 핸드폰 번호를 String으로 변환
		int phoneNumber2 = 102345678;
		String str1 = Integer.toString(phoneNumber2);
		System.out.println(str1);
		
		//4. 실수로 받은 점수를 String으로 변경
		double score2 = 72.5;
		String str2 = Double.toString(score2);
		System.out.println(str2);
		
		//문자열에서    -    하이픈 제거
		String phoneNumber3 = "010-1234-5678";
		//replace 어떤 값을 모두 변경 모두 바꾸기
		// ""안에 아무것도 작성해주지 않으면 삭제라는 의미로 사용
		String 하이픈제거 = phoneNumber3.replace("-", "");
		System.out.println("하이픈이 제거된 핸드폰 번호 : " + 하이픈제거);
		
		
		//주민번호에서 하이픈 제거
		String id = "230304-1234567";
		String 주민번호 = id.replace("-", "");
		System.out.println("하이픈이 제거된 주민등록번호 : " + 주민번호);
		//- 제거하고 숫자만 모두 보기
		
		//charAt(7)
		//주민등록 번호에서 하이픈을 제거하고 성별을 추출하기
		//				0  1  2  3  4  5  6  7  8
//		String id2 = "  2  4  0  1  0  1  3  4  5  6789";
		String id2 = "240101-3456789";
		String 주민번호2 = id2.replace("-", "");
		char 성별번호 = 주민번호2.charAt(6);
		System.out.println("성별 번호는 : " + 성별번호);
		
		//3항연산자를 사용해서 성별번호가 1또는 3이면 ? "남성" : "여성";
		String 성별 = ( 성별번호 =='1'  || 성별번호 =='3') ? "남성" : "여성";  
		System.out.println(성별);
		
		
		//주민번호에서 - 제거하고 삼항연산자를 사용해서 성별 추출
		String id3 = "200101-4567891";
		String 주민번호3= id3.replace("-", "");
		char 성별번호3= 주민번호3.charAt(6);
		//	  '   ' char 표기
		String 성별3 = (성별번호3 =='2' || 성별번호3 =='4') ? "여성" : "남성";
		System.out.println(성별3);
		
		String 주민번호4 = "870101-2345678";//index : 0 ~ 13  길이 : 14
		//주민번호가 앞에는 6자리가 맞는지 확인하고 뒤에는 7자리가 맞는지 확인
		
		boolean is주민 = 
				
				(주민번호4.length() == 14) && // 1. 주민등록번호가 - 포함해서 14자리가 맞는지
				(주민번호4.charAt(6) == '-') &&// 2. 주민등록번호 생년월일작성후 - 들어가 있는지
				(주민번호4.substring(0, 6).matches("[0-9]+")) && //3. 앞에 6자리가 숫자로만 이루어져 있는지
				(주민번호4.substring(7).matches("[0-9]+"));//4. 뒤에서7번부터 모두 숫자로 이루어져 있는지
		
		System.out.println("주민번호가 제대로 작성이 이루어졌나요? : " + is주민);
		
		
		
		
		
		
	}
}