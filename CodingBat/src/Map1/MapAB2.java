package Map1;
/*
 * Modify and return the given map as follows: 
 * if the keys "a" and "b" are both in the map and have equal values, remove them both.

	mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
	mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
	mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
 */

import java.util.HashMap;

public class MapAB2 {

	public HashMap<String, String> mapAB2 (HashMap<String, String> map){
		if(map.get("a") == map.get("b")){
			map.remove("a");
			map.remove("b");
		}
		return map;
	}
}
