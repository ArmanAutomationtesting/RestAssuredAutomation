package java_Arrar_Question;

public class Missing_Number_in_array {
//    Integer missingNumber(int[] a){
//        int n = a.length + 1;
//        int sumOfNumber = n* (n+1)/2;
//        int sum = 0 ;
//        for (int i = 0 ; i < a.length; i ++){
//            sum+= a[i];
//        }
//        int misNumber = sumOfNumber-sum;
//        return misNumber;
//    }
     int missingNumber(int[] arr){
        int[] arr1 = new int[arr.length+1];
        int n= arr.length+1;
        int sum = n*(n+1)/2;
        int sum1 = 0 ;
        for(int i = 0 ; i < arr.length; i++){
            sum+=arr[i];

        }
         int c = sum-sum1;
         return c;
     }


    public static void main(String[] args){
        int[] arr = {1,2,4,5,6};
        Missing_Number_in_array missingNumberInArray = new Missing_Number_in_array();
        System.out.println(missingNumberInArray.missingNumber(arr));

    }
}
