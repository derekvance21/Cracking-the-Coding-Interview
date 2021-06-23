import java.lang.StringBuilder;

public class URLify {

    // where str1 and str2 are composed of ASCII characters
    public static String urlify(String str) {
        StringBuilder URLstr = new StringBuilder();
        URLstr.append(str);
        for (int i = 0; i < URLstr.length(); i++) {
            if (URLstr.charAt(i) == ' ') {
                URLstr.replace(i, i+1, "%20");
            }
        }
        return URLstr.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"Mrs Nancy Thomas", "  username = waterdog ! "};
        for (String str : strs) {
            System.out.println(str + ": " + urlify(str));
        }
    }
}
