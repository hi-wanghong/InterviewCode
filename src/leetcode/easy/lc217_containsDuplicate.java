package leetcode.easy;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/contains-duplicate/
 *
 *给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class lc217_containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();

        for(int num : nums){
            counts.put(num, counts.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            int val = entry.getValue();
            if(val >=2)
                return true;
            if(val == 1)
                continue;;
        }
        return false;


    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        System.out.println(new lc217_containsDuplicate().containsDuplicate(nums));
    }
}
