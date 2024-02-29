package ex_240228;

import java.net.MulticastSocket;
import java.security.PublicKey;
import java.util.Scanner;

public class Ex_4_Operator {

	public static void main(String[] args) {

		System.out.println("전위 및 후위 연산자 확인해보기");
		int a = 1;
		int b = ++a;
		System.out.println("a :" + a + ", b : " + b);
	// a의 값을 증가시키고 b에 할당.
		
		int a2 = 1;
		int b2 = a2++;
		System.out.println("a2 :" + a2 + ", b2 : " + b2);
	// a2의 값을 b2에 할당한 뒤에 a2의 값을 증가.
	// 후위 연산자는 반복문에서 주로 사용한다.
		char chartest1 = 'a';
		char chartest2 = 'b';
		int chartest1toint = chartest1;
		int chartest2toint = chartest2;
		System.out.println("char \'a\'에 해당하는 유니코드 값 십진수 표현 : " + chartest1toint);
		System.out.println("char \'b\'에 해당하는 유니코드 값 십진수 표현 : " + chartest2toint);
		
	// 삼항다항식   (조건식)?true(참일 때 실행할 문장):false(거짓일 때 실행할 문장)
		int x =10;
		int y= 12;
		int result = (x>y)?x:y;
		System.out.println(result);
		
		int big;
		if(x>y) {
			big = x;
		}
		else {
				big = y;
			}
		System.out.println(result);
	

	}

}
