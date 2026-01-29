package kr.co.koreait;

import java.util.Scanner;

public class Ex05_for {

	public static void main(String[] args) {
		// for문
		//	- 초기식, 조건식, 증강식으로 구성
		//	- 반복할 횟수를 미리 알고 있을 경우에 사용 
		for(int i=0; i <= 100; i++) {
			System.out.println("i의 값 : " + i);
		}
		
		String subject = "Python";
		
		// 문자열.length()를 사용하면 해당 문자열의 길이를 반환
		for(int i= 0; i<subject.length(); i++) {
			System.out.println("subject for문 i의 값 : " +i);
		}
		for(int i = 10; i>0; i--) {
			System.out.println("i를 1씩 빼는 for문의 i값 : " + i);
		}
		
		//사용자가 입력한 횟수만큼 반복하는 for문
		Scanner sc = new Scanner(System.in);
		System.out.print("반복할 횟수 :");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++ ) {
			System.out.println("사용자가 지정한 반복 횟수 : " + i);
			
		}
		
	}

}
