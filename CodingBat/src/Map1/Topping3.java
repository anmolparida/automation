package Map1;

import java.util.HashMap;

/*
	topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
	topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
	topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
 */

public class Topping3 {
	
	public  HashMap<String, String> topping3 (HashMap <String, String> map){
		if(map.containsKey("potato")){
			map.put("fries", map.get("potato"));
		}
		if(map.containsKey("salad")){
			map.put("spinach", map.get("salad"));
		}
		
		return map;
	}

}
