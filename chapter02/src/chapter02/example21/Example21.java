package chapter02.example21;

public class Example21 {
    public static void main(String[] args) {
        int area = getArea(3, 5);
        System.out.println(" The area is " + area);
    }


    public static int getArea(int x, int y) {
        int temp = x * y;
        return temp;
    }
}