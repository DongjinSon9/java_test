package ex_20240229;

import java.util.Scanner;

public class Ex_3_for {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("더할 숫자를 입력하세요.");
		int nnum = scanner.nextInt();
		int resultNumber = sumn(nnum);
		System.out.println(resultNumber);
		

	}
	// 입력한 수 n까지 더하는 프로그램 만들기
	public static int sumn(int number) {
	// 초깃값, 합의 값을 할당.
		int i, sum = 0;
		for(i=0; i<=number; i++) {
			sum += i;
			
		}
		return sum;
		
	}

}
