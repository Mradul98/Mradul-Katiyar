package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = Map.of("F", 5, "C", 3, "A", 1, "Z", 3);

		System.out.println(map);

		HashMap<String, Integer> hashmap = new HashMap<>(map);

		LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<>(map);

		TreeMap<String, Integer> treemap = new TreeMap<>(map);

		System.out.println(hashmap);
		System.out.println(linkedhashmap);
		System.out.println(treemap);

	}

}
