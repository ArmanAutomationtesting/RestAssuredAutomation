package java_Arrar_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class duplicatePairfound {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i:arr){
            if(!set.add(i)){// ! false if set has duplicate
                list.add(i);
            }
        }return list;
    }
    public static void main(String[] args){
        int arr[] = {2,5,6,7,8,2,5};
        duplicatePairfound duplicatePairfound = new duplicatePairfound();
        System.out.println(duplicatePairfound.findDuplicates(arr));
    }
}
