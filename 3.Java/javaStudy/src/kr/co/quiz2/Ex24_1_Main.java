package kr.co.quiz2;

public class Ex24_1_Main {
	public static void main(String[] args) {
		Ex24_1_SportCar sc = new Ex24_1_SportCar();
		sc.start();
		sc.accelerate();
		sc.brake();
		
		Ex24_1_RegularCar rc = new Ex24_1_RegularCar();
		rc.start();
		rc.accelerate();
		rc.brake();
	}
}
