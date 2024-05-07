package nes.test13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Maptest {

	public static void main(String[] args) {
		
		Map<String , Inventory> inventoryMap = new HashMap<>();
		
		//상품정보 String 으로 어떤 핸드폰인지 작성 Inventory 핸드폰 정보 넣기 
		//상품정보 등록 
		Calendar 캘린더 = Calendar.getInstance();
		캘린더.set(2016, 캘린더.MARCH,15);
		inventoryMap.put("삼성 갤럭시 S7", new Inventory("삼성 갤럭시 s7",캘린더.getTime(),30));
		캘린더.set(2016, 캘린더.FEBRUARY,25);
		inventoryMap.put("Lg g5", new Inventory("Lg g5",캘린더.getTime(),30));
		캘린더.set(2016, 캘린더.APRIL,23);
		inventoryMap.put("애플 아이폰", new Inventory("애플 아이폰",캘린더.getTime(),30));
		try {
		inventoryMap.get("삼성갤럭시S7").setGetDate(캘린더.getTime());//출고날짜 
		inventoryMap.get("삼성갤럭시S7").setGetAmount(10);//출고 갯수
		
		inventoryMap.get("Lg g5").setGetDate(캘린더.getTime());
		inventoryMap.get("Lg g5").setGetAmount(10);
		
		inventoryMap.get("애플아이폰").setGetDate(캘린더.getTime());
		inventoryMap.get("애플아이폰").setGetAmount(10);
		
		
		for(Inventory e : inventoryMap.values()) {
			System.out.println(e.toString());//상품 정보출력
		}
		//현재는 팔린 제품이 없기때문에 출고일과 수량 남은수량은 없습니다
		
		//만약에 제품이 존재하지않을경우 AmountNotEnough 넣고 사용할것
		
		for(Inventory 인벤토리 : inventoryMap.values()) {
			if(인벤토리.getGetAmount() > 인벤토리.getGetAmount()) {
				throw new AmountNotEnough("수량부족");
			}
		}
		
		}catch(AmountNotEnough e) {
			
		}
	}
	
	
	
	
	
	
}
