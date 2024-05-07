package com.kh.HambergerOrder;

public class HambergerOrder {

	private String 고객명;
	private String 버거타입;
	
	public void set고객명(String 고객명) {
		this.고객명 = 고객명;
	}

	public void set버거타입(String 버거타입) {
		this.버거타입 = 버거타입;
	}

	public String get고객명() {
		return 고객명;
	}

	public String get버거타입() {
		return 버거타입;
	}

	public HambergerOrder() {
		// TODO Auto-generated constructor stub
	}

	public HambergerOrder(String 고객명, String 버거타입) {
		super();
		this.고객명 = 고객명;
		this.버거타입 = 버거타입;
	}

	@Override
	public String toString() {
		return "HambergerOrder [고객명=" + 고객명 + ", 버거타입=" + 버거타입 + "]";
	}
	
	
	
}
