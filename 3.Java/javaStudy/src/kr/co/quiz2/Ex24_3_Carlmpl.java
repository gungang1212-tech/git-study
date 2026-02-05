package kr.co.quiz2;

public class Ex24_3_Carlmpl implements Ex24_3_Car {
	
	boolean isRunning = false; // 운행상태여부
	int speed = 0; 			   // 자동차 속도
	
	public void start() {
		if(isRunning == false) {
			isRunning = true;
			System.out.println("자동차가 시작되었습니다.");
		} else {
			System.out.println("자동차가 이미 시작되어 있습니다.");
		}
	}
	
	public void stop() {
		if(isRunning == true) {
			isRunning = false;
			System.out.println("자동차가 정지되었습니다.");
		} else {
			System.out.println("자동차가 이미 정지되어 있습니다.");
		}
	}
	
	public void accelerate(int speed) {
		if(isRunning == true) {
			this.speed += speed;
			System.out.println("자동차가 " + this.speed + "km/h속도로 가속 중입니다.");
		} else {
			System.out.println("자동차가 정지 상태입니다. 먼저 시작해주세요.");
		}
	}
	
	public void brake() {
		if(isRunning == true && speed >0) {
			this.speed -= 10;
			System.out.println("자동차가 감속 중입니다.");
		} else if( speed <= 0) {
			System.out.println("자동차가 이미 정지 상태 입니다.");
		} else {
			System.out.println("자동차가 정지 상태입니다. 먼저 시작하세요.");
		} 
	}
	
	public void getInfo() {
		String status;
		if(isRunning == true) {
			status = "운행중";
		} else {
			status = "정지";
		}
		System.out.println("상태 : " + status + ", 현재속도 : " + speed + "km/h");
	}
}
