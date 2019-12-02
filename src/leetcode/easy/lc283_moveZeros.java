package leetcode.easy;

import com.sun.tools.jdi.VirtualMachineManagerService;

import javax.sql.rowset.FilteredRowSet;
import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */

public class lc283_moveZeros {

    public void moveZeroes(int[] nums) {
        //作指针用，zero指针指向当前的0位，next指向最近的不为0的位置
        int zero = 0, next = 0;

        //将非0的都挪到前面
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                //遇见不为0，则要和zero位置互换
                nums[zero] = nums[next];
                zero++;
                next++;
            }else{
                //找到最近的非0位
                next++;
            }
        }

        //此时数组后面已经没有0，zero指针指向最近的0位（此时已置换为非0）的后一位，next已经跳到了数组的最末尾的后一位
        //System.out.println(next == (nums.length));

        //将zero和next之间的位置置换为0
        for(int j=zero; j<next; j++)
            nums[j] = 0;


    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        new lc283_moveZeros().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
