package java_Arrar_Question;

import java.util.Arrays;


public class Reverse_Array {
    public static void reverseWithTempArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0 ; i < arr.length; i++) {
            reversed[i] = arr[arr.length-1-i];
        }
        System.out.println("Reversed Array = " + Arrays.toString(reversed));
    }



    public static void main(String[] args){
            int[] arr = {1,2,3,4,5,6};
            reverseWithTempArray(arr);

    }
}

