package TestQ;

import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
//	문제1. 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		System.out.println("정수 10개 입력");
		Scanner s = new Scanner(System.in);
		int s1 = s.nextInt();
		for(int i=0; i<10; i++) {
			if(i % 3 == 0) {
				continue;
			}
		}
		System.out.println(s1);
	}

}
