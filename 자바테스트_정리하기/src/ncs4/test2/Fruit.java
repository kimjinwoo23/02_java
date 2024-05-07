package ncs4.test2;

public class Fruit implements Comparable<Fruit>{

	private String name;
	private int price;
	private int quantity;
	
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

	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(Fruit 과일비교) {
		return this.name.compareTo(name);
	}
	
	
	
	
	
}
