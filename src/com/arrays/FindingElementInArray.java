package com.arrays;

public class FindingElementInArray {


	public static void main(String[] args) {
		int index=FindingElementInArray.search(new int[]{3,4,5,6,7},9 );
		
		if(index != -1)
		    System.out.println("Found at index: " + index);
		else
		    System.out.println("Not found");
		
	}
	
	
	    public static int search(int arr[], int x) {
	        // code here
	        int n=arr.length;
	        if(n==0){
	            return -1;
	        }
	        else {
	        for(int i=0;i<n;i++){
	            if(arr[i]==x){
		            return i;
	            }
	        }
            return -1;

	        }
	        
	    }



}
