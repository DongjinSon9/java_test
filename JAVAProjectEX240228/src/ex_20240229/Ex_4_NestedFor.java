package ex_20240229;

import java.util.Scanner;

public class Ex_4_NestedFor {

	
// 입력 받은 수까지 구구단 출력하기
	public static void main(String[] args) {
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("입력한 수까지 구구단 출력하는 프로그램");
			System.out.println(" 숫자를 입력해주세요, 0번: 종료시 누르기 >>");
			int number = scanner.nextInt();
			
			// 조건문 분기
			if (number >= 1) {
				gugudan(number);
			} else if (number == 0) {
				System.out.println("프로그램 종료합니다.");
				break;
			} else {
				System.out.println("양수 또는 2번중에서 입력해주세요.");
			}
			
			
		}
		
	}
	
	// 입력받은 수까지 구구단 출력하기
	// 중첩 for문 사용
	public static void gugudan(int number) {
		
		for(int i = 1; i<=number; i++) {
			for(int j = 1; j<10; j++) {
				System.out.print(i + "x" + j + "=" + i*j );
				System.out.println('\t');
			}
		}
	}
		
		
		

}
