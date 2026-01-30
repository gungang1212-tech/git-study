
public class Ex18_Main {											 // 확인
	
		// <필드>
		// 1. 소지금(balance)
		//		> 정수타입, 변수 선언만
		// 2. 모니터 가격 (MONITOR_PRICE)
		//		> 정수 타입, 상수, 값 20000
		// 3. 마우스 가격(MOUSE_PRICE)
		//		> 정수 타입, 상수, 값 18000
		// 4. 데스크탑 가격(DESKTOP_PRICE)
		//		> 정수 타입, 상수 , 값 57000
		
		// <생성자>
		//- 초기 금액을 전달 받는 생성자를 작성하세요.
		//		> 정수 타입의 매개변수 1개를 받습니다.
		//		> 매개변수 이름 : balance
		//		> 소지금 필드에 값을 할당하세요.
		
		// <모니터 구매 메서드>
		//	- 메서드 이름 : buyMonitor
		//	- 반환 타입 : 없음												o
		//	- 매개 변수 : 없음												o
		//	- 아래의 조건을 충족하도록 코드를 작성하세요.
		//		> 소지금 - 모니터 가격을 변수 amount에 할당합니다. (지역 변수)		o
		//		> 그 외의 경우 amount를 소지금에 할당 후 						o				
		//		"모니터를 구입하셨습니다."									o
		//		"남은 금액은 0000원 입니다."									o
		
		//	< 마우스 구매 메서드, 데스크탑 구매 메서드 >
		//	- 메서드 이름  : buyMouse, buyDesktop
		//	- 이하 로직은 모니터 구매 메서드와 완전 동일
		
		//	< 소지금을 확인하는 메서드 >
		//	- 메서드 이름 : getBalance
		//	- 소지금을 반환합니다.

	
	// 필드 작성하기 : balance , MONITOR_PRICE, MOUSE_PRICE, DESKTOP_PRICE
	
	int balance; // 소지금
	final static int MONITOR_PRICE = 20000; // 모니터 가격 20000
	final static int MOUSE_PRICE = 18000;	// 마우스 가격 18000
	final static int DESKTOP_PRICE = 57000;	// 데스크탑 가격 57000
	
	// 생성자 만들기 : balance를 할당 받음 
	public Ex18_Main(int balance) {
		this.balance = balance;
	}
	
	// 모니터 구매 메서드 : (소지금 - 모니터 -> [잔액] ) 의 가격을 변수 amount[잔액]에 임시 저장 (메서드 내부에.) 
//						-> 임시 저장한 잔액 amount를 balance에 할당하기
		public void buyMonitor() {
			int amount = this.balance - this.MONITOR_PRICE;		// 모니터 구매 후 잔액
			this.balance = amount;								// balance 필드의 값을 구매 후 잔액으로 갱신하기.
			System.out.println("모니터를 구입하셨습니다. \n" +		// 모니터 구매 후의 출력문
							   getBalance());
		}
	// 마우스 구매 메서드 : 
		
		public void buyMouse() {
			int amount = this.balance - this.MOUSE_PRICE;
			this.balance  = amount;
			System.out.println("마우스를 구입하셨습니다. \n" +
							   getBalance());
		}
	// 데스크탑 구매 메서드 :
		
		public void buyDesktop() {
			int amount = this.balance - this.DESKTOP_PRICE;
			this.balance = amount;
			System.out.println("데스크탑을 구입하셨습니다. \n" +
							   getBalance());
		}
		
	// 소지금 확인 메서드 : 소지금 반환
		
		public String getBalance() {
			return "남은 잔액은 " + this.balance + "원입니다";
		}
		 
}

