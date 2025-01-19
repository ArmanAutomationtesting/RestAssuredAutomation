package java_Arrar_Question;

import java.util.HashMap;

public class Roman_to_Integer {
    public int romantoIntegerchange(String s) {
        HashMap<Character, Integer> Map = new HashMap<>();
//      "IXVM"
        Map.put('I', 1);
        Map.put('X', 10);
        Map.put('V', 5);
        Map.put('L', 50);
        Map.put('C', 100);
        Map.put('D', 500);
        Map.put('M', 1000);
        int number123 = 0;
        int result = 0;

        for (int i = 0; i <= s.length() - 1; i++) {
            number123 = Map.get(s.charAt(i));
            if (i < s.length() - 1 && Map.get(s.charAt(i)) < Map.get(s.charAt(i + 1))) {
                result -= number123;
            } else {
                result += number123;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String str = "IXM";
        Roman_to_Integer romanToInteger = new Roman_to_Integer();
        System.out.println(romanToInteger.romantoIntegerchange(str));

    }
}
