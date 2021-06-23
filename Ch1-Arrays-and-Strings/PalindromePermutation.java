import java.util.HashMap;

public class PalindromePermutation {
    
    public static boolean isPalindromePermutation(String str) {
        HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!charCounts.containsKey(c)) {
                charCounts.put(c, 0);
            }
            charCounts.put(c, charCounts.get(c) + 1);
        }
        boolean foundOdd = false;
        for (Integer count : charCounts.values()) {
            if (count % 2 == 1) {
                if (foundOdd) return false;
                else foundOdd = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strs = {"tactcoa", "carrace", "carace"};
        for (String str : strs) {
            System.out.println(str + ": " + isPalindromePermutation(str));
        }
    }
}
