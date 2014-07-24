// Two Sum 
// Given an array of integers, find two numbers such that they add up to a specific target number.

// The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

// You may assume that each input would have exactly one solution.

// Input: numbers={2, 7, 11, 15}, target=9
// Output: index1=1, index2=2

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
        	return null;
        }

        int[] res = new int[2];
        int len = numbers.length;
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
        	hs.put(numbers[i], i+1);
        }

        for (int i = 0; i < len; i++) {
        	if (hs.containsKey(target - numbers[i])) {
        		int index1 = i + 1;
        		int index2 = hs.get(target - numbers[i]);
        		if (index1 == index2)
        			continue;
        		res[0] = index1;
        		res[1] = index2;
        		return res;
        	}
        }
        return res;
    }
}