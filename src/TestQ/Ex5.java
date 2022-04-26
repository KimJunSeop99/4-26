package TestQ;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// 문제5. arr 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 예) 인덱스: 3
		// {10, 20, 30, 1000, 3, 60, -3}

		int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
		System.out.println("인덱스번호 입력 >> : ");
		Scanner s = new Scanner(System.in);
		int ss = s.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (i == ss) {
				arr[i] = 1000;
			}
			System.out.println(arr[i]);
		}

	}

}
