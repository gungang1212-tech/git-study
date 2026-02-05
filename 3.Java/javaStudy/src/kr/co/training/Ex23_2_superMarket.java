package kr.co.training;

public class Ex23_2_superMarket {
	
	Ex23_2_hasAvocado childAvocado1;
	//	- 정수형 milkCount 필드를 가집니다.
	//		> 접근 제어자 : private
	//	- goSuperMarket 메서드를 가집니다.
	//		> 해당 메서드는 Ex23_2_HasAvocado, Ex23_2_NoAvocado 두 객체를	
	
//					부모 : AvocadoCondition
	
//					자식 : HasAvocado, Noavocado
	
	//		  매개변수로 받습니다. ( 다형성을 활용하여 1개의 매개변수로 받으세요)
	//		> 매개변수로 받은 객체의 hasAvocado 메서드를 호출하세요.
	//			> 호출 결과가 true라면 milkCount를 6으로 할당
	//			> 호출 결과가 false라면 milkCount를 1로 할당
	//	- milkCount 필드에 대한 getter를 작성하세요.
	
	private int milkCount;
	
	public void goSuperMarket(Ex23_2_AvocadoCondition avocado) {
		childAvocado1 =(Ex23_2_hasAvocado) avocado; 		
										// childAvocado는 자식클래스 타입 객체필드에 부모 객체를 저장한 것을 가리킴
		Boolean A = childAvocado1.hasAvocado();
		
		if( A == true ) {
			milkCount =6;
		} else {
			milkCount = 1;
		}
		
		
	}
	
	public int getMilkcount() {
		return milkCount;
	}     
}
