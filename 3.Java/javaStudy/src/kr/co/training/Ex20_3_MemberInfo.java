package kr.co.training;

public class Ex20_3_MemberInfo {
	
	// 필드
	private String name;
	private int age;
	private String addr;
	private Boolean isStudent;
	
	// 세터
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setIsStudent(Boolean isStudent) {
		this.isStudent = isStudent;
	}
	
	// 게터
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getAddr() {
		return this.addr;
	}
	public Boolean getIsStudent() {
		return this.isStudent;
	}
}
