import java.util.HashMap;

public class IsPermutation {

    // where str1 and str2 are composed of ASCII characters
    public static boolean isPermutation(String str1, String str2) {
        HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
        String[] strs = {str1, str2};
        for (int s = 0; s < 2; s++) {
            String str = strs[s];
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!charCounts.containsKey(c)) {
                    charCounts.put(c, 0);
                }
                charCounts.put(c, charCounts.get(c) + (s == 0 ? -1 : 1));
            }
        }
        for (Integer count : charCounts.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("dog, god: " + isPermutation("dog", "god"));
        System.out.println("Apples, Selppa: " + isPermutation("Apples", "Selppa"));
        System.out.println("CRICKET, RICKECT: " + isPermutation("CRICKET", "RICKECT"));
    }
}
