import java.util.Scanner;

public class equation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Nhap a11, a12, b1: ");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();

        System.out.println("Nhap a21, a22, b2: ");
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

       
        double s = a11 * a22 - a12 * a21;
        double s1 = b1 * a22 - a12 * b2;
        double s2 = a11 * b2 - a21 * b1;

        
        if (s==0) { 
            if (s1==0 && s2==0) {
                System.out.println("He phuong trinh co vo so nghiem.");
            } else {
                System.out.println("He phuong trinh vo nghiem.");
            }
        } else {
            double x1 = s1 / s;
            double x2 = s2 / s;
            System.out.println("Nghiem cua he la:");
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }

        scanner.close();
    }
}
