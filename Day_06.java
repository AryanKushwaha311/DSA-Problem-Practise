package Ques_Practise.Basics.Day_02;

public class Day_06 {
    // Consonents and vowels
    public static int[] count (String str){
        int vowels = 0;
        int consonents = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if(Character.isLetter(ch)){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }
                else{
                    consonents++;
                }
            }
        }
        return new int[]{vowels,consonents};
    }

    // REVERSE STRING
    public static String revString (String str){
        str = str.toLowerCase();
        String rev = " ";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }

    // STRING PALINDROME
    public static String strPalindrome(String str){
         String originalStr = str.toLowerCase();
         String revStr = "";

        for (int i = originalStr.length()-1; i>=0 ; i--) {
            char ch  = originalStr.charAt(i);
            revStr = ch + revStr;
        }

        if (originalStr.equals(revStr)){
            return "Palindrome";
        }
        return "Not a Palindrome";
    }

    // lowercase → uppercase
    public static String lowerToUpper(String str){
        str = str.toLowerCase();
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ch =(char)(ch - 32);
            newString = ch + newString ;
        }
        return newString;
    }

    //Character frequency in string
    public static int charFreq(String str,char target){
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (ch == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = charFreq("Naman",'n');
        System.out.println(result);
    }
}
