package kr.co.training;

public class Ex20_Main {

	public static void main(String[] args) {
//		Ex20_1_Animal ani = new Ex20_1_Animal();
//		ani.setAge(21);
//		ani.setName("나피리");
//		System.out.println("이름: " + ani.getName() + "/" + "나이: " + ani.getAge());
		
		// getter / setter를 사용하는 경우
		//	- 객체 생성 후에도 자유롭게 데이터 변경 가능
		//	 - 필요한 필드만 setter로 값을 넣을 수 있음
		//		> 초기값 이후 값을 변경할 필요가 없다면 setter 안만들면 됨
		
		// 생성자로만 필드를 초기화하는 경우
		//	 - 데이터가 불변 (객체 생성후 값이 변하지 않음.)
		
		
//		Ex20_1_Animal ani3 = new Ex20_1_Animal("나피리", 21);
//		System.out.println(ani3.getAge());
		
		Ex20_2_bookInfo bookInfo = new Ex20_2_bookInfo();	//도서관 정보 객체
		int first = bookInfo.setBookCount(100);	//	초기에 100권이 있다
		 
		Ex20_2_Book book = new Ex20_2_Book(); //도서관 객체
		
		book.BorrowBook(bookInfo, 3);			// 도서관 정보, 빌릴 책의 
		
		System.out.println();
		
		// ---------------
		Ex20_3_MemberInfo info = new Ex20_3_MemberInfo();
		Ex20_3_Member member = new Ex20_3_Member();
		info.setName("르블랑"); 
		info.setAge( 21);
		info.setAddr("인천");
		info.setIsStudent(true);
		member.introduce(info);
		member.run(info);
	}

}
