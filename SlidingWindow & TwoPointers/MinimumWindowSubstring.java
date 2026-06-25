package dsa.SlidingWindowTwoPointers;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
	public static void main(String[] args) {
		String s = "ADOBECODECBANC";
		String t = "ABCC";
		String result = "";
		if (!(s.length() < t.length())) {

			Map<Character, Integer> target = new HashMap<>();
			Map<Character, Integer> window = new HashMap<>();

			for (char c : t.toCharArray()) {
				target.put(c, target.getOrDefault(c, 0) + 1);
			}

			int left = 0;
			int matched = 0;

			int minLength = Integer.MAX_VALUE;
			int start = 0;

			for (int right = 0; right < s.length(); right++) {

				char c = s.charAt(right);

				window.put(c, window.getOrDefault(c, 0) + 1);

				if (target.containsKey(c) && window.get(c).intValue() <= target.get(c).intValue()) {
					matched++;
				}

				while (matched == t.length()) {

					if (right - left + 1 < minLength) {
						minLength = right - left + 1;
						start = left;
					}

					char leftChar = s.charAt(left);

					window.put(leftChar, window.get(leftChar) - 1);

					if (target.containsKey(leftChar) && window.get(leftChar) < target.get(leftChar)) {
						matched--;
					}

					left++;
				}
			}

			result = minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
		}
		System.out.println(result);
	}
}
