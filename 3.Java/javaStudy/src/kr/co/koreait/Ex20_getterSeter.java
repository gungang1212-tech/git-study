package kr.co.koreait;

public class Ex20_getterSeter {

	public static void main(String[] args) {
//		Ex20_1_Person kim = new Ex20_1_Person();
//		kim.setAge(10);
//		System.out.println(kim.getAge());
		Ex20_1_Person gs = new Ex20_1_Person();
		gs.setName("레넥톤");
		gs.setAge(21);
		gs.setAddr("칼바람");
		gs.setIsStudent(true);
		
		System.out.println(gs.getName() + "\n" +
						   gs.getAge() + "\n" +
						   gs.getAddr() + "\n" +
						   gs.getIsStudent() + "\n");
	}

}
