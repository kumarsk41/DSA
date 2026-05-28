package dsa;

import java.util.Arrays;

public class RotateArrayByK {
	public static void main(String[] args) {
		
//		int nums[] = {1,2,3,4,5,6,7};
		int nums[] = {-10};
		int  k = 3;
		k = k % nums.length;
//		int k = 1;
		int idx = nums.length-1 - k;
		int start = 0;
		int end = idx;
		
		
			while(end>start) {
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
				start++;
				end--;
			}
			
			start = idx+1;
			end = nums.length-1;
			while(end>start) {
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
				start++;
				end--;
			}
			start = 0;
			end = nums.length-1;
			while(end>start) {
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
				start++;
				end--;
			}
		
		
		System.out.println(Arrays.toString(nums));
		
		
	}
}
