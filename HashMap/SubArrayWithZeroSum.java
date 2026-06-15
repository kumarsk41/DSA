package dsa.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SubArrayWithZeroSum {
	public static void main(String[] args) {
		int[] nums = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
		 Map<Integer, Integer> map = new HashMap<>();

	        int prefixSum = 0;
	        boolean result = false;

	        for (int i = 0; i < nums.length; i++) {

	            prefixSum += nums[i];

	            if (prefixSum == 0 || map.containsKey(prefixSum)) {
	                result = true;
	                break;
	            }

	            map.put(prefixSum, i);
	        }
		System.out.println(result);
	}
}
