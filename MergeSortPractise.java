package com.sort;

public class MergeSortPractise {

	public static void main(String[] args) {
		
		int[] array = {5,2,1,4,3};
		System.out.println("unsorted array");
		printArray(array);
		
		int[] arrayResult = mergeSort(array);
		System.out.println("sorted array is");
		printArray(arrayResult);
	}
	
	
	private static void printArray(int[] array) {
		
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static int[] mergeSort(int[] array){
		
		if(array.length <=1) {
			return array;
		} 
			
		int midpoint = array.length / 2; 
		int[] left = new int[midpoint];
		int[] right;
		
		if(array.length % 2 ==0) {
			right = new int[midpoint];
		} else {
			right = new int[midpoint + 1];
		}
		
		int result[] = new int[array.length];
		
		for(int i=0; i<=midpoint-1; i++) {
			left[i] = array[i];
		}
		
		int x=0;
		for(int j=midpoint; j<array.length ;j++) {
			
			if(x <right.length) {
			right[x] = array[j];
			x++;
			
			}
		}
		
		//int[] result = new int[array.length];
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		result = merge(left, right);
		
		return result;
		
	}
	
	private static int[] merge(int[] left, int[] right) {
		
		int[] result = new int[left.length + right.length];
		
		int leftPointer, rightPointer, resultPointer;
		
		leftPointer=rightPointer=resultPointer = 0;
		
		while(leftPointer < left.length || rightPointer < right.length) {
			
			if(leftPointer < left.length && rightPointer < right.length) {
				
				if(left[leftPointer] <= right[rightPointer]) {
					
					result[resultPointer++] = left[leftPointer++];
//					leftPointer++;
//					resultPointer++;
				} else {
					
					result[resultPointer++] = right[rightPointer++];
//					rightPointer++;
//					resultPointer++;
				}
			}
			
			else if (leftPointer < left.length) {
				
				result[resultPointer++] = left[leftPointer++];
//				leftPointer++;
//				resultPointer++;
			}
			else {
				
				result[resultPointer++] = right[rightPointer++];
//				rightPointer++;
//				resultPointer++;
			}
			
		}
		 return result;
	}
}
