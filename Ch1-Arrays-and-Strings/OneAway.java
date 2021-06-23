import java.lang.Math;

public class OneAway {

    public static boolean isOneAway(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.length() < str2.length()) {
                    // str1 insertion
                    return str1.substring(i).equals(str2.substring(i + 1));
                } else if (str1.length() > str2.length()) {
                    // str1 deletion
                    return str1.substring(i + 1).equals(str2.substring(i));
                }
                else {
                    // replacement
                    return str1.substring(i + 1).equals(str2.substring(i + 1));
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String[][] strPairs = {{"pale", "ple"}, {"pales", "pale"}, {"pale", "bale"}, {"pale", "bake"}, {"ppale", "pale"}};
        for (String[] strPair : strPairs) {
            String str1 = strPair[0];
            String str2 = strPair[1];
            System.out.println(str1 + ", " + str2 + ": " + isOneAway(str1, str2));
        }
    }
}
