package ex_240228;

class Person {
	private String username;
	private String useremail;
	
	public Person( String name, String email) {
		this.username = name;
		this.useremail = email;
	}
	
public void dodance() {
	System.out.println("춤추기");
}
public void info() {
	System.out.println();
}
}



public class Ex_2 {
	
	

	public static void main(String[] args) {
		/* 
		 * 변수 사용시 유의 사항
		 * 1. 특수 문자는 _ 와 $ 만 사용 가능.
		 * 2. 유니코드, 한글 사용하지만 잘 사용 안 한다.
		 * 3. 자바에서 예약어(키워드)로 사용 중인 것은 변수로 사용 불가능.
		 * 4. 길이 제한 없지만, 의미 있게 이름을 짓는다.
		 * 5. 첫글자에 숫자를 사용할 수 없다.
		 */
		
//		int 12d;
//		int !nunber;
	// 사용 불가능. (주석처리)
		int 학번;
		int _nun;
	// 작동은 하지만 사용하지 않는다.
//		String class;
	// 예약어는 컴파일러 오류가 난다.(주석처리)
	// 대문자, 소문자를 구분한다.
		int num;
		int Num;
		
		byte byte1 = 127;
//		byte byte2 = 128;
	// 8bit에 담을 수 없으므로 에러가 난다.
	// 10진수 = 10, 2진수 = 000 1010(2^3 + 2^1, 제일 우측은 2^0)
	// byte, short, int, log : 실수형. 각각 8, 16, 32, 64 bit
	// float, double : 실수형
		
	// 같은 타입의 변수를 연속해서 나열할 수 있다.
		int i1, i2, i3;
		
	// 각 진수 표기법
		int num1 = 10;
		System.out.println("num1 : " + num1);
	// 이진수 표기법, 0b, ex) 0b1010
		int num2 = 0b1010;
		System.out.println("num2 : " + num2);
	// 팔진수 표기법, 0, ex) 012
		int num3 = 012;
		System.out.println("num3 : " + num3);
	// 16진수 표기법, 0x, 0~9 a b c d e f, ex)
		int num4 = 0xa;
		System.out.println("num4 : " + num4);
		
	// long 표기법, ~l(L), ex) 10000000000L
		long num5 = 100000000000000000l;
	// float 표기법, f, 실수형
		float num6 = 1.2345f;
	// double 표기법, , 실수형
		double num7 = 1.1234123123123123123123123;
	// boolean, true, false
		boolean ischecked = false;
	//레퍼런스 타입으로 선언하기.
	// 클래스명 참조형 변수 이름 = new(키워드) 클래스생성자(매개변수가 2개)
		Person lsyPerson = new Person("이상용", "lsy@aaa.aaa");
		
		
		

	}

}
