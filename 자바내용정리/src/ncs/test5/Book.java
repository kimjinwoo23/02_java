package ncs.test5;

public class Book {

	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setDiscountRet(double discountRet) {
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getDiscountRet() {
		return discountRate;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price, String publisher, double discountRet) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}
	
	//할인율과 정상가격을 확인해서 할인가를 구하고싶을때
	public int get할인가() {
		//할인하는 계산방식 실수 
		double discountAmount = price * discountRate;
		
		//정상가에서 -%만큼 할인이들어간 금액작성 
		int 할인가격 = (int)(price-discountAmount);
		return 할인가격;
		
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher
				+ ", discountRet=" + discountRate + "]";
	}
	
	
	
	
	
}
