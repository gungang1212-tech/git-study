package kr.co.training;

public class Ex20_3_Member {
	public void introduce(Ex20_3_MemberInfo memberInfo) {
		String name = memberInfo.getName();
		int age = memberInfo.getAge();
		String addr = memberInfo.getAddr();
		Boolean isStudent = memberInfo.getIsStudent();
		
		System.out.println("이름 :    " + name +	"\n" +
						   "나이 :    " + age +	"\n" +
						   "주소 :    " 	+ addr + "\n"+
						   "학생여부 : " + isStudent);
	}
	public void run(Ex20_3_MemberInfo memberInfo) {
		String name = memberInfo.getName();
		String addr = memberInfo.getAddr();
		System.out.println(addr + "에 사는" + name + "이 달리고 있습니다.");
	}

}
