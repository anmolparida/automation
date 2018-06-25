package Map2;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and 
its value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */

public class WordMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <String,Boolean> m = new HashMap<String, Boolean>();
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("b");
		//list.add("c");

		
		//Generic Code
		for (String temp : list){
			int vCount = 0;
			for (int i = 0; i < list.size(); i++ ){
				if(temp == list.get(i)){
					vCount++;
				}
				if(vCount > 1){
					m.put(list.get(i), true);
					break;
				}
				else if(!m.containsKey(list.get(i))){
					m.put(list.get(i), false);
				}
			}
		}
		System.out.println(m);
	}
}