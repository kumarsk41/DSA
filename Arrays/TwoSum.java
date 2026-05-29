package dsa;
import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int nums[] = {3,2,4};
		int target = 6;
		int result[] = new int[2];
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		for(int i = 0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i]) && map.get(target-nums[i]) != i) {
				result[0] = i;
				result[1] = map.get(target-nums[i]);
				break;
			}
		}
		System.out.println(Arrays.toString(result));
		
	}
}
