package kr.co.koreait;

public class Ex13_1_Calc {
	// 덧셈 메서드
	public int add(int num1, int num2) {
		return num1 + num2;
		
	}
	
	// 빼기 메서드(sub)
	//	- 매개변수 3개를 받습니다.
	//	- 3개를 뺀 값을 반환합니다.
	public int sub(int a, int b, int c) {
		return a-b-c;
	}
	
	// 곱셈 메서드(mul)
	// - 매개변수 4개를 받습니다.
	// - 4개를 곱한 값을 반환합니다.
	public int mul(int a, int b, int c ,int d) {
		return a*b*c*d;
	}
	// 나눗셈 메서드 (div)
	//	- 매개변수 2개를 받습니다.
	//	-2개를 나눈 몫을 출력하세요
	//	- 2개를 나눈 나머지를 반환하세요
	public int div(int a, int b) {
		System.out.println( a / b );
		return a%b;
	}
}
