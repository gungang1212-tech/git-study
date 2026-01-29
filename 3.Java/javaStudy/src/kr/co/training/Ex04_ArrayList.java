package kr.co.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_ArrayList {

	public static void main(String[] args) {
		// Q1. 6의 배수만 리스트에 추가하기
		//		- 리스트 이름 : q1
		//		- 들어가는 값들의 타입은 숫자
		//		- 1~ 200 사이의 6의 배수만 리스트 q1에 추가
		
		// 값 추가 되는 리스트 int[] q1 / for문으로 범위 1~200 / 조건문 6의 배수
		
		// 리스트 q1
		ArrayList<Integer> q1 = new ArrayList<>();
		// 추가하는 기능 : 
//				1부터 200까지의 범위로 / 6의 배수인경우 리스트 q1에 추가
		for( int i = 0; i<= 200; i++) { 		
			if( i % 6 == 0 ) {
				q1.add(i);
			}
		}
		// 출력하기 
		System.out.println(q1);
		
		
		//Q2. 학생정보를 저장하기 위한 ArrayList를 생성하기
		// - 프로그램을 아래와 같은 메뉴를 사용자로부터 입력받음.
		//		> "1. 학생 추가"
		//		> "2. 학생 목록 조회"
		//		> "3. 프로그램 종료"
		//		> "	  메뉴 입력: "
		// - 1번 입력 시 사용자로부터 학생의 이름을 입력 받고 ArrayList 에 추가
		// - 2번 입력 시 ArrayList에 저장된 모든 학생의 이름 출력
		// - 3번 입력 시 "프로그램을 종료합니다." 출력 후 종료
		// - 위의 프로그램은 사용자가 종룔를 선택할 때 까지 반복됩닏.ㅏ
		// - 리스트 이름 : student
		
		// -> boolean 사용하여 while문 작성, 입력칸, switch문 사용 1,2,3 
		
		
		
		ArrayList<String> student = new ArrayList<>(); // 학생 이름 저장소
	
		int[] selectList = { 1,2,3 }; 	//선택지 
		
		
		
		

			
		boolean end = true;		// 종료 기능	
		
			while( end ) {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("선택 : 1,2,3");
				int num = sc.nextInt(); // 선택지 (1,2,3) 저장
				sc.nextLine();
				
				if(num == 1) {						// 1번 선택 시 , 리스트에 추가
					System.out.println("추가할 학생의 이름을 입력해주세요 : ");
					String name = sc.nextLine();
					student.add(name);
					System.out.printf("%s 학생이 추가되었습니다.", name);
					
					
				} else if(num == 2 ){					// 2번 선택 시 , 목록 조회
					System.out.println("학생 목록을 조회합니다 : " + student);
				} else if(num == 3 ){								// 3번 선택 시, 종료
					System.out.println("프로그램 종료.");
					end = false;
				} else {
					System.out.println("입력할 값을 수정해주세요.");
				}
//				
				
				
		
		
			}	

	}

}
