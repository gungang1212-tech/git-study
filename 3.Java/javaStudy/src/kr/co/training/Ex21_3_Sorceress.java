package kr.co.training;

public class Ex21_3_Sorceress extends Ex21_3_Character{
	// character 클래스를 상속 받습니다.					o
	// 소서리스 객체 생성 시 힘10, 민첩7, 지력35로 생성됩니다.	o
	
	// attack 메서드 (오버라이딩)
	//	- "지팡이를 휘두릅니다." 출력
	//	- 경험치 25 증가, 체력 10 감소
	//	- 체력이 10 미만일 경우 "체력이 부족합니다." 출력
	
	// skill 메서드 (오버라이딩)
	//	- "아이스 애로우를 사요 ㅇ합니다." 출력
	//	- 경험치 37 증가, 마력23 감소
	//	- 마력이 23 미만일 경우 "마력이 부족합니다. " 출력
	
	//levelUp 메서드
	//	- "레벨업을 하여 지력이 5 증가합니다." 출력
	//	- 지력 5 증가
	
	// 생성자	
	
	Ex21_3_Sorceress(Ex21_3_CharacterAbiltiy ca) {
		ca.setStr(10);			// 힘 스택 설정
		ca.setDex(7);			// 민첩 스탯 설정
		ca.setKnowledge(35);	// 지력 스탯 설정
		ca.setExperience(0);    // 경험치 0으로 설정 , 나머지 필드값은 초기값 있음.
	}
	
	// attack 메서드
	@Override
	public void attack(Ex21_3_CharacterAbiltiy ca) {
		if(ca.getHp() > 10 ) {
			System.out.println("지팡이를 휘두릅니다.");
			ca.setExperience(25);
			ca.setHp(-10);
		} else {
			System.out.println("체력이 부족합니다.");
		}
	}
		
	// skill 메서드
	@Override
	public void skill(Ex21_3_CharacterAbiltiy ca) {
		if(ca.getMp() >23) {
			System.out.println("아이스 애로우를 사용합니다.");
			ca.setExperience(37);
			ca.setMp(-27);
		} else {
			System.out.println("마력이 부족합니다.");
		}
	
	}
	
	// levelUp 메서드
	public void levelUp(Ex21_3_CharacterAbiltiy ca) {
		System.out.println("레벨업을하여 지력이 5 증가합니다.");
		ca.setLevel(1);
		ca.setMp(5);
	}
 } 
