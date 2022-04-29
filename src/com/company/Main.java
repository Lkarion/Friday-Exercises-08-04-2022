package com.company;

public class Main {

    public static void main(String[] args) {
	// дана строка , состоящая из разного количества повторяющихся символов типа "abbbcc".
        // Найти длину максимальной подстроки повторяющихся символов

        String s = "abbbcc";
        System.out.println(getSubstringWithMaxLength("abbbcccccccccc"));

    }

    public static int getSubstringWithMaxLength(String s){
        if (s.isEmpty()) return 0;
        int len = 1, maxLen = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i)) {
                len++;
            }else{
                len=1;
            }
            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
    }
}
