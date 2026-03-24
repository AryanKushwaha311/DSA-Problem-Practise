package Ques_Practise.Basics.Day_02;

public class Day_2{
    // SUM OF DIGITS
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            n=n/10;
        }
        return sum;
    }

    // REVERSE NUMBER
    public static int reverseNum(int num){
        int rev = 0;
        while(num>0){
            int digit = num%10;
            rev = rev*10 + digit;
            num=num/10;
        }
        return rev;
    }

    // check Number Palindrome
    public  static String checkPalindrome(int num){
        int original = num;
        int rev = 0;

        while(num>0){
            int digit = num%10;
            rev = rev*10 + digit;
            num=num/10;
        }
        if (rev == original){
            return "Palindrome";
        }
        else{
            return "Not Palindrome";
        }
    }

    // CHECK STRING PALINDROME
    public static String checkStrPalindrom(String str){
        String original = str.toLowerCase();
        String rev = "";

        int length = original.length()-1;

        for (int i = length; i >=0 ; i--) {
            char ch = original.charAt(i);
            rev = rev + ch;
        }

        if (original.equals(rev)){
            return "Palindrome";
        }
        else{
            return "Not Palindrome";
        }
    }

    // largest digit in number

    public static int largestNum(int num){
        int largest = Integer.MIN_VALUE;

        while(num>0){
            int digit = num%10;
            if (digit > largest){
                largest = digit;
            }
            num = num/10;
        }
        return largest;
    }

    //count total digits
    public static int countDigits(int num){
        int count = 0;
        while(num>0){
            int digit = num % 10;
            count++;
            num=num/10;
        }
        return count;
    }

    //Armstrong Number
    public static int countDigit(int num){
        int count = 0;
        while(num>0){
            int digit = num%10;
            count ++;
            num=num/10;
        }
        return count;
    }
    public static int sum(int num){
        int count=countDigits(num);
        int sum = 0;
        while(num>0){
            int digit = num%10;
            int power = (int)(Math.pow(digit,count));
            sum = sum+ power;
            num = num/10;
        }
        return sum;
    }
    public static String checkArmStrong(int num){
        int newValue = sum(num);
        int originalValue = num;

        if(newValue == originalValue){
            return "Armstrong";
        }
        else{
            return "Not as Armstrong";
        }
    }

    //Product Of Digits
    public static int productOfDigits(int n){
        int prod = 1;
        while(n>0){
            int digit = n%10;
            prod = prod*digit;
            n=n/10;
        }
        return prod;
    }

    // DIGIT CHECKING
    public static String checkDigit(int num,int check){
        while(num>0){
            int digit = num%10;
            if(digit == check){
                return "Yes";
            }
            num/=10;
        }
        return "Not present";
    }

    public static void main(String[] args) {
        String result = checkDigit(153,5);
        System.out.println(result);
    }

}


