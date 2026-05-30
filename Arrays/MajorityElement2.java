package dsa;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement2 {
	public static void main(String[] args) {
		int nums[] = { 3};
		int major = (nums.length) / 3;
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > major) {
				list.add(entry.getKey());
			}
		}
		System.out.println(list);
	}
}
