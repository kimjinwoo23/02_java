package 자바_예제문제실습;

public class Person {

	private String 이름;
	private int 나이;
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	public String get이름() {
		return 이름;
	}
	public int get나이() {
		return 나이;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String 이름, int 나이) {
		super();
		this.이름 = 이름;
		this.나이 = 나이;
	}
	@Override
	public String toString() {
		return " [이름=" + 이름 + ", 나이=" + 나이 + "]";
	}
	
	
	
	
	
	
	
}
