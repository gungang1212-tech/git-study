package kr.co.training;

public class Ex23_1_Main {
	public static void main(String[] args) {
	// 1. Farm 객체 생성
	
	// 2. Pig 객체 생성
	
	// 3. Cow 객체 생성
	
	// 4. Farm의 sound() 메서드를 호출하세요.
	//	- 2번 호출하며 각각 Pig와 Cow 객체를 인자로 넘겨주세요.
	
	
	//			------------------------------------
	
	// Q. " 마트가서 우유사고 만약에 아보카도 있으면 6개 사와 "
	//		개발자 남자는 마트를 다녀온 뒤 우유 6개를 건내며 말했다. "아보카도 있었어"
	//		조건에 맞춰서 기능 구현
	
	// Ex23_2_AvocadoCondition 클래스를 생성하세요							21. o			
	//	- hasAvocado 메서드를 작성하세요.
	//		> 해당 메서드는 false를 반환합니다.
	
	// Ex23_2_HasAvocado 클래스를 생성하세요.								25
	//	- Ex23_2_AvocadoCondition 클래스를 상속 받습니다.
	//	- hasAvocado 메서드를 오버라이딩 하세요.
	//		> 해당 메서드는 true를 반환합니다.
	
	// Ex23_2_SuperMarket 클래스를 생성하세요.
	//	- 정수형 milkCount 필드를 가집니다.
	//		> 접근 제어자 : private
	//	- goSuperMarket 메서드를 가집니다.
	//		> 해당 메서드는 Ex23_2_HasAvocado, Ex23_2_NoAvocado 두 객체를
	//		  매개변수로 받습니다. ( 다형성을 활용하여 1개의 매개변수로 받으세요)
	//		> 매개변수로 받은 객체의 hasAvocado 메서드를 호출하세요.
	//			> 호출 결과가 true라면 milkCount를 6으로 할당
	//			> 호출 결과가 false라면 milkCount를 1로 할당
	//	- milkCount 필드에 대한 getter를 작성하세요.
	Ex23_2_AvocadoCondition s = new Ex23_2_AvocadoCondition();
	Ex23_2_superMarket t = new Ex23_2_superMarket();
	t.goSuperMarket(s);
	}
}
