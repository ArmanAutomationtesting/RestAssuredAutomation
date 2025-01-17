package java_Arrar_Question;

import java.util.HashMap;

public class frequenciesofString {
    public static HashMap<Character, Integer> calculateFrequency(String str) {
        // {Hello Brother}
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] ch = str.toCharArray();
        for (char ch1 : ch) {
            if (ch1 != ' ') {
                hashMap.put(ch1, hashMap.getOrDefault(ch1, 0) + 1);
            }
        }
        return hashMap;
    }

    public static void main(String[] args) {
        String str = "Hello Brother";
        HashMap<Character,Integer> hashMap1 = calculateFrequency(str);
        for(Character ch1 : hashMap1.keySet()){
            System.out.println(ch1 + " = " +  hashMap1.get(ch1));
        }
    }
}

