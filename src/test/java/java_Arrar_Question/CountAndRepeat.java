package java_Arrar_Question;

import java.util.ArrayList;

public class CountAndRepeat {

    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int[] count=new int[n+3];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i = 0; i<n; i++){
            count[arr[i]]++;
        }
        for(int i = 1; i<n+1; i++){
            if (count[i] == 2){
                ans.add(i);
            }
            else if (count[i] == 0){
                ans.add(i);
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int[] arr = {0,3,4,5,6,6};
        CountAndRepeat countAndRepeat = new CountAndRepeat();
        System.out.println(countAndRepeat.findTwoElement(arr));
    }
}

