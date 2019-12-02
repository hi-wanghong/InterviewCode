package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/valid-anagram/
 *
 *给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class lc242_validAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> counts = new HashMap<Character, Integer>();

        //记录第一个字符串中字符和出现的次数
        for(Character character : s.toCharArray()){
            counts.put(character, counts.getOrDefault(character, 0)+1);
        }

        for(Character ch : t.toCharArray()){
            if(counts.containsKey(ch)){
                counts.put(ch, counts.get(ch)-1);
            }else
                return false;
        }

        //经过递减处理之后，如果是异位词，那么原始的散列表中的每个key对应的value都应该是0
        for(Map.Entry<Character, Integer> mapSet : counts.entrySet())
            if(mapSet.getValue() != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        String s = "aabb", t = "bbcb";

        System.out.println(new lc242_validAnagram().isAnagram(s, t));

    }

}
