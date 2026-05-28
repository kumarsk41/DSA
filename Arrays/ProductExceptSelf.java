package dsa;

import java.util.Arrays;

public class ProductExceptSelf {
 public static void main(String[] args) {
//	 int nums[] = {1,2,3,4,5,6};
//	 int nums[] = {1,0,2,0,3,0};
	 int nums[] = {1,2,3,0,4,5,6};
	 int idx = 0;
		int mul=1;
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] == 0) {
				idx++;
				continue;
			}
			mul*=nums[i];
		}
		if(idx > 1 && idx !=nums.length){
			for(int i = 0;i<nums.length;i++) {
				nums[i] = 0;
			}
		}else if(idx == 0 && idx !=nums.length){
			for(int i = 0;i<nums.length;i++) {
				nums[i] = mul/nums[i];
			}
		}else if(idx == 1 && idx !=nums.length) {
			for(int i = 0;i<nums.length;i++) {
			if(nums[i]== 0) {
				nums[i] = mul;
			}else {
				nums[i] = 0;
			}
			}
			
		}
		System.out.println(Arrays.toString(nums));

 }
}
