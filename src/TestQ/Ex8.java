package TestQ;

public class Ex8 {

	public static void main(String[] args) {
		// 추가 문제8. char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력해보자. 알파벳은 26개.
//		char a = 'A';
//		char z = 'Z';

//		for (char a = 'A'; a <= 'Z'; a++) {
//			System.out.print(a);
//		}
		// 26개 문자 배열
		char[] arr = new char[26];

		// 숫자로 바꾸어야 for 반복문을 쓸 수 있음
		for (int i = 0; i < arr.length; i++) {
			// 문자를 아스키 코드 숫자로 바꾸면
			// 'A' => 아스키코드 65
			arr[i] = (char) (65 + i);
			System.out.print(arr[i]);
		}
	}
}
