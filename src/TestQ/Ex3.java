package TestQ;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,50,3,60,-3};
		int sum = 0;
		double avg = 0.0;
		for (int i=0; i <arr.length; i++) {
			// 누적합
			sum = sum + arr[i];
		}
		System.out.println(sum);
		avg = sum / arr.length;
		System.out.println(avg);
	}

}
