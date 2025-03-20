package String;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        int len = pattern.length();

        String words[] = s.split(" ");
        if(pattern.length()!= words.length) {
            return false;
        }
        Map<Character, String> map= new HashMap<>();

        for(int i=0;i< pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)) return false;

            }else{
                if(map.containsValue(word))return false;
                map.put(ch, word);
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String pattern = "abba", s = "dog cat cat dog";
        boolean result = wordPattern(pattern, s);
        System.out.println(result);

    }
}

