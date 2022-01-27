import java.util.Scanner;

public class Practice05_Renewal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] myPoint = new int[2];
		
		int[] pointX = new int[10];
		int[] pointY = new int[10];
		int[][] point = new int[10][2];

		for (int i = 0; i < myPoint.length; i++) {
			myPoint[i] = scan.nextInt();
		}
		
		for(int i = 0; i < point.length; i++) {
			int[] ranPoint = point[i];
			
			for(int j = 0; j < ranPoint.length; j++) {
				ranPoint[j] = scan.nextInt();
			}
			
			point[i] = ranPoint;
			
		}
		
		for(int i = 0; i < point.length; i++) {
			for(int j = 0; j < point[i].length; j++) {
				System.out.print(point[i][j] + "\t");
			}
			System.out.println();
		}
		
	}//END MAIN

} // END CLASS