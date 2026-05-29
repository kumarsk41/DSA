package dsa;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static void main(String[] args) {
		int nums[] = {2,2,1,1,1,1,1,2,2,3,3,3,3,3,3,3,3,3,3,3};
		int major = (nums.length-1)/2;
		Map<Integer,Integer> map = new HashMap<>();
		for(Integer i:nums) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry :map.entrySet()) {
			if(entry.getValue()>major) {
				major = entry.getKey();
				break;
			}
		}
		System.out.println(major);
	}
}
