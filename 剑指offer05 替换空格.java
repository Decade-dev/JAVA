/*
请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

示例 1：
输入：s = "We are happy."
输出："We%20are%20happy."

限制：
0 <= s 的长度 <= 10000

*/
class Solution {
    public String replaceSpace(String s) {
        int length = s.length();
        int flag = 0;
        int j = 0;
        for(char c : s.toCharArray()){
            if(c == ' '){
                flag++;
            }
        }
        char[] ch = new char[length + 2 * flag];
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            if(c != ' '){
                ch[j++] = c;
            }else{
                ch[j++] = '%';
                ch[j++] = '2';
                ch[j++] = '0';
            }
        }
        return new String(ch,0,j);
    }
}
