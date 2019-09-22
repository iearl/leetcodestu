package pub.ants.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author magw
 * @version 1.0
 * @date 2019/9/22 上午10:51
 * @description: 两数之和
 */
public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {1,3,90,5,8};
        int target = 8;
        int[] result = twoSum(nums,target);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+"\t");

        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int numbers = target-nums[i];
            if(map.containsKey(numbers)){
                return new int[]{map.get(numbers),i};
            }
            map.put(nums[i],i);

        }
        throw new RuntimeException("不存在两数之和");
    }
}
