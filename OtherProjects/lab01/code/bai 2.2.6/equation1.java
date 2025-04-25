import java.util.Scanner;
public class equation1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        Double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        Double b= scanner.nextDouble();
        if(a==0 && b==0) System.out.println("Vo so nghiem"); 
        else if(a==0 && b!=0) System.out.println("Vo nghiem");
        else System.out.println("Nghiem cua phuong trinh la: " + -b/a);
        scanner.close();
    }
     
}