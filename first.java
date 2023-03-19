import java.util.Scanner;
public class first{
 public static void main(String args[]){
  System.out.print("hello java");
  System.out.print("enter your name");
  Scanner scanner = new scanner (System.in);
   String name=scanner.nextLine();
   System.out.print("enter your age");
   int age=scanner.nextInt();
   System.out.println("your name is "+name+"your age is " +age);
}
}