class cons {
    int height;
    int width;
    int length;

    cons(int i, int j, int k) {
        height = i;
        width = j;
        length = k;
    }

    cons() {
        length = -1;
        width = -1;
        height = -1;
    }

    int volume() {
        return height * width * length;
    }
}

public class constover {
    public static void main(String[] args) {

        cons box1 = new cons(2, 3, 4);
        cons box2 = new cons();
        System.out.println(box1.volume());
        System.out.println(box2.volume());

    }
}
