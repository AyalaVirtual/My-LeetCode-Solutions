public class RansomNote {
    /*
        Ransom Note
        Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
        Each letter in magazine can only be used once in ransomNote.

        Example 1:
        Input: ransomNote = "a", magazine = "b"
        Output: false

        Example 2:
        Input: ransomNote = "aa", magazine = "ab"
        Output: false

        Example 3:
        Input: ransomNote = "aa", magazine = "aab"
        Output: true
    */

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap();

        for (int i = 0; i < magazine.length(); i++) {
            char word = magazine.charAt(i);
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char word = ransomNote.charAt(i);
            map.put(word, map.getOrDefault(word, 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 0) {
                return false;
            }
        }

        return true;
    }

    /*
        Explanation:
        This approach initializes a HashMap to track the count of each character in the magazine string. It sets up a for loop and iterates through each character in the magazine string, incrementing the value (or count) of each character in the HashMap using the .getOrDefault() method to handle cases where the character is not present in the HashMap.

        From there, it uses another for loop to iterate through each character in the ransomNote string, decrementing the count of each character in the HashMap to reflect its usage in the ransom note.

        Finally, it uses a third for loop and the Map.Entry interface to iterate through the entries of the HashMap. Using a conditional, it checks if the value (or count) of each entry (or character) is less than zero, indicating a shortage of characters in the magazine to construct the ransom note, in which case, it returns false. Otherwise, if it breaks out of the loop, it will return true because it means that all characters in the ransom note can be accounted for using characters from the magazine, meaning that the ransom note can be constructed.
     */
}
