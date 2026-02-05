package kr.co.quiz2;

import java.util.Scanner;

public class Ex24_3_Main {
	public static void main(String[] args) {
		
		Ex24_3_Carlmpl user = new Ex24_3_Carlmpl();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("자동차 관리 프로그램");
			System.out.println(" 1. 자동차 시작");
			System.out.println(" 2. 자동차 정지");
			System.out.println(" 3. 자동차 가속");
			System.out.println(" 4. 자동차 감속");
			System.out.println(" 5. 자동차 정보 출력");
			System.out.println(" 6. 종료");
			System.out.println(" 메뉴를 선택하세요 :");
			
			int select = sc.nextInt();			// 사용자로부터 입력받은 값 저장 1~6 이외에는 다시 입력
			sc.nextLine();
			
			switch(select) {
			
			case 1: 
				
				user.start();
				break;
				
			case 2:
				user.stop();
				break;
				
			case 3: 
				user.accelerate(20);
				break;
				
			case 4 :
				user.brake();
				break;
				
			case 5 : 
				
				user.getInfo();
				break;
			
			case 6 :
				sc.close();
				System.exit(0);
				
			default :
				System.out.println("값을 다시 입력해주세요.");
			}
			
		}
	}
}
