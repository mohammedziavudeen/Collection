package collection;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraylistProg {
	
	public static void main(String[] args) {

		method();
		
	}

	private static void method() {
		ArrayList marks=new ArrayList();
		Scanner sc=new Scanner(System.in);
		//Scanner sc=new Scanner(System.in);
		char end=' ';
		
		while(end!='n') {
			try {
				System.out.println("Enter mark");
				int score=sc.nextInt();
				marks.add(score);
				System.out.println("Enter  to stop");
				end=sc.next().charAt(0);
			}
			catch (InputMismatchException a) {
				System.out.println("Kindly enter number");
				method();
			}
		
		}
		
		System.out.println(marks);
		ArrayList al2=new ArrayList();
		al2.add("ziavu");
		System.out.println(al2.addAll(marks)+" "+al2);
		
	}

}



//Scanner sc=new Scanner(System.in);
//System.out.println("Tell me no.of subjects");
//int count=sc.nextInt();
//int[] marks=new int[count];
//int total=0;
//for(int i=0;i<marks.length;i++) {
//	System.out.println("Enter the mark");
//	marks[i]=sc.nextInt();
//	total=total+marks[i];
//}
//System.out.println(total);
