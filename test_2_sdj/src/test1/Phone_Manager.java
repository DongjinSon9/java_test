package test1;

import java.util.Scanner;

public class Phone_Manager extends Phone {

	public Phone_Manager(String name, String tel, String address) {
		super(name, tel, address);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수 >> ");
		int n = scanner.nextInt();
		Phone[] phoneMember = new Phone[n];

		for (int i = 0; i < phoneMember.length; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
			String name = scanner.next();
			String tel = scanner.next();
			String address = scanner.next();
			phoneMember[i] = new Phone(name, tel, address);
		}
		System.out.println("저장되었습니다...");

		while (true) {
			System.out.println("검색할 이름 >> ");
			String searchName = scanner.next();
			boolean found = false;
			for (Phone phone : phoneMember) {
				if (phone.name.equals(searchName)) {
					phone.showMember();
					found = true;
					break;
				}
			}

			if (!found && !searchName.equals("exist")) {
				System.out.println(searchName + " 은(는) 없습니다.");
			}
			if (searchName.equals("exist")) {
				System.out.println("프로그램을 종료합니다...");
				scanner.close();
				break;
			}
		}

	}

}
