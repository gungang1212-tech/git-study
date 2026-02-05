package kr.co.koreait;

public class Ex25_Class2 {
	public static void main(String[] args) {
		// 정적 중첩클래스 생성방법
//		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		비정적 중첩 클래스 생성 방법
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.print();
		Ex25_1_Calculator cal = new Ex25_1_Calculator(1,2);
		EX25_1_Calculator.Calc inner2 = cal.new Calc();
		
		Animal animal = new Animal() {
			@Override
			public void sound() {
				System.out.println("소리를 냅니다.");
			}
		};
	// 람다식
		Animal animal2 = () -> System.out.println("멍멍"); 
	}

}
interface Animal { 
	void sound();
}

class OuterClass {
	private static int staticNum = 10;	//클래스 변숫
	private int instanceNum = 20; 	// 인스턴스변수
	
//	static class InnerClass {
	class InnerClass {
		public void print() {
			System.out.println(staticNum);
			System.out.println(instanceNum);
		}
	}
}