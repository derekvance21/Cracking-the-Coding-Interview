import java.util.Arrays;

// IsUnique: determine if string has all unique characters
public class IsUnique {

    // where str has characters [a-zA-Z], and 'A' == 'a'
    public static boolean isUniqueBitVector(String str) {
        int found = 0;
        if (str.length() > 26) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            int num = Character.toLowerCase(str.charAt(i)) - 'a';
            if ((found & (1 << num)) != 0) {
                return false;
            }
            found |= (1 << num);
        }
        return true;
    }

    // where str has characters of integer value [0, 128), and 'A' != 'a'
    public static boolean isUniqueArray(String str) {
        boolean[] found = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (found[c]) {
                return false;
            }
            found[c] = true;
        }
        return true;
    }

    // where str has characters of any unicode value
    public static boolean isUniqueSorted(String str) {
        char strArray[] = str.toCharArray();
        Arrays.sort(strArray);
        for (int i = 0; i < str.length() - 1; i++) {
            if (strArray[i] == strArray[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strs = {"voldemort", "washington", "picklejuice", "Snoqualmie", "Sits"};
        for (String str : strs) {
            System.out.println(str + ": " + isUniqueBitVector(str) + " " + isUniqueArray(str) + " " + isUniqueSorted(str));
        }
    }
}