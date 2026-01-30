package kr.co.koreait;

public class Ex13_3_BankAccount {
	
	int balance = 0;
	
	// 입금 메서드
	//	- 메서드명 : deposit
	//	- 매개변수 : 입금할 금액 (amount)
	//	- 출력형식 : "000원을 입금했습니다."
	public void deposit(int amount) {
		balance += amount;
		System.out.printf("%d원을 입금했습니다.",amount);
		System.out.println();
	}
	
	// 출금 메서드
	//	- 메서드명 : withdraw
	//	- 매개변수 : 출금할 금액 (amount)
	//	- 출력혓ㅇ식 : "ooo원을 출금했습니다."
	public void withdraw(int amount) {
		balance -= amount;
		System.out.printf("%d원을 출금했습니다.",amount);
		System.out.println();
	}
	
	// 계좌 잔액 확인 메서드
	//	- 메서드명 : checkBalance
	//	- 매개변수 : 없음
	//	- 반환 : " 현재 잔액을 반환합니다.
	public String checkBalance() {
		System.out.println();
		return ("현재 잔액 : "+balance) ;
		
	}
}
