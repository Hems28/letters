package com.studyopedia;

import java.util.HashSet;

public class dist {
    public static void main(String[] args){
        String a="abcdef";
        HashSet<String> c=new HashSet<String>();
        for(int i=0;i<a.length();i++){
            String b="";
            b+=a.charAt(i);
            c.add(b);
            for(int j=i+1;j<a.length();j++){
                b+=a.charAt(j);
                c.add(b);
            }
        }
        System.out.println(c);
    }
}
