package collection;
import java.util.LinkedList;
public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList al = new LinkedList(); 
	    al.add(10);
	    al.add(20);
	    al.add(4);
	    al.add(4);
	    al.add(true);
	    al.add("Kavin");
	    al.add(5.4f);
	    al.add(2,"Maneesh");
	    System.out.println(al.remove());
	    System.out.println(al);
	    LinkedList al2 = new LinkedList(); 
	    al2.add("Kannan");
	    al2.add("abcd"); 
	    al2.add("Maneesh");
	    //al2.addAll(al);
	    System.out.println(al2);
	   // al2.remove(0);
	   // System.out.println(al2);
	  //  System.out.println(al2.contains("abcd")); 
	    //System.out.println(al2.containsAll(al)); 
	    //System.out.println(al2.subList(3, 6)); 
	    //Object[] ob = al2.toArray();
	    System.out.println(al2.retainAll(al)); 
	    System.out.println(al2+ " " +al);
	    System.out.println(al2.size()); 
//	    System.out.println(al2.get(3));
//	    
//	    al2.set(3, "dhinakaran");
//	    al.clear();
//	    System.out.println(al2.isEmpty()); 
//	    System.out.println(al.isEmpty());

	}

}
