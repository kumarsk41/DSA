package dsa.SlidingWindowTwoPointers;

import java.util.Arrays;

public class RemoveDuplicateTwoPointer {
	public static void main(String[] args) {
		int nums[] = {1,1,2,2,3,3,3,3,3,3,3,3,3,3,3,3,4,4,5,5,6,7,7};
		int j = 0;
		for(int i = 1;i<nums.length;i++) {
			if(nums[j] != nums[i]) {
				j++;
				nums[j] = nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
