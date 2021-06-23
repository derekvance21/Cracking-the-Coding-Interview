import java.lang.StringBuilder;

public class StringCompression {
    
    public static String compressString(String str) {
        if (str.isEmpty()) return "";
        StringBuilder compressed = new StringBuilder();
        char curr = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != curr) {
                compressed.append(curr + (count > 1 ? Integer.toString(count) : ""));
                curr = c;
                count = 1;
            } else {
                count++;
            }
        }
        compressed.append(curr + (count > 1 ? Integer.toString(count) : ""));
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String[] strs = {"aabcccccaaa", "applessandorraanngess", "pppppppprnbqkbnr"};
        for (String str : strs) {
            System.out.println(str + " " + compressString(str));
        }
    }
}
