package kr.co.koreait;

public class Ex13_2_Person {
	
	String name;
	int age;
	// 이름, 나이 입력받고 "안녕하세요. 제 이름은 ooo이고, 나이는oo살 입니다. "출력하기.
	public void introduce(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.printf("제이름은 %s이고, 나이는 %d살 입니다.", this.name,this.age);
		System.out.println();
	}
	
	//sayAge() 메서드 생성
	//	-  매개변수로 나이를 받은 후,
	//	-	나이를 반환함.
	//	-	"ooo의 나이는 oo살 입니다."
	public int sayAge(int age) {
		this.age = age;
		System.out.printf("%s의 나이는 %d살 입니다.", this.name, this.age);
		System.out.println();
		return age;
		
	}
	
}
