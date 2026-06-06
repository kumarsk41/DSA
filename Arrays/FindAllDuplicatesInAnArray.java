package dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindAllDuplicatesInAnArray {
	public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(Integer i:nums) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 2) {
				list.add(entry.getKey());
			}
		}
		System.out.println(list);
	}
}
