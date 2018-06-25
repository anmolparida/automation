package Map1;

import java.util.HashMap;

/*
 * Given a map of food keys and their topping values, modify and return the map as follows:
 * If the key "ice cream" has a value, set that as the value for the key "yogurt" also. 
 * If the key "spinach" has a value, change that value to "nuts".
 * 
	topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
	topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
	topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
 */

public class Topping2 {
	
	public HashMap<String,String> topping2 (HashMap<String, String> map){
		if (map.containsKey("ice cream")){
			map.put("yogurt", map.get("ice cream"));	
		}
		if(map.containsKey("spinach")){
			map.put("spinach", "nuts");
		}
		return map;
	}

}
