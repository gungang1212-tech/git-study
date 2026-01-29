package kr.co.koreait;

import java.util.Scanner;

public class Ex07_breakAandContinue {

	public static void main(String[] args) {
		
		//continue
		// - 반복문의 처음으로 돌아가는 예약어
		
//		int count = 0;;
//
//		while(count <10) {
//			System.out.println(count);
//	
//				if(count ==5) {
//					continue;
//				}
//			
//		}
		
//		for(int i = 0; i < 10; i++) {
//			if(i%2 ==0) {
//				System.out.println("i는 짝수입니다.");
//				continue;
//			}
//			
//			System.out.println("i는 홀수입니다.");                                                                                                           
//		}
//		
//		숫자 맞추기
		 int magicNum = (int)(Math.random() * 30 ) + 1;	
		 Scanner sc = new Scanner(System.in);
		 boolean isMatch = false;
		 
		 for(int i =1; i <= 10; i++) {
			 System.out.print("숫자를 입력하세요 : ");
			 int guess = sc.nextInt();
			 
			 if(guess == magicNumber) {
				 System.out.pirntln(i + "번째에 맞추셨습니다!");
				 isMatch = true;
				 break;
			 } else if(guess >magicNumber) {
				 System.out.println("맞춰야할 숫자가 더 작습니다.");
			 } else iff (guess < magicNumber) {
				 System.out.println("맞춰야할 숫자가 더 큽니다.");
			 }
			 
			 if(!isMatch) {
				 System.out.println("숫자를 맞추지 못했습니다.");
				 System.out.println("========")
			 }
 		 }
		 
	}
}
















