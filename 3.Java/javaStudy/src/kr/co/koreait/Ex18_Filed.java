package kr.co.koreait;

public class Ex18_Filed {

	public static void main(String[] args) {
		// 필드
		int num =10; // 인스턴스 변수
		
		//필드( = 멤버 변수)
		//	- 클래스 레벨의 변수를 의미
		
//		int num2 = 20;
//		
//		Ex18_Car car = new Ex18_Car();
//		car.wheel = 5; 
//		
//		System.out.println(car.speed);
//		System.out.println(car.wheel);
//		System.out.print("sonata : " + " ");
//		Ex18_Car sonata = new Ex18_Car();
//		sonata.wheel = 7;
//		sonata.speed = 140;
//		System.out.println(sonata.speed +" / "+ sonata.wheel);
//		System.out.println();

		
//		ex.age = 41;
//		System.out.println(ex.introduce());
//		System.out.println(Ex18_2_Person.HOBBY);
//		Ex18_2_Person.introduce();
		
		Ex18_2_Person ex = new Ex18_2_Person("신짱구", "인천대공원", 80, "010-8921-7441");
		Ex18_2_Person ex2 = new Ex18_2_Person("바보", 80);
	
		System.out.println(ex2.introduce());
	}
	

}
