package com.lucas.easy;

public class N852_PeakIndexInAMountainArray {
	public static void main(String[] args) {
		int[] input = {0,2,3,1,0};
		System.out.println(solution(input));
	}
	
	public static int solution(int[] A) {
        int low = 0;
        int high = A.length - 1;
        int mid = 0;
        while(low<high) {
        	mid = (low + high)/2 ;
        	if(A[mid-1] < A[mid] && A[mid] < A[mid+1]) low = mid;
        	if(A[mid-1] > A[mid] && A[mid] > A[mid+1]) high = mid;
        	if(A[mid-1] < A[mid] && A[mid] > A[mid+1]) break;
        }
        return mid;
    }
	
	
}
