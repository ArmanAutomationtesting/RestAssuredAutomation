package java_Arrar_Question;

public class Missing_Number_in_array {
    Integer missingNumber(int[] a){
        int n = a.length + 1;
        int sumOfNumber = n* (n+1)/2;
        int sum = 0 ;
        for (int i = 0 ; i < a.length; i ++){
            sum+= a[i];
        }
        int misNumber = sumOfNumber-sum;
        return misNumber;
    }
    public static void main(String[] args){
        int[] a = {1,2,4,5,6};
        Missing_Number_in_array missingNumberInArray = new Missing_Number_in_array();
        System.out.println(missingNumberInArray.missingNumber(a));

    }
}
