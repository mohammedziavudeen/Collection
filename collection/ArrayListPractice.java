package collection;
import java.util.ArrayList;
import java.util.List;
public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		ArrayList obj1=new ArrayList();
		
		obj.add("ziavu");
		obj.add(1324);
		obj.add(true);
		obj.add(true);
		obj.add(2,32);
		obj.add(2.6564757776);
		System.out.println(obj.get(5));;
		//System.out.println(obj.get(2));
		List obj2=obj.subList(0, 2);
		obj.remove(true);
		//System.out.println(obj2);
		//System.out.println(obj.indexOf(true));;
		//System.out.println(obj.remove(2));
		Object[] a=obj.toArray();
		
		
		System.out.println(obj.toArray());;
		System.out.println(obj);
		obj.clear();
		System.out.println(obj);
		obj1.add("allah");
		//int n=Integer.BYTES;
		double n=Double.NaN;
		try {
			obj.remove(3);
			System.out.println(obj);
		}
		catch(IndexOutOfBoundsException x) {
			System.out.println("indexx"+n);
		}
		
		}
		


}
