package ex_20240304;

import java.util.Scanner;

public class Ex_01_try_catch {

	public static void main(String[] args) {
		// Try catch 연습장
		// 비정상적인 종료르 막기위해서 미리 예외로 처리를 한다
		// 알고 대비를 해서 예측하지 못한 비정상적인 종료를 막을 수 있다
		// 만약 예외 처리를 하지 않으면 해당 프로그램이 정상 종료가 아니라 
		
		// 비정상이라서 동작을 정상 수행을 못 하게 됨.
		// 예) 파일을 입출력, 네트워크 통신을 통해서 데이터를 못 받아올 때
		// 파일의 입출력, 네트워크 통신(소켓) 할 때 컴파일러가 의무적으로 예외처리를 요구함
		
		// 예외 처리하는 형식도 각각의 디테일하게 조정을 할 수 있지만, 그 디테일한 예외처리를 포함한 범위가 넓은 예외를 처리하는 경우도 있음.
		
		
		// 예외처리가 1) 배열의 범위를 벗어나는 인덱스에 접근
		// 2) 0으로 나누는 경우
		// 3) 콘솔에서 정수인데 문자열을 입력하는 경우
		// 여기 전부다 발생하지 않는 상황임 (실무)
		// TRY CATCH FINALLY 기본 구문 연습용으로 2번 연습

		int x;
		int y;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나뉨수를 입력하세요");
		x = scanner.nextInt();
		
		System.out.println("나눗수를 입력하세요");
		y = scanner.nextInt();
		
		// 예외처리 없이 자동으로 처리된걸 확인. 0입력
//		System.out.println("몫은 " + x/y + "입니다.");
		
		try {
			System.out.println("몫은 " + x/y + "입니다.");
			
			// 디테일한 예외로 처리를 하고
			// 2번째 포괄적인 예외로 처리하는 부분	
		} 
//		catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		
		// 오류의 원인이 뭔지 출력해줌
		catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("오류의 원인 : " + e.getMessage());
		}
		
		finally {
			// 예외 발생 여부 상관 없이 무조건 실행
			// 보통 해당 인스턴스 반납시 사용함
			// 스캐너 닫을 떄 사용
			System.out.println("예외 처리를 후, finally 실행함");
			scanner.close();
		}

	}

}
