package com.mod1.level1;

public class Task1 {
    public static int func1 (int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res = arr[i];
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 4, 5, 1, 1, 3};
        System.out.println(func1(myArray));
    }
}
