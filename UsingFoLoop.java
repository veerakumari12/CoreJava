package com.array.ex;

public class UsingFoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] { 1, 2, 3, 5 };
		// we can also loop through each element of the array.
		for (int i = 0; i < array.length; i++) {
			System.out.println(" " + array[i]);
		}
		// We can also use the for-each loop to iterate through the elements of an array
		for (int arrray : array) {
			System.out.println(" for each looop " + arrray);

		}
	}

}
