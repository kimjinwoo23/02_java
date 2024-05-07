package nce.test11;
//내림차순으로 정렬하는 Comparator<Integer>을 사용 

import java.util.Comparator;

public class Decending implements Comparator<Integer>{

	
	@Override
	public int compare(Integer o1 , Integer o2) {
		return o2 - o1;
	}
	/*
	 o1 이 o2 보다 작으면 거꾸로 
	 o1이 o2랑같으면 0 
	 o1이 o2보다 크면 올바르게
	 
	 
	 
	 */
	
}
