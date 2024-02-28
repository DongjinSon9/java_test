package ex_240228;

public class Ex_1_Hello {
	
	// public (접근 지정자) : 모든 위치에서 접근이 가능.
	// static () : 클래스 메소드(함수), 매개변수 2개이고 리턴값이 있다.(리턴 타입 존재)
	// int : 리턴타입, sum 메소드를 수행 후 결과값의 반환 타입
	// sum : 메소드 명
	// (int a, int b ) : 매개변수이다, 변수 명은 임의로 작성 가능
	// 이 메소드는 해당 클래스가 로더 : 클래스를 불러오는 역할
	// 실행 시, 해당 static 붙은 메소드, 변수 등은 시스템에 불러와져 있어서 클래스명으로 바로 사용 가능.
	// return , 결과값을 의미.
	// 변수타입 : 1) 기본형, 2) 레퍼런스 타입.(기본형을 제외한 나머지 모든 타입)
	
	
	public static int sum(int a, int b) {
		return a + b;
	}

	// void : 리턴값이 없다는 뜻.
	// main : 함수, 자바 프로그램의 시작을 의미
	// (string[] args) : 매개변수 정의 부분, 타입이 배열로 정의가 되어있음.
	// string[] : 배열인데, 타입이 string(문자열), vs 한 문자 의미 (char)
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 20;    
	// 변수 타입 변수 명 = 값;
	// 변수 선언과 할당을 동시에 진행함.
		int i2;
		i2 = 3;
	// 선언과 할당을 분리했음.
		char a = 'a';
	// 한 문자를 표기시 사용, 작은 따옴표를 사용
		String str = "손동진";
	// 문자열 표기시 사용, string은 기본형이 아니라 참조형이다. 큰 따옴표를 사용
		
		int resultnum = sum(100,200);
	
	// 출력 연습해보기
		System.out.println("출력연습 " + " 단축키 : syso + ctr + sp ");
		System.out.println("i값 : " + i);
		System.out.println("실행 단축키 : ctr + f11");
		System.out.println("i2 값 : " + i2);
		System.out.println("a 값 : " + a);
		System.out.println("str 값 : " + str);
		System.out.println(resultnum);
	// 문자열 + 숫자 : +는 연결연산자
		

	}

}
