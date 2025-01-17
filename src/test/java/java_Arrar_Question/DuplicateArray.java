package java_Arrar_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateArray {

    public List<Integer> duplicate(int[] arr){
        ArrayList<Integer> List = new ArrayList<>();
       Arrays.sort(arr);
        for (int i = 0 ; i < arr.length-1; i++){
            if (arr[i] == arr[i+1]){
                List.add(arr[i]);
            }
        }
        return List;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5,6,7,5,6};
        DuplicateArray duplicateArray = new DuplicateArray();
        System.out.println(duplicateArray.duplicate(arr));
    }
}
