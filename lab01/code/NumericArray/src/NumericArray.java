import java.util.Arrays;
import java.util.Scanner;

public class NumericArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Nhập mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        // Tính trung bình cộng
        double average = (double) sum / n;

        // Sắp xếp mảng bằng Arrays.sort() (tối ưu hơn vòng lặp)
        Arrays.sort(arr);

        // Xuất kết quả
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        System.out.println("Tổng = " + sum);
        System.out.printf("Trung bình = %.2f\n", average); // In 2 chữ số thập phân

        scanner.close();
    }
}
