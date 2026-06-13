package dsa.HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceHashSet {
 public static void main(String[] args) {
	 int nums[] = {1,0,1,2,2};
	 int result = 0;
	
	 Set<Integer> set = new HashSet<>();
	 for(Integer i:nums) {
		 set.add(i);
	 }
	 
	 for(int i:set) {
		 if(!set.contains(i-1)) {
			 int count = 1;
			 int currentNum = i;
			 
			 while(set.contains(currentNum+1)) {
				 currentNum++;
				 count++;
			 }
			 result = Math.max(result, count);
		 }
	 }
	 
	 System.out.println(result);
 }
}
