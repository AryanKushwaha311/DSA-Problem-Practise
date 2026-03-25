package Ques_Practise.Basics.Day_02;

public class Day_06 {
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
    public static void main(String[] args) {
        int[] result = count("HELLO");

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
