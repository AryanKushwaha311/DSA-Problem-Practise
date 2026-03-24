package Ques_Practise.Basics.Day_02;

public class Day_5 {
   // perfect number
   static String perfect_num(int n){
       int sum = 0;
       for (int i = 1; i <=n/2; i++) {
           if (n%i==0){
               sum=sum+i;
           }
       }
       if (sum==n){
           return "Perfect number";
       }
       return "Not a perfect number";
   }

    // Strong Number
    static int fact(int n){
        int fact = 1;
        int value = 1;
        while(n>0){
            fact = fact*value;
            value++;
            n--;
        }
        return fact;
    }
    static int digit(int n){
        int sum = 0;
        while(n>0){
            int digit=n%10;
            int fact = fact(digit);
            sum = sum+fact;
            n=n/10;
        }
        return sum;
    }
    static String check(int n){
        int value = digit(n);
        if (n==value){
            return "Strong number";
        }
        return "Not a Strong number";
    }

    // Count occurrence of digit
    static int count_occurence(int num, int target){
        int count = 0;
        while(num>0){
            int digit=num%10;
            if(target==digit){
               count++;
            }
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int ans = count_occurence(1244445644,4);
        System.out.println(ans);
    }
}
