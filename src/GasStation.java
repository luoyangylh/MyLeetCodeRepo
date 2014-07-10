// Gas Station 

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	//use O(n) time
    	//total to check if sum of gas is larger than sum of cost
    	//sum to determine the start point
    	int len = gas.length;
    	int total = 0;
    	int sum = 0;
    	int start = 0;
    	for (int i = 0; i < len; i++) {
    		sum += gas[i] - cost[i];
    		total += gas[i] - cost[i];
    		if (sum < 0) {
    			start = i + 1;
    			sum = 0;
    		}
    	}

    	return total >= 0 ? start : -1;



    	//take too long time O(n*n)
    	int len = gas.length;
    	for (int start = 0; start < len; start++) {
    		int i = 0;
    		int tank = 0;
    		while (i < len) {
    			int station = start + i < len ? start + i : start + i - len;
    			if (tank + gas[station] < cost[station]) {
    				break;
    			} else {
    				tank += gas[station] - cost[station];
    				i++;
    			}
    		}
    		if (i == len) {
    			return start;
    		}
    	}
        return -1;


    }
}