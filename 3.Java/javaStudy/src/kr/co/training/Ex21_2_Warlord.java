package kr.co.training;

public class Ex21_2_Warlord extends Ex21_2_Character{
	// Character 클래스를 상속받습니다.						o
	
	// 객체 생성 시 힘 50, 민첩 10, 지력 10, 레벨1로 생성
	//	- 부모 생성자를 호출하세요.
	
	// attack 메서드 생성
		//	- "둔기를 휘두릅니다" 출려
		
		// levelUp() 메서드 생성
		//	- "레벨업을 하여 힘이 5 증가합니다." 출력
		//	- " 현재 레벨 : oo , 힘 : oo 출력
		//	- " 현 재 레벨을 1 증가시키고, 힘을 5 증가시킵니다
	Ex21_2_Warlord(int str, int dex, int knowledge, int level) {
		super(str, dex, knowledge, level);
	}
	
	public void attack() {
		System.out.println("둔기를 휘두릅니다.");
	}
	
	//levelUp() 메서드
	
	public void levelUp() {
		System.out.println("레벨업을 하여 힘이 5 증가합니다.");
		setLevel(getLevel() + 1);											// 레벨 1 증가
		setStr(getStr() + 5);												// 힘 기존에서 5 증가
		System.out.println("현재 레벨 : "+ getLevel() + "\n" +"힘 " + getStr());
		
	}
	
	
	
}
