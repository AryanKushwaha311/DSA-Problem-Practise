package Ques_Practise.Basics.Day_02;

public class Day_5 {

    // FIBONACCI SERIES
     public static int fibo(int n){
         int p = 0;
         int i = 1;
         int count = 2;

         while(count <= n){
             int temp = i;
             i = i+p;
             p = temp;
             count++;
         }
         return i;
     }

    // COUNT OCCURRENCE
    public static String countOccur(int n , int target){
         int count = 0;
         while(n>0){
             int digit = n%10;
             if(digit == target){
                 count++;
             }
             n=n/10;
         }
         if(count == 0){
             return "No Occurrence";
         }
         else{
             return "Total Number of Occurrence = "+ count;
         }
    }

    // STRONG NUMBER
    public static int fact (int n){
         int fact = 1;
         while (n>0){
             fact = fact * n;
             n--;
         }
         return fact;
    }
    public static int digit(int n){
         int sum = 0;
         while (n>0){
             int digit = n%10;
             int fact = fact(digit);
             sum = sum + fact;
             n=n/10;
         }
         return sum;
    }
    public static String checkStrongNum(int n){
         int OriginalValue = n;
         int newValue = digit(n);

         if(OriginalValue == newValue){
             return "Strong Number";
         }
         return "Not a Strong Number";
    }

    // PERFECT NUMBER
    public static int sum(int num){
         int sum = 0;
        for (int i = 1; i <= num/2 ; i++) {
            if (num%i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static String checkPerfectNum(int num){
         int OriginalValue = num;
         int newValue = sum(num);

         if (OriginalValue == newValue){
             return "Perfect Number";
         }
         return "Not a Perfect Number";
    }
    public static void main(String[] args) {
       String result = checkPerfectNum(28);
        System.out.println(result);
    }
}
