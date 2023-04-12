package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class First {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
	    al.add(10);
	    al.add(999999999999999999L);
	    al.add("sasi");
	    al.add(true);
	    //System.out.println();
	    al.add(2, "Saravanan");
	    //System.out.println(al);
	    al.remove("sasi");
	    System.out.println(al);
	    ArrayList al2 = new ArrayList(); 
	    al2.add("Sakthivel");
	    al2.add("Dhinakaran");
	    System.out.println(al2);
	    al.addAll(al2);
	    System.out.println(al);
//	    System.out.println(al2.get(2)); 
//	    System.out.println(al.contains("Sakthivel"));
//	    

	}

}
