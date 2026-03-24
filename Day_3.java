package Ques_Practise.Basics.Day_02;

import java.util.Arrays;

public class Day_3 {
    static int[] nat_num(int n){
        int[] arr = new int[n];
        int i = 1;
        while(i<=n){
            arr[i-1]=i;
            i++;
        }
        return arr;
    }

    static int[] nat_num2(int n){
        int[] arr = new int[n];
        for (int i = n; i > 0; i--) {
            arr[n-i]=i;
        }
        return arr;
    }
    static int[] even_num(int n){
        int i = 2;
        int j = 0;
        int[] arr = new int[n];

        while (j < n) {
            arr[j] = i;
            j++;
            i += 2;
        }
        return arr;
    }
    static int[] odd_num(int n){
        int i = 1;
        int j = 0;
        int[] arr = new int[n];

        while (j < n) {
            arr[j] = i;
            j++;
            i += 2;
        }
        return arr;
    }
    static int power(int a,int b){
        int value = 1;
        for(int i=1;i<=b;i++){
            value=a*value;
        }
        return value;
    }
    public static void main(String[] args) {


    }
}
