package HashMap;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// hashmap dont have any index, can be printed in random order
		HashMap<String, String> map = new HashMap<>();
		map.put("a", "aaa");
		map.remove("a");
		map.put("a", "XXX");
		map.put("b","bbb");
		map.put("c", "ccc");

		// keys should be unique


		System.out.println(map.get("c"));
		System.out.println(map);

		for (String temp : map.values()){
			System.out.println(temp); // prints the values
		}
		for(String temp: map.keySet()){
			System.out.println(temp); // prints the keys
		}


		for(String temp : map.values()){
			if (map.get("a") == ""){
				System.out.println("a does not exist");
				//map.put(key, value)
				
			}
			else{
				
				
			}
				
		}

		}



	}
