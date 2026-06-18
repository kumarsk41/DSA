package dsa.HashMap;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GroupAnagramsBruteForce {
	public static void main(String[] args) {
		String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		Map<String,List<String>> map = new HashMap();
		
		for(String s:strs) {
			char arr[] = s.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);
			
			map.putIfAbsent(key, new ArrayList<String>());
			map.get(key).add(s);
		}
		for(List<String> l1:map.values()) {
			System.out.println(l1);
		}
	}
}
