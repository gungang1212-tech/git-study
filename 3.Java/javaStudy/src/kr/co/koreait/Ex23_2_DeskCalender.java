package kr.co.koreait;

public class Ex23_2_DeskCalender extends Ex23_2_Calender {
	
	Ex23_2_DeskCalender (String color, int months) {
		super( color, months );
	}
	
	@Override
	public void hanging() {
		System.out.println(color + "색 달력을 벽에 걸기 위해 고리가 필요합니다.");
	}
	public void onTheDesk() {
		System.out.println(color + "색 달력을 벽에 세울 수 있습니다.");
	}
}

  