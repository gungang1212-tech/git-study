package kr.co.training;

import java.util.Scanner;

public class Ex03_Array {

	public static void main(String[] args) {
		
		// 1. 5만큼의 길이를 가진 배열 arrString을 생성하세요.	o
		// 2. 위에서 생성한 배열을 아래의 값으로 초기화 하세요.		o
		//		-> "A", "B", "CD", "E" , "FG"
		
		// 3. 배열의 요소를 1개씩 꺼내서 꺼낸 요소가 "CD"일 경우 출력 후 반복문 종료 
		// 배열 생성 -> 값 초기화 -> 반복문으로 값을 꺼내 값 비교
		
		String[] Arr1 = new String[5];
		
		Arr1[0] = "A";
		Arr1[1] = "B";
		Arr1[2] = "CD";
		Arr1[3] = "E";
		Arr1[4] = "FG";
		
		for(int i = 0; i <Arr1.length; i++ ) {
			if( Arr1[i].equals("CD") ) {
				System.out.println(Arr1[i]);
			}
		}
		
		
		
		
		// 1. 사용자에게 입력받은 점수를 보관할 scores 배열 생성(크기 : 4)		o
		// 2. 인덱스별 점수												o
//				-> 0번 인덱스 : 국어점수
//				-> 1번 인덱스 : 영어 점수
//				-> 2번 인덱스 : 수학 점수
//				-> 3번 인덱스 : 과학점수
//		  3. 사용자로부터 국어, 영어, 수학, 과학 점수를 입력받아 알맞은 배열의 위치에 할당하기.	o
//		  4. 배열에 있는 값의 합계 점수와 평균 점수 출력하기.
		
//		배열 타입 : int, -> 값 부여할 스캐너 4반복 -> 값을 순환하여 합계 / 평균 출력
		int sum = 0;
		int avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[4];
		
		for( int i = 0; i<scores.length; i++ ) {
		
			scores[i] = sc.nextInt();	// 배열의 길이만큼 입력을 받고,
			System.out.print( scores[i] + " " );	// 입력을 받을 때마다 배열에 들어간 값을 출력함
		}
		
		for( int i = 0; i < scores.length; i++ ) {
			sum += scores[i]; //합계
			
		}
		avg = sum / scores.length;	//평균
		System.out.println("합계 :" + sum + " / " + "평균 : " + avg);   
	} 

}
