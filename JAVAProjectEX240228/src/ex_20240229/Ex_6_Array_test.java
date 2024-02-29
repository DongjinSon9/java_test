package ex_20240229;

public class Ex_6_Array_test {

	public static void main(String[] args) {
		// 배열 = 크기 고정, 계란판. 같은 타입의 데이터만 받을 수 있다.
		// 배열 생성 방법
		// 1-1. int [] array ; 선언만 한 것
		// 1-2. array = new int [4]; 선언과 생성을 동시에 함
		// 1-3. int [] array = new [5];
		// 1-4. int array [] = new int [5];
		// 2-1. int array [] = { 1, 2, 3};
		// 인덱스 시작, 0부터, 순서가 있다.
		// 선언시 크기를 지정하면 안됨
		int array [] = new int [5];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		// 배열에 값을 불러오기
		System.out.println("array[0]의 값 불러오기 : " + array[0]);
		
		// 선언과 동시에 값을 설정(초기화한다)
		int array2 [] = {1,2,3,4,5};
		// 반복문으로 불러오기
		for(int i=0; i<array2.length; i++) {
			System.out.println("array[" + i + "] = " + array2[i]);
		}
		
		// 문자열 배열 선언 해보기 점심메뉴
		String[] arrayLunchString = {"김밥","김ㅁ밥","김ㅁㅁ밥","김ㅁㅁㅁ밥"};
		for(int i=0; i<arrayLunchString.length; i++) {
			System.out.println("메뉴는 " + arrayLunchString[i]);
		}

	}

}
