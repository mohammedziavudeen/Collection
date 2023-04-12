package collection;
import java.util.HashSet;
public class SetDemo {

	public static void main(String[] args) {
		HashSet al = new HashSet(); 
	    al.add(10);
	    al.add(40);
	    al.add(4);
	    al.add(true);
	    al.add("Kavin");
	    al.add(5.4f);
	    al.add(40);
	//    System.out.println(al);
	  //  al.add(2,"Maneesh");
	    
	    HashSet al2 = new HashSet(); 
	    al2.add("Kannan");
	    al2.add("abcd"); 
	    al2.add(5.4f);
	    al2.add(4);
	   // al2.addAll(al);
	    
	    al2.remove(0);
	   // System.out.println(al2.contains("abcd")); 
	    System.out.println(al.containsAll(al2)); 
	  //  System.out.println(al2.subList(3, 6)); 
	    Object[] ob = al2.toArray();
	    System.out.println(al2.retainAll(al)); 
	    System.out.println(al2.size()); 
	    //System.out.println(al2.get(3));
	    
	   // al2.set(3, "dhinakaran");
	    al.clear();
	    System.out.println(al2.isEmpty()); 
	    System.out.println(al.isEmpty());

	}

}
