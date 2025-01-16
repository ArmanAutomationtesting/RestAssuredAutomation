package java_Arrar_Question;

public class Max_SUM_ofanArray {
    int maxSubarraySum(int[] arr) {

        int sum=0;
        int maxsum=arr[0];

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if (sum > maxsum){
                maxsum = sum;
            }

            
        }
        return maxsum;
    }
     public static void main(String[] args){
        int[] arr = {1,8,7,-17,5,7,8,8};
        Max_SUM_ofanArray maxSumOfanArraya = new Max_SUM_ofanArray();
         System.out.println(maxSumOfanArraya.maxSubarraySum(arr));

     }
}


