package 자바_예제문제실습;

import java.util.Scanner;

/*
 사용자에게 문자열을 입력 받아 문자열의 길이를 출력하기 
 입력한 문자열이 finish면 프로그램을 종료하길원함
 
 
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력해주세요");
			String str = sc.nextLine();
			if(str == "finish") {
				break;
			}else {
				System.out.println(str.length() + " 글자입니다");
				
			}
				
		}
		System.out.println("프로그램을 종료합니다");
		
		
		
	}

}
