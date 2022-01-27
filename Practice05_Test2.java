import java.util.Scanner;

public class Practice05_Test2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] a = new int[2];
		int[][] b = new int[10][2];
		int c = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		System.out.println("----------------------------------------------");

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = scan.nextInt();
				for (int k = 0; k < i; k++) {
					if (b[i][j] == b[k][j]) {
						System.out.println("동일한 좌표가 존재합니다!!! 다시 입력해 주세요.");

						i--;
						break;
					}
				}
			}
			System.out.println();
		}
		/*
		 * for(int i = 0; i < b.length; i++) { for(int j = 0; j < b[i].length; j++) {
		 * System.out.print(b[i][j] + "\t"); } System.out.println(); }
		 */
	}
}
