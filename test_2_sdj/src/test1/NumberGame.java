package test1;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
	// 1. 1~100 사이의 홀수를 생성
		int thinkNumber = (int) (Math.random() * 99);
		while (thinkNumber % 2 != 1) {
			if (thinkNumber == 98) {
				thinkNumber++;
			} else {
				thinkNumber++;
			}
		}
		System.out.println("컴퓨터가 숫자를 생각했습니다.");
		System.out.println("힌트는 홀수입니다.");
		System.out.print("1~100 사이의 값을 입력 >> ");
	// 2. 시스템 입력으로 수를 입력하고 일치하는지 확인하고 결과 메세지 출력
		int inputNumber = scanner.nextInt();
		int count = 0;
		while (inputNumber != thinkNumber) {
			if (inputNumber > thinkNumber) {
				System.out.println("더 작은 수 입니다.");
				System.out.print("1~100 사이의 값을 입력 >> ");
				inputNumber = scanner.nextInt();
				count++;
			} else if (inputNumber < thinkNumber) {
				System.out.println(" 더 큰 수 입니다.");
				System.out.print("1~100 사이의 값을 입력 >> ");
				inputNumber = scanner.nextInt();
				count++;
			}
		}
		count++;
		System.out.println(count + " 회만에 맞췄습니다.");		
		System.out.println("=== 게임을 종료합니다. ===");
		scanner.close();
	}

}
