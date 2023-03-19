public class methodover {

    static int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    static double max(double a, double b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(6, 7));
        System.out.println(max(6.6, 7.8));
    }

}
