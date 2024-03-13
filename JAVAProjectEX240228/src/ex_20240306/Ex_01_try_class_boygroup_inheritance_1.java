package ex_20240306;

import ex_20240304.Idol;

public class Ex_01_try_class_boygroup_inheritance_1 extends Idol {

	// 상속 기본 문법
	// 클래스명 extends 상속할클래스명
	// 주의, 반드시 초기화가 되어야 한다.
	
	public Ex_01_try_class_boygroup_inheritance_1(String groupName, String[] groupMembers, String[] groupAlbums) {
		super(groupName, groupMembers, groupAlbums); // 부모 초기화
		
	}
}
