package kr.co.quiz2;

import java.util.Scanner;

public class Ex24_2_Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 아이디 입력
		System.out.println("아이디 입력:");
		String id = sc.nextLine();
		
		//비번 입력
		System.out.println("비번 입력: ");
		String pwd = sc.nextLine();
		
		
		// 메서드 호출하기
		Ex24_2_Login ex = new Ex24_2_Login();
		String result = ex.login(id, pwd);
		System.out.println(result);
	}
}
