import java.util.Arrays;

public class Day_1{
    
    // Question-1
    public static void printAll(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Question-2
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    //Question-3
    public static int maxElement(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // Question-4
    public static int minElement(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    // Question-5
    public static int countEven (int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] & 1) == 0){
                count ++;
            }
        }
        return count;
    }

    // Question-6
    public static int[] revArray(int[] arr){
        int[] rev =new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length-1-i];
        }
        return rev;
    }

    // Question-7
    public static String checkNum(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return  "Exist";
            }
        }
        return "Not Exist";
    }

    // Question-8
    public static int secondLargest(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    // Question-9
    public static void swap (int[] arr){
        int n = arr.length - 1;
        int temp = arr[0];
        arr[0] = arr[n];
        arr[n] = temp;
    }

    // Question-10
    public static int countOcc (int[] arr, int target){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                count++;
            }
        }
        return count;
    }

    // Question - 11
    public static String checkSoretedArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                return "Not Sorted";
            }
        }
        return "Sorted";
    }

    // Question - 12
    public static void allZeroAtEnd(int[] arr){
        int[] newArr = new int[arr.length];
        int j = 0;

        for (int i = 0; i<arr.length; i++){
            if (arr[i]!=0){
                newArr[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i<arr.length; i++){
            if (arr[i] == 0){
                newArr[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int result = secondLargest(new int[]{10, 5, 8});
        System.out.println(result);
    }
}
