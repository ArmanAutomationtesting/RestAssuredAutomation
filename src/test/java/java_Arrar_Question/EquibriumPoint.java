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
    static int missingNumber(int arr[]) {
        int sum = 0;
        int n = arr.length+1;
        int sum1 =  n*(n+1)/2;
        for(int i=0; i<n-1; i++){
            sum+=arr[i];
        }
        int missingNumber1 = sum1-sum;
        return missingNumber1;
    }
    public int getSecondLargest(int[] arr) {
        int large = 0;
        int sec_large = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > large){
                sec_large=large;
                large=arr[i];
            }else if(arr[i] < large && arr[i] > sec_large){
                sec_large = arr[i];
            }

        }
        return sec_large;
        // Code Here
    }
    public static void main(String[] args){
        int[] arr = {10,5,10};
        EquibriumPoint equibriumPoint = new EquibriumPoint();
        System.out.println(equibriumPoint.getSecondLargest(arr));
//        System.out.println(missingNumber(arr));
    }
}
