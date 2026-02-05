package kr.co.quiz2;

import java.util.Scanner;

public class Ex24_2_Login implements Ex24_2_LoginInterface{
	
	String memberId ="id";
	String memberPwd = "qwer1234";
	
	@Override
	public String login(String memberId, String memberPwd) {
		
		Scanner sc = new Scanner(System.in);
		// 아이디 입력
		System.out.println("아이디 입력:");
		String memberID = sc.nextLine();
		
		//비번 입력
		System.out.println("비번 입력: ");
		String pwd = sc.nextLine();
		
		if(this.memberId.equals(memberId) && this.memberPwd.equals(memberPwd)) {
			return "로그인 되었습니다.";
		} else if(!this.memberId.equals(memberId) && this.memberPwd.equals(memberPwd)) {
			return " 아이디가 틀렸습니다. ";
		}  else if(this.memberId.equals(memberId) && this.memberPwd.equals(memberPwd)) {
			return " 비밀번호가 틀렸습니다.";
		}  else {
			return " 다시 입력해주세요.";
		}
	};
}
