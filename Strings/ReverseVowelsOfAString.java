package dsa.string;

public class ReverseVowelsOfAString {
	public static void main(String[] args) {
		String s = "IceCreAm";
		char arr[] = s.toCharArray();
		String vowel = "aeiouAEIOU";
		int start = 0;
		int end = arr.length - 1;

		while (end >= start) {
			if (vowel.contains(arr[start] + "")) {
				if (vowel.contains(arr[end] + "")) {
					char temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
					start++;
					end--;
				} else {
					end--;
				}
			} else {
				start++;
			}
		}
		System.out.println(new String(arr));

	}
}
