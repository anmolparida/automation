package Map1;

import java.util.HashMap;

/*
 * 
Modify and return the given map as follows: 
If exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.

	mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
	mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
	mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}

 */

public class MapAB3 {

	public HashMap<String, String> mapAB3 (HashMap<String, String> map){

		if (map.containsKey("a") && !map.containsKey("b")){
			map.put("b", map.get("a"));
		}
		if (map.containsKey("b") && !map.containsKey("a")){
			map.put("a", map.get("b"));
		}
		return map;
	}
}
