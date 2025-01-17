package java_Arrar_Question;

import java.util.HashMap;

public class Freq_of_words {
 public static HashMap<String, Integer> frequencyWord(String str){
     // "I Love My Country and I love my India"
     HashMap<String, Integer> frequencyMap = new HashMap<>();
     String[] words = str.split("\\s+");
     for(String word : words){
         frequencyMap.put(word, frequencyMap.getOrDefault(word,0)+1);
     }
     return frequencyMap;
 }



 public static void main(String[] args){
     String input = "I Love My Country and I love my India";

     HashMap<String,Integer> Wordsfrequency = frequencyWord(input);
     for (String word : Wordsfrequency.keySet()){
         System.out.println(word +" = "+ Wordsfrequency.get(word));
     }
 }
}

