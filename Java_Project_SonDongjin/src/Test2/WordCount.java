package Test2;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			String line = scanner.nextLine();

			
			if (line.equalsIgnoreCase("exit")) {
				
				scanner.close();
				System.out.println("종료합니다.");
				break;
			}

			String[] wordArray = line.split(",");

			int numWords = wordArray.length;

			System.out.println("어절 개수는 " + numWords);
		}

	}

}
