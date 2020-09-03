package leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/plus-one/
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 *
 * 示例 2:
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 */

//这个问题主要是要考虑到进位问题，不能是单纯的个位加1
/*
 * 三种情况：
 *   1. 直接加一
 *   2. 末位是9，进位加1，但是整体数组的长度不变
 *   3. 全为9的情况，999，这时候除了要考虑进位，同时个位加1之后，数字长度变了
 * */
public class lc66_plusOne {
    public int[] plusOne(int[] digits) {
        for(int i=(digits.length-1); i>=0; i--){
            //当前位小于9，则递增，（1. 最末位递增1；2. 最末位是9，一直进位到小于9的位上，如果前一位是9，则继续进位）
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            //如果当前位是9，那么就变成0，之后继续循环即可
            digits[i]=0;

        }

        //没有return说明都是9，需要整体加1位R
        int[] temp = new int[digits.length+1];
        for(int j=0; j<temp.length; j++){
            if(j == 0)
                temp[j] = 1;
            else
                temp[j] = 0;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {0};

        System.out.println(Arrays.toString(new lc66_plusOne().plusOne(nums)));
    }
}
