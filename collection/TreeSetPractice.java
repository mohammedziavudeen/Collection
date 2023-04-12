package collection;
import java.util.TreeSet;
import java.util.ArrayList;
public class TreeSetPractice {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
		ArrayList<Integer> aa=new ArrayList<Integer>();
		aa.add(78);		
	    al.add(100);
	    al.add(20);
	    al.add(100);
	    al.add(20);
	    al.add(30);
	    al.add("Maneesh");
	    al.add(true);
	    System.out.println(al);
	    //TreeSet ts = new TreeSet(al); 
	    TreeSet ts = new TreeSet(); 
	    for(Object ob:al)
	    {
	      try {
	      ts.add(ob);
	      }
	      catch(ClassCastException cce)
	      {
	        
	      }
	    }
	    System.out.println(ts);

	}

}
