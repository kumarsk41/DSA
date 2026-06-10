package dsa.string;

import java.util.Arrays;

public class StringCompression {
	public static void main(String[] args) {
		char chars[] = { 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'c' };

		int j = 0, i = 0;

		while (i < chars.length) {
			char check = chars[i];
			int count = 0;

			while(i < chars.length && chars[i] == check) {
				count++;
				i++;
			}

			chars[j] = check;
			j++;

			if (count > 1) {
				String s = String.valueOf(count);
				for (char c : s.toCharArray()) {
					chars[j] = c;
					j++;
				}
			}

		}

		System.out.println(Arrays.toString(chars));
	}
}
