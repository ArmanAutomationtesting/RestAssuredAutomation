package java_Arrar_Question;

public class Equilibirium_point2 {
    public int equilibrium(int[] arr){
        int prefix = 0;
        int sum = 0 ;

        for(int i = 0; i < arr.length; i ++){
            sum+=arr[i];
        }
        for(int i = 0; i < arr.length ; i++){
            if(prefix == sum - prefix - arr[i]){
                return i;
            }
            else prefix +=arr[i];
        }
        return -1;
    }
    public static void main(String[] args){
        Equilibirium_point2 equilibiriumPoint2 = new Equilibirium_point2();
        int[] Array = {1,2,5,3};
         int number = equilibiriumPoint2.equilibrium(Array);
        System.out.println(number);
    }
}

