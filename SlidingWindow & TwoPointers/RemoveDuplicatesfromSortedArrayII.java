package dsa.SlidingWindowTwoPointers;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII {
	public static void main(String[] args) {
		 int nums[] = {1,1,2,2,2,2,2,3,3,3,3,4,4,4};

	        if(nums.length <= 2) {
	            System.out.println(nums.length);
	            return;
	        }

	        int temp = 2;

	        for(int i = 2; i < nums.length; i++) {

	            if(nums[i] != nums[temp - 2]) {
	                nums[temp] = nums[i];
	                temp++;
	            }
	        }

	        System.out.println("Length = " + temp);

	        for(int i = 0; i < temp; i++) {
	            System.out.print(nums[i] + " ");
	        }
	    }
	}