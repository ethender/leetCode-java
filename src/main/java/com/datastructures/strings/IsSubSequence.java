package com.datastructures.strings;

public class IsSubSequence {

    public static boolean isSubsequence(String s, String t) {
        int p1 = 0;
        for(char ch: t.toCharArray()){
            if(p1==s.length()){
                break;
            }
            if(ch==s.charAt(p1)){
                p1+=1;
            }
        }

        return s.length()==p1;
    }

    public static void main(String[] args){
        //String s="abc";
        //String t= "ahbgdc";
        String s="axc";
        String t= "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
