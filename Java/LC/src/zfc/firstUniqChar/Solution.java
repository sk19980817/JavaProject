package zfc.firstUniqChar;

public class Solution {
    public static void main(String[] args) {
        String s="leetcode";
        int num=firstUniqChar(s);
        System.out.println(num);
    }

    public static int firstUniqChar(String s) {
        int[] num=new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i)-97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if((num[s.charAt(i)-97])==1)
                return i;

        }
        return -1;
    }
}
