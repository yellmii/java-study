import java.util.Scanner;

public class Practice05_Test1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] myPoint = new int[2];
		int[] pointX = new int[10];
		int[] pointY = new int[10];

		for (int i = 0; i < myPoint.length; i++) {
			myPoint[i] = scan.nextInt();
		}

		// 임의의 좌표 입력 받기
		for (int i = 0; i < pointX.length; i++) {
			System.out.println((i + 1) + "/" + pointX.length + "번째 입력");

			System.out.println("임의의 좌표 x값을 입력하세요.");
			pointX[i] = scan.nextInt();

			System.out.println("임의의 좌표 y값을 입력하세요.");
			pointY[i] = scan.nextInt();

			for (int j = 0; j < i; j++) {
				if (pointX[i] == pointX[j] && pointY[i] == pointY[j]) {
					System.out.println("동일한 좌표가 존재합니다!!!");

					i--;
					break;
				}
			}
		} // END FOR
		
		// 좌표 출력
		System.out.println("---------------------------------------------");
		System.out.println("입력받은 10개의 좌표들 출력 : ");
		for (int i = 0; i <= pointX.length - 1; i++) {
			System.out.println("(" + pointX[i] + ", " + pointY[i] + ")");
		}

		int[][] minXY = { pointX, pointY };
		int[] minPoint = getMinPoint(myPoint, minXY);
		
		System.out.println("---------------------------------------------");
		System.out.println("제일 가까운 좌표 : ");
		System.out.println("(" + minPoint[0] + "," + minPoint[1] + ")");

	} // END MAIN

	//거리 구하기
	public static int getDistance(int x1, int y1, int x2, int y2) {
		
		int x = 0;
		int y = 0;
		
		if(x2 >= x1) {
			x = Math.abs(x2) - Math.abs(x1);
		}
		else {
			x = Math.abs(x1) - Math.abs(x2);
		}
		
		if(y2 >= y1) {
			y = Math.abs(y2) - Math.abs(y1);
		}
		else {
			y = Math.abs(y1) - Math.abs(y2);
		}
		
		return x + y;
	}

	//가장 가까운 좌표 구하기
	public static int[] getMinPoint(int[] myPoint, int[][] minXY) {

		int[] closestPoint = minXY[0];
		int closestDist = getDistance(myPoint[0], myPoint[1], closestPoint[0], closestPoint[1]);

		for (int i = 0; i < minXY.length; i++) {
			int dist = getDistance(myPoint[0], myPoint[1], minXY[i][0], minXY[i][1]);
			if (dist < closestDist && dist != 0) {
				closestDist = dist;
				closestPoint = minXY[i];
			}
		}

		return closestPoint;
	}

} // END CLASS

