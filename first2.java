import java.util.Scanner;
public class first2{
 public static void main(String args[]){
  System.out.print("hello java");
  System.out.print("enter your name");
  Scanner scanner = new Scanner (System.in);
   String name=scanner.nextLine();
   System.out.print("enter your age");
   int age=scanner.nextInt();
   System.out.println("your name is "+name+"your age is " +age);
   int num;
   
   System.out.println("enter your number");

num=scanner.nextInt();
    if(num>0){
      System.out.print("your number is positive"+num);
}
else{
System.out.print("your number is negative");
}
}
}