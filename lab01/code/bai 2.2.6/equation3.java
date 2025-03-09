import java.util.Scanner;
public class equation3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if(a==0){
            if(b==0 && c==0) System.out.println("Vo so nghiem"); 
        else if(b==0 && c!=0) System.out.println("Vo nghiem");
        else System.out.println("Nghiem cua phuong trinh la: " + -c/b);
        }
        else{
            double delta=b*b-4*a*c;
            if(delta<0) System.out.println("Vo Nghiem");
            else if(delta==0) System.out.println("Phuong trinh co nghiem duy nhat: x = " + -b/(2*a));
            else System.out.println("Phuong trinh co 2 nghiem: x1 = "+(-b-Math.sqrt(delta))/(2*a) + ", x2 = "+ (-b+Math.sqrt(delta))/(2*a));
        }
        scanner.close();
    }
}
