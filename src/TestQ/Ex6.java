package TestQ;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// 문제6. 인덱스 번호 2개를 입력받아, 그 값을 서로 바꿔보자.
		// 예) 인덱스: 1 인덱스: 2
		// {10, 30, 20, 50, 3, 60, -3}
		System.out.println("숫자 입력 >> ");
		int[] arr = { 10, 20, 30, 50, 3, 60, -3 };

		Scanner s = new Scanner(System.in);
		int choice1 = s.nextInt();
		int choice2 = s.nextInt();

		// 변수에 값을 서로 바꾸기 : swap
		// 임시변수가 필요함
		int temp = arr[choice1];
		arr[choice1] = arr[choice2];
		arr[choice2] = temp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
