package test;


import javax.management.relation.RelationException;
import java.util.Scanner;

/**
 * 【中国移动云计算】
 * 给定两个字符串s和t，判断他们是不是同构的
 * 同构是指将其中一个字符串中的相同字符用另一个字符替换，
 * 如果这个字符串可以变成另一个字符串，则称他们为同构的
 *
 * 输入
 * 两个字符串，中间用分号分隔
 * 输出
 * true或者false
 * 输入
 * ababa;ststs
 * 输出
 * True
 */
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String str1 = input.split(";")[0];
        String str2 = input.split(";")[1];
        int res = 0;

        if(str1.length() != str2.length()){
            System.out.println(111111111);
            System.out.println(false);
        }
        else{
            for(int i=0; i<str1.length(); i++){
                    res += (str1.charAt(i)) - (str2.charAt(i));

                System.out.println(res);

            }

            if (res == 0)
                System.out.println(true);
            else
                System.out.println(false);
        }


    }
}
