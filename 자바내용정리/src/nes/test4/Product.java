package nes.test4;

public class Product {

	private String name;
	private int price;
	private int quantity;
	private char[] 정보;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public Product() {
	}
	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String 정보() {
		return "상품명 : " + name + "가격 : " + price + "원 " + "수량 : " + 
	quantity + "총 구매가격 : " + getPrice() + "원";
		
		
		
		Product 상품 = new Product(name, price , quantity);
		
		System.out.println(상품.정보());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
