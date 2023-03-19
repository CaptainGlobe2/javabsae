class stack {
    int s[] = new int[10];
    int tos;

    stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("the staxc is full");
        } else {
            s[++tos] = item;
        }
    }

    int pop() {
        if (tos >= 0) {
            return s[tos--];
        } else {
            System.out.println("stack is empty");
            return -1;
        }

    }

}

public class stac {
    public static void main(String[] args) {
        stack s1 = new stack();

        s1.push(4);
        s1.push(5);
        s1.push(6);

        System.out.println(s1.pop());

    }

}
