class Box {
    int length;
    int breath;
    int height;
}

public class cls {
    public static void main(String[] args) {
        System.out.println("main class");
        Box blackbox = new Box();
        blackbox.length = 90;
        blackbox.height = 50;
        blackbox.breath = 30;
        System.out.println(blackbox.breath);
        Box blackbox1 = new Box();
        blackbox.length = 90;
        blackbox.height = 50;
        blackbox1.breath = 45;
        System.out.println(blackbox1.breath);
    }
}
