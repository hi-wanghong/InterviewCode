package leetcode.easy;

/**
 * https://leetcode-cn.com/problems/valid-palindrome/
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 *
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 */
public class lc125_validPalindrome {
    public boolean isPalindrome(String s) {
        String strs = s.toLowerCase();  //字符串全部转换为小写

        int start = 0, end = strs.length()-1;

        while(start < end){
            if(isCharorNum(strs.charAt(start)) && isCharorNum(strs.charAt(end))){
                if(strs.charAt(start) != strs.charAt(end))
                    return false;
                else{
                    start++;
                    end--;
                }
            }else if(!isCharorNum(strs.charAt(start)) && isCharorNum(strs.charAt(end)))
                start++;
            else if(isCharorNum(strs.charAt(start)) && !isCharorNum(strs.charAt(end)))
                end--;
            else {
                start++;
                end--;
            }
        }
        return true;
    }

    public boolean isCharorNum(char c){
        if( c >= 'a'&& c <= 'z' || c >='0' && c <= '9')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String strs = "A man, a plan, a canal: Panama";
        System.out.println(new lc125_validPalindrome().isPalindrome(strs));

    }
}
