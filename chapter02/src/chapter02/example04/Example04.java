package chapter02.example04;

public class Example04 {
    public static void main(String[] args) {
        int x = 12;
        {
            int y = 96;
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }

        System.out.println("x is " + x);
    }
}
