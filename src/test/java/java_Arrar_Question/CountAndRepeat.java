package java_Arrar_Question;

import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class CountAndRepeat {

    ArrayList<Integer> findTwoElement(int[] arr) {
        // code here
        int n=arr.length;
        if (n==1){
            return null;
        }
//        int[] count=new int[n+3];
        ArrayList<Integer> List = new ArrayList<>();
//        ArrayList<Integer> List2 = new ArrayList<>();

//        for(int i = 0; i<n; i++){
//            count[arr[i]]++;
//        }
//        for(int i = 1; i<n+1; i++){
//            if (count[i] == 2){
//                ans.add(i);
//            }
//        }
//
//        return ans;
        int count =0;
        for(int i =0; i <n; i++ ){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j] && !List.contains(arr[i])){
                    List.add(arr[i]);
                }
            }
        }
        return List;
    }
    public static void main(String[] args){
        int[] arr = {0,3,4,5,5,4,3,5,6,6};
        CountAndRepeat countAndRepeat = new CountAndRepeat();
        System.out.println(countAndRepeat.findTwoElement(arr));
    }
}

