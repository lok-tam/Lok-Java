package collection_Map;

import java.util.HashMap;
import java.util.Map;

public class Collection_Map {

	public static void main(String[] args) {

		Map<Integer, String> veg = new HashMap<>();

		veg.put(1, "Potato");
		veg.put(2, "Onion");
		veg.put(3, "Cabbage");

		System.out.println(veg.size());

		Map<Integer, String> fru = new HashMap<>();
		fru.put(3, "apple");
		fru.put(5, "orange");

		fru.putAll(veg);
		System.out.println();
		System.out.println(fru.size());
		System.out.println(fru.isEmpty());
	}

}
