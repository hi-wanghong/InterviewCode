package leetcode.easy;

/**
 * https://leetcode-cn.com/problems/single-number/
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 *
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class lc136_singleNum {

    /**
     * 使用异或运算[二进制运算]（如果a、b两个值不相同，则异或结果为1。如果a、b两个值相同，异或结果为0。）
     *                 0异或任何数，是任何数；
     *                 1异或任何数，任何数取反；
     *                 任何一个数字异或自己都等于0
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {

        int temp = 0;

        for (int num : nums){

            temp = temp ^ num;
        }


        return temp;
    }



    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};
        System.out.println(new lc136_singleNum().singleNumber(nums));
    }
}
