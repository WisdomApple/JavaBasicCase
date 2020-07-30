package chapter02.example16;

public class Example16 {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 4) {
            System.out.println("x = " + x);
            if (x == 3) {
                break;
            }
            x++;
        }
    }
}