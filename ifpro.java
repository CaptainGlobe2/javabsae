import java.util.Scanner;

public class ifpro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("enter the mark ");
        num = s.nextInt();
        if (num >= 90) {
            System.out.println("A");
        } else if (num >= 80) {
            System.out.println("B");
        } else if (num >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

    }

}
