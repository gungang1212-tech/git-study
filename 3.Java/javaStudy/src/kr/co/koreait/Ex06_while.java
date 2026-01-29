package kr.co.koreait;

import java.util.Scanner;

public class Ex06_while {

	public static void main(String[] args) {
		// while문
		// - 조건식으로 구성됨
//		int cnt = 0;
//		// while문 사용시 조건식 false가 나오도록 설정하기 무한루프 방지
//		while (cnt <5) {
//
//			System.out.println("현재 cnt 값 : " + cnt );
//			cnt++;
//		}
//		
////		while문으로 합계 구하기
//		int sum = 0; 
//		int count = 1;
//		
//		while(count <= 10) {
//			sum += count;
//			count++;
//		}
//		System.out.println();
//		System.out.println(sum);
//		
		Scanner sc = new Scanner(System.in);
//		System.out.print("0을 입력 시 종료됨.");
//		int inputExit = sc.nextInt();
//		
//		while(inputExit != 0 ) {
//			System.out.print("0을 입력하세요 : ");
//			inputExit = sc.nextInt();
//		}
		  
		// do-while문
//		-조건식과 상관없이 최초 1번은 무조건 실행
//		- 참, 거짓을 판단하기 전에 무조건 1번 이상 실행해야 할 코드가 있을 경우 사용
		
		int num;
		
		do {
			System.out.print("0 입력 : ");
			num = sc.nextInt();
		} while(num != 0);
	}

}
