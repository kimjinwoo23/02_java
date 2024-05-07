package sup2.Controller;

import java.util.Scanner;

import sup2.model.Student;

public class Testsup2 {
	
	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	String 이름 = sc.nextLine();
	int 학년 = sc.nextInt();
	int 반 = sc.nextInt();
	int 번호 = sc.nextInt();
	String 성별 = sc.next();
	double 성적 = sc.nextDouble();
	System.out.println("이름 : " + 이름 ,"학년" + 학년 ,"반 : " + 반 , "번호"
			+번호 , "성별 : " + 성별 ,"성적 : " + 성적 );
	
	Student 학생 = new Student();
	
	
}
}