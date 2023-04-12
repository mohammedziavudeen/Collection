package collection;
import java.util.ArrayList;
import java.util.Collections;
public class HashMapeDemo {
	
	public static void main(String[] args) {
		Players player1=new Players("dhoni", 350, 55.5f);
		Players player2=new Players("dhawan",310, 50.5f);
		Players player3=new Players("kohli", 300, 40.5f);
		Players player4=new Players("pandya", 330, 48.5f);
		//System.out.println(player1);
		//Players player5=new Players("jaddu", 200, 48.5f);
		ArrayList al= new ArrayList();
		al.add(player1);
		al.add(player2);
		al.add(player3);
		al.add(player4);
		//al.add(player5);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}