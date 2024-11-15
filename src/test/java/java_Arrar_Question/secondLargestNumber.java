package java_Arrar_Question;

public class secondLargestNumber {
    int sec_LargestNumber(int[] arr){
        int Large = arr[0];
        int sec_Large = -1;
        for(int i = 0; i < arr.length; i++){
            if (arr[i]>Large){
                sec_Large = Large;
                Large = arr[i];
            } else if (arr[i] < Large && arr[i]> sec_Large) {
                sec_Large = arr[i];
            }
        }
        return sec_Large;
    }
    public static void main(String[] args){
        int arr[] = {34,56,77,655,54,56,78,44};
        secondLargestNumber secondLargestNumber = new secondLargestNumber();
        System.out.println(secondLargestNumber.sec_LargestNumber(arr));
    }
}
