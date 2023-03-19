
public class met {
    static int boxVolume(int length, int breadth, int heigth) {
        int vol;
        vol = length * breadth * heigth;
        return vol;
    }

    static void printline() {
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        printline();
        System.out.println("method");

        int v = boxVolume(10, 2, 1);
        System.out.println(v);
        printline();

    }

}
