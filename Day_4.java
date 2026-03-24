
package Ques_Practise.Basics.Day_02;



public class Day_4 {
    static String prime_num(int n){
        for (int i = 2; i <=n/2; i++) {
            if(n%i==0){
                return "not prime";
            }
        }
        return "prime";
    }
    static int factorial(int n){
        if (n==0){
            return 0;
        }
        int i =1;
        int p = 0;
        int count=2;

        while(count<=n){
            int temp=i;
            i=i+p;
            p=temp;
            count++;
        }
        return i;
    }

    static void printPrimes(int n){
        for (int i = 2; i <=n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printPrimes(10);
    }
}
