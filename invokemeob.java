class box {
    int height;
    int width;
    int length;

    int volume() {
        return length * width * height;
    }
}

public class invokemeob {
    public static void main(String[] args) {
        box wodenbox = new box();
        wodenbox.height = 10;
        wodenbox.width = 3;
        wodenbox.length = 4;

        wodenbox.volume();
        System.out.println(wodenbox.volume());
    }
}
