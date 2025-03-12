import java.util.Scanner;
public class Matrices {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	System.out.print("Nhap so hang: ");
	int r = scanner.nextInt();
	System.out.print("Nhap so cot: ");
	int c = scanner.nextInt();
	int mt1[][] = new int[r][c];
	int mt2[][] = new int[r][c];
	System.out.println("Nhap ma tran 1: ");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			mt1[i][j] = scanner.nextInt();
		}
	}
	
	System.out.println("Nhap ma tran 2: ");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			mt2[i][j] = scanner.nextInt();
			mt1[i][j]+= mt2[i][j];
		}
	}
	
	System.out.println("Tong 2 ma tran: ");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			System.out.print(mt1[i][j] + " ");
		}
		System.out.println();
	}
	scanner.close();
}
}
