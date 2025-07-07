import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double r, pi = 3.14, alfa, area, perimeter;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            r = -1;
            alfa = -1;

            while (r < 0) { 
                System.out.print("| Enter circle radius : ");
                r = sc.nextDouble();
            }

            area = pi * r * r;
            perimeter = 2 * pi * r;
            System.out.println("| Area : " + area);
            System.out.println("| Perimeter : " + perimeter);

            while (alfa < 0 || alfa > 360) {
                System.out.print("| Center angle : ");
                alfa = sc.nextDouble();
            }

            System.out.println("| Area of Circle : " + (pi * r * r * alfa) / 360 + "\n------");
            System.out.print("| Exit (Y/N) : ");
            exit = Objects.equals(sc.next(), "Y");
        }
        sc.close();
    }
}
