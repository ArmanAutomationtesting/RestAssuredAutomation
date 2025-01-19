package java_Arrar_Question;

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {

    public static int[] sumofTwonumber(int[] num, int x){
         int n = num.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < n; i++){
            map.put(num[i],i );
            if (map.containsKey(x-num[i])){
             result[1] = map.get(num[i]);
             result[0] = map.get(x-num[i]);
            }

        }
       return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8};
        int x = 8;
       int[] result =  sumofTwonumber(arr,x);
        System.out.println(Arrays.toString(result));
    }
}
