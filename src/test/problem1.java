package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 【中国移动云计算】
 * 落单的数
 * 给出2*n+1个的数字，除其中一个数字之外其他每个数字都出现两次，找出这个数字
 * 输入描述：
 * 第一行数组个数
 * 第二行数组元素
 * 输出描述
 * 落单的数
 * 示例1
 * 7
 * 1221343
 * 4
 */
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        int n = sc.nextInt();
        //int[] input = new int[n];
        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            //input[i] = temp;
            counts.put(temp, counts.getOrDefault(temp, 0)+1);

        }
        //System.out.println(Arrays.toString(input));
        for(Map.Entry<Integer, Integer> entry: counts.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 1)
                System.out.println(key);
        }
    }
}
