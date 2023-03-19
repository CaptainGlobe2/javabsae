import java.util.Scanner;

public class sw1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1, n2;
        System.out.println("enter the first number");
        n1 = s.nextInt();
        System.out.println("enter the second number");
        n2 = s.nextInt();
        System.out.println("enter the operator +,-,*,/,%");
        char op = s.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
                break;
            case '-':

                System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
                break;
            case '*':
                System.out.println(n1 + "+" + n2 + "=" + (n1 * n2));

        }
    }
}
