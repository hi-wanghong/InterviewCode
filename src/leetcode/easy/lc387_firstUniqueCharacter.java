package leetcode.easy;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/solution/
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 案例:
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 *  
 * 注意事项：您可以假定该字符串只包含小写字母。
 */

public class lc387_firstUniqueCharacter {

    /**
     * 这道题最优的解法就是线性复杂度了，为了保证每个元素是唯一的，至少得把每个字符都遍历一遍。
     *
     * 算法的思路就是遍历一遍字符串，然后把字符串中每个字符出现的次数保存在一个哈希表中。
     * 这个过程的时间复杂度为 O(N)，其中 N 为字符串的长度。
     *
     * 接下来需要再遍历一次字符串，这一次利用哈希表来检查遍历的每个字符是不是唯一的。如果当前字符唯一，直接返回当前下标就可以了。
     * 第二次遍历的时间复杂度也是 O(N)。
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();

        //build hash-map 记录字符和出现的次数
        for(int i = 0; i < s.length(); i++){
            Character character = s.charAt(i);

            //Map的新方法getOrDefault(Object,V)允许调用者在代码语句中规定获得在map中符合提供的键的值，
            // 否则在没有找到提供的键的匹配项的时候返回一个“默认值”
            count.put(character, count.getOrDefault(character, 0) + 1);
        }

        //find unique character
        for(int j = 0; j < s.length(); j++){
            if(count.get(s.charAt(j)) == 1)
                return j;
        }

        return -1;

    }

    public static void main(String[] args) {
        String s0 = "leetcode";
        String s1 = "loveleetcode";

        System.out.println(new lc387_firstUniqueCharacter().firstUniqChar(s1));
    }

}
