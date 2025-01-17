package java_Arrar_Question;

public class peakValueIndex {

     public  int value(int[] arr) {
         int total = 0;
         for (int i = 0; i < arr.length; i++) {
             total += arr[i];
         }
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == total - arr[i]) {
                 return i;
             }
         }
         return -1;

     }
    public  static  void main(String[] args){
         int[] arr = {1,2,3,6};
         peakValueIndex peakValueIndex = new peakValueIndex();
        System.out.println(peakValueIndex.value(arr));
    }


}
