package kr.co.training;

import java.util.HashMap;
import java.util.Scanner;

public class EX05_HashMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		HashMap<String, String> phoneBook = new HashMap<>();		//	전화번호 저장소

		while(isTrue) {
			System.out.println("1.전화번호 추가");
			System.out.println("2.전화번호 검색");
			System.out.println("3.전화번호 전체 검색");
			System.out.println("4.전화번호 삭제");
			System.out.println("0.프로그램 종료");
			System.out.println("메뉴 입력 :");

			int user = sc.nextInt(); // 메뉴 입력 
			sc.nextLine();
			//			1번 입력 시
			//				-사용자로부터 이름과 전화번ㅇ호를 입력받음
			//입력을 받은 키로, 전화번호를 값
			if(user == 1) {
				System.out.println("이름 입력 : ");
				String writeName   = sc.nextLine();	// 이름 입력하기.


				System.out.println("전화번호 입력 : ");
				String writeNumber = sc.nextLine();	// 전화번호 입력 받기

				phoneBook.put(writeName, writeNumber);

				for(String key : phoneBook.keySet()) {
					System.out.println("키: " + key +" / "+"값: " + phoneBook.get(key));
				}
			} else if( user == 2){
				

				//		    2번 입력 시                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    이름을 입력ㅂ 받습니다.
				//				-PhoneBook에 일치하는 번호가 없다면
				//				- "000"의 전화번호를 찾을 수 없습니다 출력
				for(int i = 0; i<phoneBook.size(); i++) {
					
				}
			}	

			//			3번 입력 시
			//				- phoneBook에 존재한 모든 목록을 출력
			//				> "이릅 : 000", "전화번호 : 00000000000"
			//			4번 입력 시 
			//				-사용자로부터 삭제할 이름을 입력 받습니다.
			//				- phoneBook에 일치하는 이름이 있다면
			//					> phoneBook에서 해당이름을 가진 전화번호 제거 후
			//					"000의 전화번호를 삭제햇습니다. 출ㄹ력"
			//				
			//				-phoneBook에 일치하는 이름이 없다면 
			//					>0000의 번호를 찾을 수 업습니다. 출력
			//				
			//				0번 입력 시 
			//					- 프로그램 종료

			// 그외 
			// - "올바른 메뉴 입력"
		}
	}

}
