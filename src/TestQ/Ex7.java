package TestQ;

public class Ex7 {

	public static void main(String[] args) {
		// 문제7. arr 배열의 요소에서 최대값과 최소값을 구해보자.
		int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				// max 값이 작으면 max 값에 arr 배열의 최대값을 max에 저
				max = arr[i];
			}
		}
		System.out.println("최대값 : " + max);

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				// min 값이 크면 min 값을 수정함
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);
	}

}
