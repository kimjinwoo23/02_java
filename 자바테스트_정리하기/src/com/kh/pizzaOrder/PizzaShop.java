package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaShop {
	
	ArrayList<PizzaOrder> 주문리스트 = new ArrayList<>();

	ArrayList<String> 고객리스트 = new ArrayList<>(Arrays.asList("고영희","박철진","안영식","고영희","박철진"));
	ArrayList<String> 피자리스트 = new ArrayList<>(Arrays.asList("페퍼로니","마르게리따","슈프림","파인애플","치즈"));
	
	//for문으로 주문추가 
	for(int i =0; i < 고객리스트.size(); i++) {
		PizzaOrder  오더 =new PizzaOrder(고객리스트.get(i),피자리스트.get(i));
		주문리스트.add(오더);
		
		
	}
	
	
	
	
	
	
}
}