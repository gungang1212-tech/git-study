package kr.co.training;

public class Ex21_2_Character {
	//	힘(str), 민첩(dex), 지력(knowledge), 레벨(level) 필드를 가집니다.
	//	- 모두 정수형
	//	- 접근 제어자 : private
	
	// walk 메서드를 가집니다ㅓ.
	//	- " 캐릭터가 한걸음 움직입니다." 출력
	//	stop 메서드를 가집니다.
	//	- "캐릭터가 멈춥니다" 출력
	
	// 힘과 레벨 필드에 대한 getter/ setter
	
	
	
	
	private int str;									// 필드 4개 : 힘(str) , 민첩(dex), 지력(knowledge), 레벨(level) 
	private int dex;									// 각각 모두 private , int
	private int knowledge;
	private int level;
	
	public void setStr(int str) {						// 힘, 레벨 세터
		this.str = str;
	}
	public void setLevel(int level) {	
		this.level = level;								//
	}	
	
	Ex21_2_Character(int str, int dex, int knowledge, int level) {
		setStr(str);
		this.dex  = dex;
		this.knowledge = knowledge;
		setLevel(level);
	}
	
	public void walk() {								//walk 메서드
		System.out.println("캐릭터가 한걸음 움직입니다.");
	}
	public void stop() {								// stop 메서드
		System.out.println("캐릭터가 멈춥니다.");			
	}		
	
	
	
	
	public int getStr() {								// 힘, 레벨 게터
		return str;
	}
	public int getLevel() {
		return level;								
	}													//
	
 }
