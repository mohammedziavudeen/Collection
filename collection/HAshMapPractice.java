package collection;
import java.util.HashMap;
import java.util.Collection;
//import java.util.Collections;
import java.util.Set;
public class HAshMapPractice {

	public static void main(String[] args) {
		HashMap hm = new HashMap(); 
		  hm.put("Idly", 20);
		  hm.put("Dosai", 30); 
		  hm.put("Poori", 40);
		  hm.put("Pongal", 25);

		  System.out.println(hm.entrySet());
		  Set s = hm.keySet(); // Set of Keys --> Set
		  System.out.println(s);
		Collection c = hm.values(); // Collection of Values --> Collection
		System.out.println(c);
		System.out.println(hm.entrySet()); // Collection of Entries --> Set

	}

}
