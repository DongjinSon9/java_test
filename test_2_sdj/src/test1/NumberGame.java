package test1;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
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
