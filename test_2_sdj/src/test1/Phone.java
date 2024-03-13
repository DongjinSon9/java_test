package test1;

public class Phone {
	public String name;
	public String tel;
	public String address;
	
	public Phone () {
		
	}
	
	public Phone(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	
	
	public void showMember() {
		System.out.println(name + "의 번호와 주소는 " + tel + ", " + address + " 입니다.");
	}
}
