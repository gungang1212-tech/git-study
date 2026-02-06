package kr.co.koreait;

public class Ex28_Thread {
	public static void main(String[] args) throws InterruptedException {
//		Ex28_Test t1 = new Ex28_Test("쓰레드1");
//		
//		t1.start();	// 새로운 스레드를 생성하며 실행
//		t1.run();	// 현재 스레드에서 실행
//		t1.join();
//		System.out.println("쓰레드1 종료");
//		
//		Ex28_Test t2 = new Ex28_Test("쓰레드2");
//		t2.start();
//		t2.join();
//		System.out.println("쓰레드2 종료"); 
		
//		<Thread 클래스 상속 받아서 사용할 때>
//		Ex28_Test t1 = new Ex28_Test("쓰레드1");
//		Ex28_Test t2 = new Ex28_Test("쓰레드2");
//		
//		t1.setOther(t2);
//		t2.setOther(t1);
//		
//		t1.start();
//		t2.start();
		
//		<RUnnable 인터페이스 구현해서 사용할 때>
		
//		1.Runnable을 물려받은 객체 생성
		
		Ex28_1_Counter counter = new Ex28_1_Counter();
		Ex28_1_NumberPrinter np1 = new Ex28_1_NumberPrinter(counter, 1, 100);
		Ex28_1_NumberPrinter np2 = new Ex28_1_NumberPrinter(counter, 1, 100);
		
		Thread t1 = new Thread(np1, "쓰레드-1");
		Thread t2 = new Thread(np2, "쓰레드-2");
		t1.start();
		t2.start();
	}

}


