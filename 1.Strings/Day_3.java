package Ques_Practise.Basics.Day_02;

import java.util.Arrays;

public class Day_3 {
    // PRINT 1->N
    public static void print1(int n){
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }

    // PRINT N->1
    public static void print2(int n){
        int i = n;
        while(i>0){
            System.out.println(i);
            i--;
        }
    }

    // PRINT EVEN TILL N
    public static void print3(int n){
        for (int i = 1; i <=n; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }

    // PRINT ODD TILL N
    public static void print4(int n){
        for (int i = 1; i <=n; i++) {
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }

    // Power a^b without Math.pow
    public static int power(int n,int pow){
        int total = 1;
        for (int i = 1; i <= pow; i++) {
            total=total*n;
        }
        return total;
    }

    public static void main(String[] args) {
        int result = power(3,3);
        System.out.println(result);
    }


}
