package Test2;

import java.util.HashMap;
import java.util.Scanner;

public class DrinkSearch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashMap<String, Integer> drinkInfo = new HashMap<String, Integer>();
		drinkInfo.put("밀키스", 700);
		drinkInfo.put("코카콜라", 800);
		drinkInfo.put("펩시", 1000);
		drinkInfo.put("칠성사이다", 1200);

		System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다.");
		while (true) {
			System.out.print("선택 >> ");
			String name = scanner.next();
			if (drinkInfo.containsKey(name)) {
				System.out.println(name + "는 " + drinkInfo.get(name) + "원 입니다.");
			}
			if (name.equalsIgnoreCase("그만")) {
				scanner.close();
				System.out.println("종료합니다...");
				break;
			}
		}

	}

}
