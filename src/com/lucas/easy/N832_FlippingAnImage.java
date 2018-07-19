package com.lucas.easy;

import com.lucas.utils.*;

public class N832_FlippingAnImage {
	public static void main(String[] args) {
		int[][] input = {{1,1,0},{1,0,1},{0,0,0}};
		int[][] rst = solution(input);
		for(int[] is : rst) {
			iUtils.printIntArray(is);
		}
	}
	
	public static int[][] solution(int[][] A) {
        for(int i=0; i<A.length; i++){
            A[i] = flipAndInvert(A[i]);
        }
        return A;
    }
	
	public static int[] flipAndInvert(int[] in) {
		int[] out = new int[in.length];
		for(int i=0; i<in.length; i++) {
			out[in.length-1-i] = in[i];
			out[in.length-1-i] = out[in.length-1-i] ^ 1;
		}
		return out;
	}
	
//	public static int[] flip(int[] in) {
//		int[] out = new int[in.length];
//		for(int i=0; i<in.length; i++) {
//			out[in.length-1-i] = in[i];
//		}
//		return out;
//	}
//	
//	public static int[] invert(int[] in) {
//		for(int i=0; i<in.length; i++) {
//			in[i] = in[i] == 1 ? 0:1;
//		}
//		return in;
//	}
}
