package com.array.ex;

public class SumandAverageofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, -3, 6, 9, 16, 9, 8 };
		int sum = 0;
		for (int numbers : array) {
			sum += numbers;
		}
		int elements = array.length;

		int average = sum / elements;
		System.out.println("avarage of arrays" + average);

		System.out.println("sum of array :" + sum);
	}

}
