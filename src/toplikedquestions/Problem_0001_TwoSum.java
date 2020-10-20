package toplikedquestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_0001_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }


    public static int[] twoSumTest(int[] nums, int target) {
        if (nums.length == 0) {
            return nums;
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i< nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumTest(new int[]{-2,-1,3,2,5,7},9)));
    }


    public static int[] twoSum2(int[] nums,int tagert){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(tagert-nums[i])){
                return new int[]{map.get(tagert-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }



}
