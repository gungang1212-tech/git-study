package kr.co.koreait;

public class Ex18_2_Person {
	String name; // 이름
	int age ;	 // 나이
	String address;// 주소
	String phone;	// 폰번호
	
	// 이름하고 나이만 받는 생성자
	//	- 주소와 핸드폰 번호는 기본값을 지정해서 줌
	Ex18_2_Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.address = "칼바람";
		this.phone = "01001001";
	}
	
	
	Ex18_2_Person(String inputName,String inputAddress, int inputAge,String inputPhone) {
		
		
		this.name = inputName;
		this.address = inputAddress;
		this.age = inputAge;
		this.phone = inputPhone;
	
		
	}
	// 필드 선언만
	// 이름(name)
	// 나이(age)
	// 주소(address)
	// 핸드폰 번호(phone)
	
	// introduce 메서드
	// - " 이름 : ooo"
	// - " 나이 : ooo"
	// - " 주소 : ooo"
	// - " 핸드폰 번호 : ooo"
	




	//	필드 : name, age, adress, phone





// 메서드 : 필드 모두 반환하기.
	public String introduce() {
		return "이름 : " + name +     "\n" +
			   "나이 : " + age + 	     "\n" +
			   "주소 : " + address +  "\n" +
			   "핸드폰 번호 :" + phone;
	}
//	public  void introduce() {
//		System.out.println("gd");
//	}
}

