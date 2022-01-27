import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); 
		
		int menu = 0;
		
		do {
			System.out.println("[메뉴 선택]");
			System.out.println("1. 회원 관리");
			System.out.println("2. 과목 관리");
			System.out.println("3. 수강 관리");
			System.out.println("4. 결제 관리");
			
			menu = scan.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("회원 관리 메뉴를 선택했습니다.");
					break;
					
				case 2:
					System.out.println("과목 관리 메뉴를 선택했습니다.");
					break;
					
				case 3:
					System.out.println("수강 관리 메뉴를 선택했습니다.");
					break;
					
				case 4:
					System.out.println("결제 관리 메뉴를 선택했습니다.");
					break;
					
				case 5:
					System.out.println("프로그램을 종료합니다.");
					break;
			}

		}
		while(menu != 5);
		
		/*
		System.out.println("[메뉴 선택]");
		System.out.println("1. 회원 관리");
		System.out.println("2. 과목 관리");
		System.out.println("3. 수강 관리");
		System.out.println("4. 결제 관리");
		
		Scanner scan = new Scanner(System.in); 
		
		while(true) {
			
			int menu = scan.nextInt();
			
			
			if(menu == 1) {
				System.out.println("회원 관리 메뉴를 선택했습니다.");
				continue;
			}
			else if(menu == 2) {
				System.out.println("과목 관리 메뉴를 선택했습니다.");
				continue;
			}
			else if(menu == 3) {
				System.out.println("수강 관리 메뉴를 선택했습니다.");
				continue;
			}
			else if(menu == 4) {
				System.out.println("결제 관리 메뉴를 선택했습니다.");
				
				System.out.println("[메뉴 선택]");
				System.out.println("1. 회원 관리");
				System.out.println("2. 과목 관리");
				System.out.println("3. 수강 관리");
				System.out.println("4. 결제 관리");
				
				continue;
			}
			else if(menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		*/
	
	}

}
