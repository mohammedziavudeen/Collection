 package collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapPrac2 {

	public static void main(String[] args) {
		HashMap hm = new HashMap(); 
		  hm.put("Idly", 20);
		  hm.put("Dosai", 30); 
		  hm.put("Poori", 40);
		  hm.put("Pongal", 40);
//		  System.out.println(hm);
//		  System.out.println(hm.get("Dosai")); 
		 // System.out.println(hm.containsValue(40));
//		  System.out.println(hm.keySet());
//		  System.out.println(hm.values());
//		  System.out.println(hm.get(40));
		  Set s = hm.entrySet(); 
		  System.out.println(s);
		  for(Object ob: s)
		  { 
			System.out.println(ob+" n");
		    Entry entry = (Entry)ob;
		    System.out.println(entry);
		 //   System.out.println(entry.getKey());
		    String menu_item = (String) entry.getKey();
		    if(menu_item.equals("Pongal"))
		    {
		      System.out.println("Pongal price is " + entry.getValue());
		    }
		    Integer price = (Integer) entry.getValue();
		    if(price==40)
		    {
		      System.out.println("For 40 rs " + entry.getKey());
		    }
		    System.out.println(ob);

	}

}
}