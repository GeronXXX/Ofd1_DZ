import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Укажите радиус");
        int radius = console.nextInt();

        double S = S(radius);
        double D = D(radius);

        System.out.println("Плащадь окружности " + S);
        System.out.println("Длина оружнасти " + D);
    }
    private static double S(int radius) {
        return 3.14 * radius * radius;
    }
    private static double D(int radius) {
        return 2 * 3.14 * radius;
    }

}
