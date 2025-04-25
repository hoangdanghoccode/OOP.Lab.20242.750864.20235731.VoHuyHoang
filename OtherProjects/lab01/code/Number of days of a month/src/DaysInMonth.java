import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> monthMap = new HashMap<>();
        
        // Bảng ánh xạ các dạng nhập vào số tương ứng
        String[][] months = {
            {"January", "Jan.", "Jan", "1"},
            {"February", "Feb.", "Feb", "2"},
            {"March", "Mar.", "Mar", "3"},
            {"April", "Apr.", "Apr", "4"},
            {"May", "May", "May", "5"},
            {"June", "Jun.", "Jun", "6"},
            {"July", "Jul.", "Jul", "7"},
            {"August", "Aug.", "Aug", "8"},
            {"September", "Sept.", "Sep", "9"},
            {"October", "Oct.", "Oct", "10"},
            {"November", "Nov.", "Nov", "11"},
            {"December", "Dec.", "Dec", "12"}
        };

        for (int i = 0; i < months.length; i++) {
            for (String variant : months[i]) {
                monthMap.put(variant.toLowerCase(), i + 1);
            }
        }

        int month = 0, year = 0;

        // Nhập tháng, kiểm tra hợp lệ
        while (month == 0) {
            System.out.print("Nhập tháng (tên đầy đủ, viết tắt hoặc số): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (monthMap.containsKey(input)) {
                month = monthMap.get(input);
            } else {
                System.out.println("Tháng không hợp lệ, vui lòng nhập lại.");
            }
        }

        // Nhập năm, kiểm tra hợp lệ
        while (year <= 0) {
            System.out.print("Nhập năm (số nguyên dương, đủ 4 chữ số): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year < 1000) {
                    System.out.println("Năm không hợp lệ, vui lòng nhập năm đầy đủ (ví dụ: 1999, 2024).");
                    year = 0;
                }
            } else {
                System.out.println("Dữ liệu không hợp lệ, vui lòng nhập số nguyên dương.");
                scanner.next(); // Xóa dữ liệu sai khỏi bộ nhớ đệm
            }
        }

        // Xác định năm nhuận
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Xác định số ngày trong tháng
        int days;
        switch (month) {
            case 2:
                days = isLeapYear ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = 31;
        }

        System.out.printf("Tháng %d năm %d có %d ngày.\n", month, year, days);
        scanner.close();
    }
}
