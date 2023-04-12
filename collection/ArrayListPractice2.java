package collection;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    char end = ' ';
	    ArrayList marks = new ArrayList(); 
	    while(end!='n')
	    {
	      System.out.println("Enter Mark: ");
	      int score = sc.nextInt(); 
	      marks.add(score);
	      System.out.println("Enter 'stop' to stop");
	      end = sc.next().charAt(0);
	    }
	    System.out.println(marks);

	}

}
