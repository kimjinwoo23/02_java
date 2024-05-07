package com.kh.Test.main;

public class car {
//필드 
	private String 차이름;
	private int 모델년도;
	private String 색상;
	
	
	
	public void set차이름(String 차이름) {
		this.차이름 = 차이름;
	}



	public void set모델년도(int 모델년도) {
		this.모델년도 = 모델년도;
	}



	public void set색상(String 색상) {
		this.색상 = 색상;
	}



	public String get차이름() {
		return 차이름;
	}



	public int get모델년도() {
		return 모델년도;
	}



	public String get색상() {
		return 색상;
	}



	public car() {
		this("K5 ", 2020 ,"검정색");
	}



	public car(String 차이름, int 모델년도, String 색상) {
		super();
		this.차이름 = 차이름;
		this.모델년도 = 모델년도;
		this.색상 = 색상;
	}
	
	public String 정보() {
		return this.모델년도 + "년식" + this.차이름 + " " + this.색상;
		
	}
	public static void main(String[] args) {
		car newcar = new car();
		System.out.println(newcar.정보());
		
	}
	
	
	
	
	
}

