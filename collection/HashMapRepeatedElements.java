package collection;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.*;
import java.util.Set;

public class HashMapRepeatedElements {

	public static <Entry> void main(String[] args) {
		HashMap hm =new HashMap();
		String name="mohammoood";
		for(int i=0;i<name.length();i++) {
			if(hm.containsKey(name.charAt(i))) {
				Object ob=hm.get(name.charAt(i));
				System.out.println(ob);
				int count=(Integer)ob;
				hm.put(name.charAt(i), count+1);
				
			}
			else {
				//System.out.println(hm.get(name.charAt(i)));
				hm.put(name.charAt(i), 1);
			}
		}
		Set s= hm.entrySet();
		for(Object obj:s) {
			Entry entry= (Entry) obj;
			System.out.println(entry);
			
		}
		System.out.println();
	}

}
