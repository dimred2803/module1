package com.mod1.level2;

public class Task21 {

    public static boolean func21 (String s) {
        if (s == "") return true;
        if ((s.contains("(") && s.contains(")")) && (s.indexOf('(')<s.indexOf(')'))) {
            if ((s.contains("{") && s.contains("}")) && (s.indexOf('{')<s.indexOf('}')))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "{(iii)}";
        String s2 = "{(((ii}";
        String s3 = "";
        System.out.println(func21(s1));
        System.out.println(func21(s2));
        System.out.println(func21(s3));
    }
}
