class cons {
    int height;
    int width;
    int length;

    cons(int i, int j, int k) {
        height = i;
        width = j;
        length = k;
    }

    int volume() {
        return height * width * length;
    }
}

public class constructor {
    public static void main(String[] args) {

        cons box1 = new cons(2, 3, 4);
        System.out.println(box1.volume());

    }

}
