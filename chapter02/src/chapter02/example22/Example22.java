package chapter02.example22;

public class Example22 {
    public static void main(String[] args) {

        int sum1 = add01(1, 2);
        int sum2 = add02(1, 2, 3);
        double sum3 = add03(1.2, 2.3);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
    }


    public static int add01(int x, int y) {
        return x + y;
    }

    public static int add02(int x, int y, int z) {
        return x + y + z;
    }

    public static double add03(double x, double y) {
        return x + y;
    }
}
