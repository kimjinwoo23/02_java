package nes.test8;

public class User {

	

	
	
	
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	
	public void setId(String id) {
		this.id = id;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getId() {
		return id;
	}


	public String getPassword() {
		return password;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public char getGender() {
		return gender;
	}


	public String getPhone() {
		return phone;
	}


	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", phone=" + phone + ", toString()=" + super.toString() + "]";
	}


	
	
	
	
	

	
	
	
	
	
}
	
	

