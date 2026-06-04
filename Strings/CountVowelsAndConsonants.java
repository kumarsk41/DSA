package dsa.string;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		String s = "shaShaNkekUmiR";
		s = s.toLowerCase();
		String vowel = "aeiou";
		int vowelCount = 0;
		int consoCount = 0;
		char arr[] = s.toCharArray();
		for(int i = 0;i<arr.length;i++) {
			if(vowel.contains(arr[i]+"")) {
				vowelCount++;
			}else if(arr[i]>='a' && 'z'>=arr[i]) {
				consoCount++;
			}
		}
		System.out.println("vowel count: "+vowelCount+"\n"+"consonant count: "+ consoCount);
	}
}
