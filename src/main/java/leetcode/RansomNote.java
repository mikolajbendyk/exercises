package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RansomNote {
    
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aba"));
        
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        List<Character> magazineCharacters = new ArrayList<>();

        for (int i = 0; i < magazine.length(); i++) {
            magazineCharacters.add(magazine.charAt(i));
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            Character currentCharacter = ransomNote.charAt(i);
            if (magazineCharacters.contains(currentCharacter)) {
                magazineCharacters.remove(currentCharacter);
            } else {
                return false;
            }
        }

        return true;
    }
}
