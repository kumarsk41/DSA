package dsa.HashMap;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GroupAnagramsOptimised {
	public static void main(String[] args) {
		String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		List<List<String>> list = new ArrayList<>();

		for (int i = 0; i < strs.length; i++) {
			char temp[] = strs[i].toCharArray();
			List<String> list1 = new ArrayList();
			Arrays.sort(temp);
			String s = new String(temp);
			if (!map.containsKey(s)) {
				list1.add(strs[i]);
			}
			for (int j = i + 1; j < strs.length; j++) {
				char check[] = strs[j].toCharArray();
				Arrays.sort(check);
				String s1 = new String(check);
				if (s.equals(s1) && !map.containsKey(s1)) {
					list1.add(strs[j]);
				}
			}
			if (!map.containsKey(s)) {
				list.add(list1);
			}
			map.put(s, i);
		}

		for (List<String> printList : list) {
			System.out.println(printList);
		}
	}
}
