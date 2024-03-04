package ex_20240304;

import java.util.Scanner;

public class Ex_03_class_2_Idol {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("그룹명을 입력해주세요");
		String groupNameString = scanner.next();
		
		System.out.println("그룹의 멤버수를 입력해주세요");
		int groupNumber = scanner.nextInt();
		
		System.out.println("그룹 멤버를 입력해주세요 (공백으로 구분)");
		String[] groupMemberStrings = new String[groupNumber];
		for(int i = 0; i < groupMemberStrings.length; i++) {
			groupMemberStrings[i]= scanner.next(); 
		}
		
		System.out.println("대표 앨범 3개를 입력해주세요 (공백으로 구분)");
		String[] groupAlbum = new String[3];
		for(int i = 0; i < groupAlbum.length; i++) {
			groupAlbum[i]= scanner.next(); 
		}
		
		
		
		
		Idol btsIdol = new Idol("BTS", groupMemberStrings, groupAlbum);
		btsIdol.introduceMember();
		btsIdol.introduceAlbum();
		scanner.close();
	}

}
