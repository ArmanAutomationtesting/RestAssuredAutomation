package java_Arrar_Question;

public class Pallindrom {
    Boolean isPallindrome(String p) {
        StringBuilder stringBuilder = new StringBuilder(p);
        stringBuilder.reverse();
        if (p.equals(stringBuilder.toString()) ){
            return true;
        }
        return false;

    }
    public static  void main(String[] args){
        Pallindrom pallindrom = new Pallindrom();
        System.out.println("It is a pallindrom number" + " --" +  pallindrom.isPallindrome("DALAD"));
    }
}

