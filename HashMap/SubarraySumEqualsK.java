package dsa.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SubarraySumEqualsK {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int k  = 3;
		int prefixSum = 0;
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0;i<nums.length;i++) {
			prefixSum+=nums[i];
			
			if(prefixSum == k || map.containsKey(prefixSum)) {
				count++;
			}
			
			map.put(prefixSum, i);
		}
		
		System.out.println(count);
		
	}
}
