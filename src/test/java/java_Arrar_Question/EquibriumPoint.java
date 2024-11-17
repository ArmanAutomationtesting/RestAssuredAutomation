package java_Arrar_Question;

public class EquibriumPoint {
    public static int equilibriumPoint(int arr[]) {
        int prefixSum = 0;
        int totalSum = 0;
       for(int i = 0; i<arr.length; i++){
           totalSum+=arr[i];
       }
       for(int i = 0; i< arr.length; i++){
           if(prefixSum== totalSum - prefixSum - arr[i]){
               return i;
           }
           else prefixSum+=arr[i];
       }
       return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,5,2,1};
        System.out.println(equilibriumPoint(arr));
    }
}
