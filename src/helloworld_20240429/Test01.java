/*
 연습으로 만든 자바 파일
 2024-04-29
 */


package helloworld_20240429;

public class Test01 {

	public static void main(String[] args) {
		
		// 정수 변수 x를 선언
		int x; //메모리(ram)에 4byte 공간이 하나 생성됨-> 이름이 x로
		x = 10;  // 위에서 선언된 정수 변수 x에 정수값 10이 저장됨 ->x의 초기값은 10이다 ->x를 초기화했다
		int y;
		int z;
		
		// int x, y, z;  // 한번에 3개의 정수변수를 선언 (타입이 같을 때만)
		
		// int x;  // 이미 선언된 변수를 다시 선언하는 것은 불가
		x=100; // 값을 바꾸는건 됨 
		
		int a = 100;  // 정수변수 a를 선언과 동시에 100으로 초기화
		
		//z = a + y;  // The local variable y may not have been initialized
		
		System.out.println("저의 수학점수는 " + a + "점 입니다!");
		System.out.println("큰따옴표\"\"를 찍어봅시다");

	}
	
	int b;
	
	char c = 'A'; //c 변수에 65가 저장 -> 한개의 문자는 ''로 묶음
	// char d = "A"; // 에러 발생 -> ""로 묶었다는 것은 문자열을 의미
	
	double e1 = 10.1;
	
	float e2 = 3.14f;  // float 변수는 f를 뒤에 붙여줘야됨
	
	String f = "Korea";  //문자열은 String(첫글자 대문자!!)로 선언, 예약어가 아니라 클래스임
	
	long k = 10L; //long 변수는 뒤에 L를 붙여줘야됨
	
	boolean aaa = true;  // 소문자로 적어야 함 
	boolean bbb = false; 
	
	 
	
	 	
}
