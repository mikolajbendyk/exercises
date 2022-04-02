package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RomanToInteger {
    
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("LVIII"));
    }

    private static int romanToInt(String input) {
        List<Character> subtrahends = Arrays.asList('I', 'X', 'C');

        Map<Character, Integer> numbers = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int resultInt = numbers.get(input.charAt(input.length()-1));

        for (int i=0; i < input.length()-1; i++) {
            char currentCharacter = input.charAt(i);
            if (subtrahends.contains(currentCharacter) && isSubtrahend(i, currentCharacter, input)) {
                resultInt -= numbers.get(currentCharacter);
            } else {
                resultInt += numbers.get(currentCharacter);
            }
        }
    
        return resultInt;
    }

    private static boolean isSubtrahend(int index, Character currentCharacter, String sourceString) {
        Map<Character, Character[]> subtrahends = Map.of(
            'I', new Character[]{'V', 'X'},
            'X', new Character[]{'L', 'C'},
            'C', new Character[]{'D', 'M'}
        );

        for (Character minuend : subtrahends.get(currentCharacter)) {
            if (minuend == sourceString.charAt(index + 1)) return true;
        }
        
        return false;
    }

    private static int romanToInt2(String input) {
        List<Character> subtrahends = Arrays.asList('I', 'X', 'C');

        Map<Character, Integer> numbers = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        char previousChar = ' ';
        int resultInt = 0;

        for (int i=input.length()-1; i >= 0; i--) {
            
        }
    
        return resultInt;
    }

}