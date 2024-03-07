package ex_20240307;

import java.util.Scanner;

public class Main2_ConsoleMode {
	public static void main(String[] args) {
		// 1. 스포츠 등록하기 메서드로
		while (true) {
			System.out.println("-----------스포츠-----------");
			System.out.println("1 ~ 3 번 중 하나를 선택 해주세요.");
			System.out.println("1. 스포츠 등록하기.");
			System.out.println("2. 등록된 스포츠 검색해서 출력하기.");
			System.out.println("3. 종료하기");
			
			// scanner 이용하기
			Scanner scanner = new Scanner(System.in);
			int checknum = scanner.nextInt();
			if(checknum==3) {
				System.out.println("종료합니다.");
				break;
			} else if(checknum==1) {
				// 스포츠 등록
			} else if(checknum==2) {
				// 스포츠 검색
			} else {
				System.out.println("1 ~ 3 번 중에서 선택 해주세요.");
			}
			
			
			
		}
	}

}
