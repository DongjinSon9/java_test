package Test2;

import java.util.HashMap;
import java.util.Scanner;

public class BankManager {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> memberInfo = new HashMap<>();

		System.out.println("<< 통장 관리 프로그램입니다. >>");
		while (true) {
			System.out.print("이름과 금액입력>> ");
			String info = scanner.nextLine();

			if (info.equalsIgnoreCase("exit")) {
				scanner.close();
				System.out.println("프로그램을 종료합니다...");
				break;
			}

			String[] userCash = info.split("\\s+");
			String name = userCash[0];
			int cash = Integer.parseInt(userCash[1]);

			if (memberInfo.containsKey(name)) {
				int plusCash = memberInfo.get(name);
				memberInfo.put(name, plusCash + cash);
			} else {
				memberInfo.put(name, cash);
			}

			for (String nameset : memberInfo.keySet()) {
				System.out.print("(" + nameset + ">" + memberInfo.get(nameset) + "원)");
			}
			System.out.println();
		}

	}

}
