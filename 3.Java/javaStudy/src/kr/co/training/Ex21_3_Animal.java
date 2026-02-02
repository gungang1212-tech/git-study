package kr.co.training;

public class Ex21_3_Animal {
	String name;
	int age;
	
	Ex21_3_Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {

		System.out.println("%s(%d살)이(가) 먹는중입니다.");
	}
}
