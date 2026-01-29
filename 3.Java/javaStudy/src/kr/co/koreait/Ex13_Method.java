package kr.co.koreait;

public class Ex13_Method {

	public static void main(String[] args) {
		// 메서드
		//	- 정의된 동작이나 기능을 수행
		
		//	객체 생성
		//	- 코드를 메모리에 올리는 과정
		//	- 클래스명 변수명 = new 클래스명();
//		Ex13_Method m = new Ex13_Method();
//		m.printHello("바보");

//		int result = calc.add(10,10);
//		System.out.println(result); 
//		
		// calc 차, 곱, 나누기
		
		Ex13_1_Calc calc = new Ex13_1_Calc();
		
		System.out.println(calc.sub(10, 2, 4));
		System.out.println(calc.mul(10, 10, 2, 2));
		System.out.println(calc.div(10, 2));
	}
	// public 반환타입 메서드명(자료형 매개변수명){}
	// - void return 없음.
		public String printHello(String str) {
		System.out.println(str);
		return "잘 출력되었습니다.";
	}

}
