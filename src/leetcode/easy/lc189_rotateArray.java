package leetcode.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/rotate-array/
 *
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 * 示例 2:
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 */
public class lc189_rotateArray {
    /**
     * 方法1：暴力法
     *
     * 【复杂度分析】
     * 时间复杂度：O(n*k)O(n∗k) 。每个元素都被移动 1 步（O(n)O(n)） k次（O(k)O(k)） 。
     * 空间复杂度：O(1)O(1) 。没有额外空间被使用。
     *
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
        for(int i=0; i<k; i++){
            int temp = nums[nums.length-1];
            for(int j=nums.length-1; j>0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }

    }

    /**
     * 方法2：使用额外的数组空间
     * 将原本数组中i位置的元素放在新数组中的((i+k)%nums.length)的位置上
     * （要注意这个取余！ 否则容易超出数组长度的位置）
     *
     * 【复杂度分析】
     * 时间复杂度： O(n)O(n) 。将数字放到新的数组中需要一遍遍历，另一边来把新数组的元素拷贝回原数组。
     * 空间复杂度： O(n)O(n)。另一个数组需要原数组长度的空间。
     *
     * @param nums
     * @param k
     */
    public void rotate2(int[] nums, int k) {
        int[] temp = new int[nums.length];

        //转储
        for(int i=0; i<nums.length-1; i++){
            temp[(i+k)%nums.length] = nums[i];
        }

        //复制
        for(int j=0; j<temp.length-1; j++){
            nums[j] = temp[j];
        }

    }

    public void rotate3(int[] nums, int k) {


    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1,2,3,4,5,6,7};

        new lc189_rotateArray().rotate1(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}
