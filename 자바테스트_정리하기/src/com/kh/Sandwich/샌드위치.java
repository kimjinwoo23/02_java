package com.kh.Sandwich;

public class 샌드위치 {

	private String 고객명;
	private String 샌드위치종류;
	
	public void set고객명(String 고객명) {
		this.고객명 = 고객명;
	}

	public void set샌드위치종류(String 샌드위치종류) {
		this.샌드위치종류 = 샌드위치종류;
	}

	public String get고객명() {
		return 고객명;
	}

	public String get샌드위치종류() {
		return 샌드위치종류;
	}

	public 샌드위치() {
		// TODO Auto-generated constructor stub
	}

	public 샌드위치(String 고객명, String 샌드위치종류) {
		super();
		this.고객명 = 고객명;
		this.샌드위치종류 = 샌드위치종류;
	}

	@Override
	public String toString() {
		return "샌드위치 [고객명=" + 고객명 + ", 샌드위치종류=" + 샌드위치종류 + "]";
	}
	
	
	
	
	
	
}
