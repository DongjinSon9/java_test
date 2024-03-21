package Test2;

import java.util.HashMap;
import java.util.Scanner;

public class Country {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");
		for (int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			String countryInput = scanner.nextLine();
			String[] countryList = countryInput.split("\\s+");
			String country = countryList[0];
			int peoples = Integer.parseInt(countryList[1]);
			nations.put(country, peoples);
		}

		scanner.close();

		String smallestCountry = null;
		int minPopulation = Integer.MAX_VALUE;

		for (String country : nations.keySet()) {
			int population = nations.get(country);
			if (population < minPopulation) {
				smallestCountry = country;
				minPopulation = population;
			}
		}

		System.out.println("제일 인구가 적은 나라는 (" + smallestCountry + ", " + minPopulation + ")");

	}

}
