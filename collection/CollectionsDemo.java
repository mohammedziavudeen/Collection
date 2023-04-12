package collection;

import java.util.ArrayList;

public class CollectionsDemo {
 
  
  


  public static void main(String[] args) {
    // TODO Auto-generated method stub
    CollectionsDemo cd = new CollectionsDemo();
    cd.interview1();
    String s = "kavitha";
//    for(int i=0;i<s.length();i++)
//    {
//      System.out.println(s.charAt(i));
//    }
    char[] ch = s.toCharArray();
//    for(int i=0;i<ch.length;i++)
//    {
//      System.out.println(ch[i]);
//    }
    //enhanced for loop / for each loop
    // unidirectional loop
    for(char c1:ch)
    {
      System.out.print(c1);
    }
    
    

  }

  private void interview1() {
    // TODO Auto-generated method stub
    ArrayList al = new ArrayList(); 
    al.add(10);
    al.add(true);
    al.add("Dhivya");
    al.add('k');
    al.add(20);
    al.add(35);
    al.add(43);

    for(Object ob:al) {
    	System.out.print(ob);
    }
    Object[] ob = al.toArray();
   
    for(int i=0;i<ob.length;i++)
    {
      try {
      int i2 = (Integer) ob[i];
      System.out.println(i2);
      if(i2%5==0)
      System.out.println(i2);
      }
      catch(ClassCastException cce)
      {
        System.out.println("this value"+ob[i]+" cannot converted");
      }
    }
}
  }