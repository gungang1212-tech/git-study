package kr.co.training;

public class Ex21_1_Order {
	//number, amount, status 필드를 가집니다.						1.	o
	//	- 접근 제어자 : private
	//	- number, status는 문자열 / amount는 실수형
	
	// 필드 3개에 대한 getter/setter								2.	o
	//	- amount 필드의 setter에서 주문금액이 100.0 미만일 경우
	// 	"유효하지 않은ㅇ 금액입니다." 출력
	//	- 동일하게 amount 필드의 setter에서 주문 금액이 100.0 이상일 경우 
	//	- "주문번호 : ooo, 주문금액 : ooo, 주문 상태 : ooo"
	
	// 주분번호(number), 주문금액(amount), 주문상태(status)			3.
	//	ex) " ORDER3", 120.5, "결제완료"
	
	private String number;		// 필드 3개
	private String status;
	private float amount;
	
	public void setNumber(String number) {										// number 세터
		this.number = number;										
	}
	public void setStatus(String status) {
		this.status = status;										// status 세터
	}
	
	public void setAmount(float amount) {							// amount 세터
		
		if( amount >= 100.0f ) {									// 100.0 미만 시 출력
			System.out.println("유효하지 않은 금액입니다.");			
		} else {   													// 100.0 이상 시 출력
			System.out.println("주문 번호 :" 	+ this.number + "\n" +	
							   "주문 금액 : "	+ this.amount + "\n" +
							   "주문 상태 : " + this.status);
		}
		
	}
	
	Ex21_1_Order(String number, String status, float amount) {		// 객체 생성 시 바로 세터 사용
		setNumber(number);
		setStatus(status);
		setAmount(amount);
	}
	
	public String getNumber() {										// number 게터
		return this.number;
	}
	public String getStatus() {
		return this.status;											// status 게터
	}
	public float getAmount() {
		return this.amount;											// amount 게터
	}
		   
	public String order() {
		 return getNumber() + ", " + getStatus() + ", " + getAmount();
	}
	
}
