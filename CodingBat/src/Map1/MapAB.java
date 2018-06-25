package Map1;

import java.util.HashMap;

/*
 * Modify and return the given map as follows: 
 * For this problem the map may or may not contain the "a" and "b" keys. 
 * If both keys are present, append their 2 string values together and store the result under the key "ab".

	mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
	mapAB({"a": "Hi"}) → {"a": "Hi"}
	mapAB({"b": "There"}) → {"b": "There"}
 */

public class MapAB {

	public HashMap<String, String> mapAB(HashMap<String, String> mab){
		if(mab.containsKey("a") && mab.containsKey("b")){
			mab.put("ab", (mab.get("a") + mab.get("b")));
		}
		return mab;
		
		
	}
}
