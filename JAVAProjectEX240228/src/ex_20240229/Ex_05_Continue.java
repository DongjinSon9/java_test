package ex_20240229;

import java.util.Scanner;

public class Ex_05_Continue {

	public static void main(String[] args) {
		// 양수만 더하기
		
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("양수만 더하는 프로그램");
			System.out.println("1번 : 양수만 더하는 프로그램 실행, 0번: 프로그램 종료 >>");
			int number = scanner.nextInt();
			
			// 조건문 분기
			if (number == 0) {
				System.out.println("프로그램 종료합니다.");
				scanner.close();
				break;
			}
			else {
				continueAddEx();
			}		
		}
	}
	// 입력한 수 n 까지 더하는 프로그램 만들기 : 1+2+3+...+n 
	public static void continueAddEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 5개 입력해주세요(연속해서)");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = scanner.nextInt();
			if(n<=0) continue;
			else sum += n;
		}
		System.out.println("합은 : " + sum);
	}
}
