package nes.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {

	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;
	
	
	public void setProductName(String productName) {
		this.productName = productName;
	}


	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}


	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}


	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}


	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}


	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}


	public String getProductName() {
		return productName;
	}


	public Date getPutDate() {
		return putDate;
	}


	public Date getGetDate() {
		return getDate;
	}


	public int getPutAmount() {
		return putAmount;
	}


	public int getGetAmount() {
		return getAmount;
	}


	public int getInventoryAmount() {
		return inventoryAmount;
	}


	public Inventory() {
		// TODO Auto-generated constructor stub
	}

		
	public Inventory(String productName, Date putDate,  int putAmount) {
		super();
		this.productName = productName;
		this.putDate = putDate;
		//this.getDate = getDate;
		this.putAmount = putAmount;
		//this.getAmount = getAmount;
		//this.inventoryAmount = inventoryAmount;
	}


	@Override
	public String toString() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		String 문자열반환 = dateFormat.format(putDate);
		String 출고일변환 = dateFormat.format(getDate);
		
		int 남은재고 = putAmount - getAmount;
		
		return "Inventory [productName=" + productName + ", putDate=" + 문자열반환 + ", getDate=" + 출고일변환
				+ ", putAmount=" + putAmount + ", getAmount=" + getAmount + ", inventoryAmount=" + inventoryAmount
				+ "]";
	}
	
	
	
	
	
}
