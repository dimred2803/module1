package com.mod1.level1;

public class Task2 {
    public static String func2 (int x1, int x2, int y1, int y2) {
        String s = "";
        if ((x1-x2 == 1 || x1-x2 == -1) && (y1-y2==-2 || y1-y2==2)) s = "Yes!";
        else if ((x1-x2 == 2 || x1-x2 == -2) && (y1-y2==-1 || y1-y2==1)) s = "Yes!";
        else s = "No!";
        return s;
    }

    public static void main(String[] args) {
        int x1 = 2, y1 = 4;
        int x2 = 3, y2 = 2;

        System.out.println(func2 (x1, x2, y1, y2));
    }
}
