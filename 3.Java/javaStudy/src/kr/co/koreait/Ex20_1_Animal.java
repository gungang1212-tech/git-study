package kr.co.koreait;

public class Ex20_1_Animal {
	// private 인스턴스 변수 name, age를 선언하세요.
	private String name;
	private int age;
	
	// 인스턴스 변수에 대한 getter/setter를 작성하세요.
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	// 기본 생성자 작성
	//	- 매개변수가 하나도 없는 생성자
	//	- {	}
	Ex20_1_Animal() {
		
	}
	// 매개변수 2개를 받는 생성자
	//	- name과 age를 매개변수로 받아 인스턴스 변수에 할당하세요.
	Ex20_1_Animal(String name, int age) {
		setName(name);
		setAge(age);
		
	}
	// eat() 메서드
	//	- 나이가 0~ 1살이면 "이름(나이)가 분유를 먹는 중입니다."
	//	- 나이가 2살 이상이면 "이름(나이)가 사료를 먹는 중입니다." 출력
	public void eat() {
		if(this.age == 0 || this.age == 1) {				// 나이 : 0~1살
			System.out.println(this.name+ (age + "살") + "이 분유를 먹는 중입니다.");
		} else {			// 나이 : 2살 이상
			System.out.println(this.name + (age + "살") + "이 사료를 먹는 중입니다.");
		}
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
