package com.arrays;

public class PeakElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeakElementInArray s=new PeakElementInArray();
		int index=s.findPeakElement(new int[] {1,5,6,7,4,3,5});
		System.out.println(index);
		//https://leetcode.com/problems/find-peak-element/?envType=problem-list-v2&envId=array

	}

	

	    public int findPeakElement(int[] nums) {
	        int n=nums.length;
	        if(n==0){
	            return -1;
	        }
	        int maxNumber=nums[0];
	        int maxIndex=0;
	        for(int i=1;i<n;i++){
	            if(nums[i]>maxNumber){
	                 maxNumber=nums[i];
	                 maxIndex=i;
	            }

	        }
	        return maxIndex;
	    }
	
}
