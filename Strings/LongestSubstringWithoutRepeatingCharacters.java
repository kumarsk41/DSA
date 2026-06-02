package dsa.string;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		String s = "abcabcbbacde";
		char arr[] = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		String result = "";
		int pointer = 0;

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			int idx = sb.indexOf(c + "");
			if (idx != -1) {
				sb.delete(0,idx+1);
			} 
			sb.append(c);
				if (sb.length() > result.length()) {
					result = sb.toString();
				}

			}
		
		System.out.println(result);
	}
}