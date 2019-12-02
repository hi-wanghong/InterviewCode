package leetcode.easy;

import com.sun.deploy.panel.ITreeNode;
import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;

import javax.lang.model.type.IntersectionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 *
 * 示例 2:
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 *
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 *
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class lc350_intersectionArraysII {
    /**
     * 针对无序数组
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {

        //生成散列表，记录数组中的数字和出现次数
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for(int num1 : nums1){
            counts.put(num1, counts.getOrDefault(num1, 0) + 1);
        }

        //记录数组2中重复出现的数字
        List<Integer> res = new ArrayList<Integer>();

        for(int num2 : nums2){
            if(counts.containsKey(num2) && counts.get(num2) != 0){
                res.add(num2);
                counts.put(num2, counts.get(num2)-1);
            }
        }

        int[] intersection = new int[res.size()];

        for(int j=0; j<res.size(); j++)
            intersection[j] = res.get(j);
        return intersection;
    }

    /**
     * 针对有序数组进行匹配
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersectSort(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        List<Integer> res = new ArrayList<Integer>();

        //首先将两数组进行排序，形成有序数列
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                res.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j])
                i++;
            else
                j++;
        }

        int[] intersection = new int[res.size()];
        for(int k=0; k<res.size(); k++){
            intersection[k] = res.get(k);
        }
        return intersection;

    }


        public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] res = new lc350_intersectionArraysII().intersectSort(nums1, nums2);
        System.out.println(Arrays.toString(res));

    }
}
