
package Ques_Practise.Basics.Day_02;

public class Day_4 {
    public static int fact(int n){
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static String primeNum(int n){
        for (int i = 2; i <=n/2; i++) {
            if (n%i==0){
                return "not Prime";
            }
        }
        return "prime";
    }

    public static void allPrime(int n){
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i/2 ; j++) {
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        allPrime(11);
    }
}

