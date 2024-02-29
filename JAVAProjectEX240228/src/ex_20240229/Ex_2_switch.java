package ex_20240229;

import java.util.Scanner;

public class Ex_2_switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("날씨에 따른 메뉴 선택하기");
		System.out.println("1. 맑음. 2. 흐림. 3. 비. 4. 디폴트. , 숫자를 선택해주세요. >>>>>");
		int pickNumber = scanner.nextInt();
		String resultPickMenuString = pickLunchMenuWeather(pickNumber);
		System.out.println("오늘 점심은 " + resultPickMenuString + " 입니다.");

	}
	
	// 날씨에 따라 메뉴를 정해주는 프로그램 만들기.
	public static String pickLunchMenuWeather(int number) {
		switch (number) {
		case 1:
			String menuString = "우렁 된장찌개";
			return menuString;

		case 2:
			String menuString2 = "차돌 된장찌개";
			return menuString2;

		case 3:
			String menuString3 = "조개 된장찌개";
			return menuString3;


		default:
			String menuString4 = "두부 된장찌개";
			return menuString4;
		}
		
	}

}
