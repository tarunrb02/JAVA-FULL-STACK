package learningMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Driver1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
//		System.out.println(hm.getClass().getName());
		hm.put(123, "India");
		hm.put(152, "USA");
		hm.put(143, "UK");
		hm.put(163, "Nepal");
		hm.put(165, "Pakistan");
		hm.put(198, "Indo");
		hm.put(112, "China");
		hm.put(163, "Sri Lanka");

		// How to iterate -> need to use entrySet()
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry);
		}

		System.out.println("---------------------------------");
		// How to fetch all keys from map -> need to use keySet()
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> i = keys.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("---------------------------------");
		// How to fetch all values from map -> need to use values()
		Collection<String> values = hm.values();
		Iterator<String> i2 = values.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("---------------------------------");
		// how to fetch value mapped to key with the help of key -> get()
		Set<Integer> keyset = hm.keySet();
		for (Integer k : keyset) {
			System.out.println(hm.get(k));
		}
		System.out.println("---------------------------------");
		System.out.println(hm.get(123));
		System.out.println(hm.get(163));
		System.out.println(hm.get(299));
		/*
		 * if element is not present it will return null to overcome NPE we are going to
		 * use getOrDefault(key , write value which you need if element is not present);
		 */
		System.out.println("---------------------------------");
		System.out.println(hm.getOrDefault(123, "Element not Preset"));
		System.out.println(hm.getOrDefault(299, "Element not Preset"));

	}

}
