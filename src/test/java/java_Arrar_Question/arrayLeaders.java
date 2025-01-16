package java_Arrar_Question;

import java.util.*;

public class arrayLeaders {
    public ArrayList<Integer> arrLeadernumber(int[] arr){
        ArrayList<Integer> arrleader = new ArrayList<>();
        int n = arr.length;
        if(n==1){
            arrleader.add(arr[n]);
        }
        int top= arr[n-1];
        arrleader.add(top);
        for(int i = n-2; i>=0; i--){
            if(arr[i] >= top){
                arrleader.add(arr[i]);
                top = arr[i];
            }
        }
        return arrleader;
    }


    public static int firstRepeated(int[] arr) {
        for(int i = 0; i<arr.length-1; i++){
            for(int j=1; j<arr.length-1; j++){
                if (arr[i]==arr[j] && i!=j){
                    return i;
                }
            }
        }
        return -1;
        // Your code here
    }
    public static void main(String[] args){
        int[] arr = {1,5,3,4,3,5,6};
        arrayLeaders arrayLeaders = new arrayLeaders();
//        System.out.println(arrayLeaders.arrLeadernumber(arr));
        System.out.println(arrayLeaders.arrLeadernumber(arr));

    }
}
