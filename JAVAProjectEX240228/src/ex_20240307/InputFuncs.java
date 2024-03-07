package ex_20240307;

import java.util.Scanner;

public class InputFuncs {
	// 1. 등록하는 기능
	public static void enrollSports() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("스포츠 종목명을 입력해주세요.");
		String sportsName = scanner.next();
		
		System.out.println("인원수를 입력해주세요.(숫자)");
		int sportsMemberCount = scanner.nextInt();
		
		System.out.println("경기시간을 입력해주세요.");
		String sportsPlayTime = scanner.next();
		
		System.out.println("경기장소를 입력해주세요.");
		String sportsPlayPlace = scanner.next();
		
		System.out.println("개막 시즌을 입력해주세요.(1. 봄 2. 여름 3. 가을 4. 겨울");
		int sportsStartSeason = scanner.nextInt();
		
		System.out.println("실내(1), 실외(2) 어디인지 입력해주세요.");
		int sportsInOut = scanner.nextInt();
		
		System.out.println("대표 멤버 3명을 입력해주세요.(띄어쓰기)");
		String [] members = new String[3];
		for(int i = 0 ; i < members.length ; i++) {
			members[i]= scanner.next(); 			
		}
		
		System.out.println("대표 장비 3개를 입력해주세요.(띄어쓰기)");
		String [] itrms = new String[3];
		for(int i = 0 ; i < items.length ; i++) {
			itrms[i]= scanner.next(); 			
		}
		
	}
	
	
	// 2. 스포츠를 검색해서 출력하는 기능
	
	
}
