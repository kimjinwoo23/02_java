package ncs.Test10;

public class BookStore {

	public static void main(String[] args) {
		
		Book 책정보;
		BookUpdate 정보수정;
		
		책정보 = new Book("IT", "HTML5",30000.0 , 15.0);
		System.out.println("기본정보 ");
		System.out.println(책정보.get책이름() + " " + 책정보.get책가격());
		
		정보수정 = new BookUpdate(책정보);
		
		정보수정.책가격변경();
		System.out.println("변경된 가격 정보 ");
		System.out.println(책정보.get책이름()+ " " + 책정보.get책가격());
		
		
	}
	
	
	
}
