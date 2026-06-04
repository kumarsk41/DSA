package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int nums1[] = { 1, 2, 2, 1 };
		int nums2[] = { 2, 2 };
		int min = Math.min(nums1.length, nums2.length);
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set = new HashSet<>();
		for (Integer i : nums1) {
			set1.add(i);
		}
		for (Integer i : nums2) {
			if (set1.contains(i)) {
				set.add(i);
			}
		}
		int result[] = set.stream().mapToInt(a -> a).toArray();
		System.out.println(Arrays.toString(result));
	}
}
