public class maxNumberinanArray {

    public static int maxNumberA(int[] arr) {
        int max = arr[0];
        for (int i = 1; i <= arr.length - 2; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxdiffinanArray(int[] arr) {
        int diff ;
        int max = 0;
        for(int i = 0; i < arr.length-1; i++){
            diff = (arr[i]-arr[i+1]);
            if(diff > max){
                max = diff;
            }
        }
        return max;


    }

}


public void main() {

    int[] input = {2,5,7,5,4,3,15,6};
    int differece = maxNumberinanArray.maxdiffinanArray(input);
    System.out.println(differece);
}

