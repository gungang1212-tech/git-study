package kr.co.training;

public class Ex21_3_CharacterAbiltiy {
	// 아래의 필드들을 가집니다.
	//	- 힘(str) , 민첩(dex) , 지력(knowledge) o
	// 	  레벨(level, 초기값 1) o
	// 	  경험치(exp, 100이 될 경우 레벨이 1 증가하고 겸험치는 0이 됨)	 
	//    체력(hp, 초기갑 100, 레벨업을 해도 회복되지 않음
	//	  마력(mp, 초기갑  100, 레벨업ㅇ르 해도 회복되지 않음
	//		- 모든 필드의 접근 제어자는 private
	//	- 각 필드에 대한 getter /setter 작성
	//	 -현재 능력치를 모두 확인할 수 있는 toStirng  오버라이딩 작성
	//		> toString은 문자열을 반환합니다.
	//		> public void toString() { return "문자열" }
	

	// 필드 모음
	
	private int str;				//힘
	private int dex;				// 민첩
	private int knowledge;			// 지력
	private int experience;			// 경험치 
	private int level = 1;			// 레벨 (초기값 1)
	private int hp = 100;			// 체력 (초기값 100)
	private int mp = 100;			// 마력 (초기값 100)
	
	// 세터 모음
	

	public void setStr(int str) {
		this.str += str;
	}
	public void setDex(int dex) {
		this.dex += dex;
	}
	public void setKnowledge(int knowledge) {
		this.knowledge += knowledge;
	}
	
	
	public void setLevel(int level) {		
		this.level += level;
	
	}
	
	// 경험치 100 도달시 레벨 +1 이후 경험치 0으로 초기화
	public void setExperience(int experience) {
		if(this.experience >= 100) {
			setLevel(1);			// 레벨 1 증가
			this.experience = 0;
		}
	}

			
	
	public void setHp(int hp) {
		this.hp += hp;
	}
	public void setMp(int mp) {
		this.mp += mp;
	}
	
	// 게터 모음
	
	public int getStr() {
		return str;
	}
	
	public int getDex() {
		return dex;
	}
	
	public int getKnowledge() {
		return knowledge;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getMp() {
		return mp;
	}
	
	@Override
	public String toString() {
		
		return 	"힘   : " 		+ str +
				"민첩  :" 		+ dex +
				"지력 :" 		+ knowledge +
				"경험치: " 	+ experience +
				"레벨 :" 		+ level +
				"체력 :" 		+ hp +
				"마력 :" 		+ mp ;
	}
	
	
}