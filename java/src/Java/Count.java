package Java;

import java.util.HashMap;
import java.util.Map;

public class Count {
public static void main(String[] args) {
	
	
	String input = "rajinikanth";
    Map<Character, Integer> letterCount = countLetters(input);
    
    for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
        System.out.println("Letter: " + entry.getKey() + " - Count: " + entry.getValue());
    }
}

public static Map<Character, Integer> countLetters(String input) {
    Map<Character, Integer> letterCount = new HashMap<>();
    
    for (char letter : input.toCharArray()) {
        if (letterCount.containsKey(letter)) {
            letterCount.put(letter, letterCount.get(letter) + 1);
        } else {
            letterCount.put(letter, 1);
        }
    }
    
    return letterCount;
}
}
