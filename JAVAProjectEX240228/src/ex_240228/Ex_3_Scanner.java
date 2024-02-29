package ex_240228;

//특정 기능을 가져와서 사용시 반드시 import 해야한다.
//다른 패키지에 있는 기능을 이용시에는 반드시 필요함.
import java.util.Scanner;

public class Ex_3_Scanner {

	public static void main(String[] args) {

		System.out.println("당신의 이름과 나이를 작성해주세요. 이름 나이  >>");
		Scanner scanner = new Scanner(System.in);
	// system.in , 유저로부터 입력 받은 내용을 바이트로 읽고 scanner가 문자열로 변환한다.
		String nameString = scanner.next();
		int age = scanner.nextInt();	
	// 나이 입력 후 받을 변수
		System.out.println("입력한 이름은 : " + nameString);
		System.out.println("입력한 나이 : " + age );
	// 클래스명 참조형 변수명 = new 클래스명();
	// System, import 없이도 사용할 수 있는 내장 기능.
		
		
		
		
		
	}

}
