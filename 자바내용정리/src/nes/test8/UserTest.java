package nes.test8;

public class UserTest {

	public static void main(String[] args) {
		//User 객체를 담을 배열선언 
		User[] users = new User[3];
		//3개의 유저 객체생성 
		 users[0] = new User("김 씨" , "비번 1 " , "철수야 ", 32,'M',"010-3333-3333");
		 users[1] = new User("이 씨" , "비번 2 " , "영희 ", 23,'F',"010-3131-2223");
		 users[2] = new User("감 씨" , "비번 3 " , "황진희 ", 25,'F',"010-1255-2223");
		
		for(User user : users) {
			System.out.println(user.toString());
		}
		//내가만든 유저정보를 그대로 복사해서 복사가 잘되었는지 출력 
		User[] 유저복사 = new User[users.length];
		//유저를 처음부터 끝까지 모두 복사 
		for(int i = 0; i <users.length; i++) {
//			유저복사[i] = users[i].clone();
		}
		
		
		
	}
	
	
	
	
}
