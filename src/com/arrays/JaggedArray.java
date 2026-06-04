package com.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		
		int matrix[][]= {{1,2},{3,4,5},{6,7}};
		for(int row=0;row<=matrix.length-1;row++) {
			for(int col=0;col<=matrix[row].length-1;col++) {
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}
	}

}
