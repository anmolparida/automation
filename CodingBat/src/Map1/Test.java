package Map1;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
		mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
		mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
		 */
		
		HashMap <String, String> map1 = new HashMap<String, String>();
		map1.put("a", "candy");
		map1.put("e", "dirt");
		map1.put("c", "Remove");
		MapBully mb = new MapBully();
		System.out.println("mapBully	" + mb.mapBully(map1));
		
		/*
		mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
		mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
		mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
		 */
		
		HashMap <String, String> map2 = new HashMap<String, String>();
		map2.put("a", "aaa");
		map2.put("b", "xyz");
		map2.put("c", "meh");
		map2.put("d", "hi");
		MapShare ms = new MapShare();
		System.out.println("mapShare	" + ms.mapShare(map2));
		
		/*
		mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
		mapAB({"a": "Hi"}) → {"a": "Hi"}
		mapAB({"b": "There"}) → {"b": "There"}
		 */
		
		HashMap<String, String> map3 = new HashMap<String,String>();
		map3.put("a","Hi");
		map3.put("b", "There");
		MapAB mab = new MapAB();
		System.out.println("mapAB		" + mab.mapAB(map3));
		
		/*
		topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
		topping1({}) → {"bread": "butter"}
		topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
		 */
		
		HashMap<String, String> map4 = new HashMap<String, String>();
		//map4.put("ice cream", "peanuts");
		//map4.put("", "");
		map4.put("pancake", "syrup");
		Topping1 t1 = new Topping1();
		System.out.println("topping1	" + t1.topping1(map4));
		
		
		//topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
		//topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
		//topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
		
		HashMap<String,String> map5 = new HashMap<String, String>();
		//map5.put("ice cream", "cherry");
		//map5.put("spinach", "dirt");
		map5.put("yogurt", "salt");
		Topping2 t2 = new Topping2();
		System.out.println("topping2	" + t2.topping2(map5));
		
		//topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
		//topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
		//topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
		
		HashMap<String, String> map6 = new HashMap<String, String>();
		map6.put("potato", "ketchup");
		map6.put("potato", "butter");
		map6.put("salad", "oil");
		Topping3 t3 = new Topping3();
		System.out.println("topping3	" + t3.topping3(map6));
		
		//mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
		//mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
		//mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
		HashMap<String, String> map7 = new HashMap<String, String>();
		map7.put("a", "aaa");
		map7.put("b", "bbb");
		map7.put("c", "ccc");
		MapAB3 mab3 = new MapAB3();
		System.out.println("mapAB3		" + mab3.mapAB3(map7));
		
		
		//mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
		//mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
		//mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
		
		HashMap<String, String> map8 = new HashMap<String, String>();
		map8.put("a", "aaa");
		map8.put("b", "bbb");
		//map8.put("c", "ccc");
		MapAB2 mab2 = new MapAB2();
		System.out.println("mapAB2		" + mab2.mapAB2(map8));
		
		
		//mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
		//mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
		//mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
		
		HashMap<String, String> map9 = new HashMap<String, String>();
		map9.put("a", "aaa");
		map9.put("b", "bbb");
		map9.put("c", "ccc");
		MapAB4 mab4 = new MapAB4();
		System.out.println("mapAB4		" + mab4.mapAB4(map9));
		
		
		

		
		
		
		
		
	}
}
