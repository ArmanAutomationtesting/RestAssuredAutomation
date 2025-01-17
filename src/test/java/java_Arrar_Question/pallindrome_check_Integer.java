package java_Arrar_Question;

public class pallindrome_check_Integer {
    public static boolean isPalindrome(int xx) {
       int X = xx;
        if (X == 0) return true;
        if (X < 0) return false;
        int y = 0;
        while (X > 0) {
            int rem = X % 10;
            X = X / 10;
            y = y * 10 + rem;
        }
        return xx == y;

    }

    public static void main(String[] args) {
        int x = 121;


        if (isPalindrome(x)) {
            System.out.println("It is a pallindrome");
        } else {
            System.out.println("It is not a pallindrome");
        }
    }

}
