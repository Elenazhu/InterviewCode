package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];
		if (numbers == null || numbers.length == 0) {
			return res;
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (!map.containsKey(numbers[i])) {
				map.put(target - numbers[i], i);
			}
			else {
				res[0] = Math.min(map.get(numbers[i]), i) + 1;
				res[1] = Math.max(map.get(numbers[i]), i) + 1;
			}
		}
		return res;
	}
	
	public int[] twoSum2(int[] numbers, int target) {
		int[] res = new int[2];
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			 if (sum > target) 
				right--;
			else if (sum < target)
				left++;
			else {
					res[0] = numbers[left];
					res[1] = numbers[right];
				}
			 break;
		}
		return res;
	}
	public static void main(String[] agrs) {
		TwoSum obj = new TwoSum();
		int[] numbers = {1,2,3,4,5,6};
		int target = 8;
		System.out.println(obj.twoSum(numbers, target));
	}
}
