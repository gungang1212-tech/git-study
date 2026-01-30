package kr.co.koreait;

public class Ex13_Method {

	public static void main(String[] args) {
		
//		int[] numbers = {100,200,300,400};
//		
//		Ex13_1_Calc a = new Ex13_1_Calc();
//		System.out.println(a.sum(numbers));
//	
//	
//		public String printHello(String str) {
//		System.out.println(str);
//		return "잘 출력되었습니다.";
		
//		Ex13_2_Person person = new Ex13_2_Person();	
//		person.introduce("레넥톤", 500);
//		person.sayAge(50);
		
		Ex13_3_BankAccount account1 = new Ex13_3_BankAccount();
		account1.deposit(5000);
		account1.withdraw(500);
		account1.deposit(9500);
		System.out.println(account1.checkBalance());
	}

}
