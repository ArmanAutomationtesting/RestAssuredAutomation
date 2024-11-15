package java_Arrar_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayLeaders {
    public ArrayList<Integer> arrLeadernumber(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int Leader = -1;
        for(int i = arr.length -1 ; i >= 0; i--){
//            if(arr[i] >= Leader){
//                list.add(arr[i]);
//                Leader = arr[i];
//            }
//        }
            if(list.contains(arr[i]) && Leader == arr[i]){
                list.add(arr[i]);
            } else if (Leader < arr[i]) {
                list.add(arr[i]);
                Leader = arr[i];
            }
            }
            list.sort(Collections.reverseOrder());
        return list;
    }
    public static void main(String[] args){
        int[] arr = {7,5,43,7,8,9,6,4};
        arrayLeaders arrayLeaders = new arrayLeaders();
        System.out.println(arrayLeaders.arrLeadernumber(arr));

    }
}
