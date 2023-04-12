package collection;
import java.util.LinkedHashSet;
public class LinkedHashSetPractice {

	public static void main(String[] args) {
		int[] ar = {10,20,60,30,100,40,10,20,30,50,60}; 
	    LinkedHashSet hs = new LinkedHashSet(); 
	    for(int i=0;i<ar.length;i++)
	    {
	      boolean result = hs.add(ar[i]); 
	      if(result == false)
	      {
	        System.out.println(ar[i]);
	      }
	    }
	    System.out.println(hs);

	}

}
