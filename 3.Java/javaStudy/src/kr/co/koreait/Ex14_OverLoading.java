package kr.co.koreait;

public class Ex14_OverLoading {
	public static void main(String[] args) {
		
		//오버로딩 (OverLoading)
		//	- 같은 메서드 이름을 사용하지만 매개변수의 타입(자료형)과 위치가 다른 방식
		Ex14_OverLoading A = new Ex14_OverLoading();
		A.introduce(21);
		A.introduce("A ");
		System.out.println();
		System.out.println("[ Ex14_Calc 실행 결과 ] \n");
		Ex14_1_Calc B = new Ex14_1_Calc();
		System.out.println("-" + B.add(10, 20));
		System.out.println("-" + B.add(10,20,30));
	}
	
	String name;
	int age;
	
	public void introduce(String name) {
		this.name = name;
		System.out.println("안녕하세요. 제 이름은 " + name + "입니다.");
	}
	
	public void introduce(int age) {
		System.out.println("이름 : " +  this.name + ", 나이 : " + age);
	}
	
}
