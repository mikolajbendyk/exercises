package leetcode;

import java.util.List;

public class RansomNote {
    
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aba"));
        
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        List<Character> magazineCharacters = (List<Character>) magazine.chars().mapToObj(c -> (char) c).toList();
        
        for (int i = 0; i < ransomNote.length(); i++) {
            Character currentCharacter = ransomNote.charAt(i);
            if (magazineCharacters.contains(currentCharacter)) {
                magazineCharacters.remove(Character.valueOf(currentCharacter));
            } else {
                return false;
            }
        }

        return true;
    }
}
