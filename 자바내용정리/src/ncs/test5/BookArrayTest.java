package ncs.test5;

public class BookArrayTest {

	
	public static void main(String[] args) {
		
		Book[] bArray = new Book[3];
		
		bArray[0] = new Book("자바의 정석","남궁성",30000, "도우출판",0.1);
		bArray[1] = new Book("열혈강의 자바","구정은",29000, "프리렉",0.1);
		bArray[2] = new Book("객체지향자바","금영욱",30000, "북스홈",0.1);
		
		
		
		
		for(Book b :  bArray) {
			System.out.println("Title : " + b.getTitle());
			System.out.println("Author : " + b.getAuthor());
			System.out.println("price : " + b.getPrice());
			System.out.println("publisher : " + b.getPublisher());
			System.out.println("discountRate : " + b.getDiscountRet());
			System.out.println("할인된가격 : " + b.get할인가());
			
			
			
			
		}
				
		
	}


}
