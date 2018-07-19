package com.lucas.easy;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.lucas.utils.iUtils;

public class N867_TransposeMatrix {
	public static void main(String[] args) {
		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		iUtils.printInt2DArray(solution(input));

	}

	public static int[][] solution(int[][] A) {
		if (A == null)
			return null;
		int[][] rst = new int[A[0].length][A.length];
		int[] oneDimension = new int[A.length * A[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				oneDimension[i * A[0].length + j] = A[i][j];
			}
		}
		for (int i = 0; i < A[0].length; i++) {
			for (int j = 0; j < A.length; j++) {
				rst[i][j] = oneDimension[i + j * A[0].length];
			}
		}
		return rst;
	}
}
