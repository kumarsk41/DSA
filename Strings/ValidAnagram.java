package dsa.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
 public static void main(String[] args) {
	 String s = "anagram", t = "nagaram";
	 boolean result =false;
	 Map<Character,Integer> mapS = new HashMap<>();
	 Map<Character,Integer> mapT = new HashMap<>();
	 for(char c:s.toCharArray()) {
		 mapS.put(c, mapS.getOrDefault(c,0)+1);
	 }
	 for(char c:t.toCharArray()) {
		 mapT.put(c, mapT.getOrDefault(c,0)+1);
	 }
	 if(mapS.equals(mapT)) {
		 result = true;
	 }
	 System.out.println(result);
 }
}
