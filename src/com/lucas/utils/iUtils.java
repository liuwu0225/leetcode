package com.lucas.utils;

public class iUtils {
	public static void printIntArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i);
		}
		System.out.println("");
	}
	
	public static void printInt2DArray(int[][] arr) {
		for(int[] i : arr) {
			iUtils.printIntArray(i);
		}
		System.out.println("");
	}
}
