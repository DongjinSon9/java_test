package ex_20240229;

public class Ex_11_NestedArray_test8 {

	public static void main(String[] args) {
		// 이중 배렿
		// 기본 정의는 배열의 정의랑 같고, [] 하나가 더 추가 된다
		// int atrray [][] = new int [2][2];
		// int [][] atrray = new int [2][2];
		// int array [][] = { {0,0}, {0,1},
		// {1,0}, {1,1} };

		int[][] array1 = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				array1[i][j] = j;
			}
		}
		// 출력
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array1[i][j]);
				System.out.print('\t');
			}
			System.out.println();
		}
		int array2[][] = { { 1, 2 }, { 3, 4 } };

		// 출력
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array2[i][j]);
				System.out.print('\t');
			}
			System.out.println();
		}
	}

}
