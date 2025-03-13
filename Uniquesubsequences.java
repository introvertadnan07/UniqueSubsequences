import java.util.*;

public class UniqueSubsequences {

    public static void sequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

        // Include the current character
        sequences(str, idx + 1, newString + currChar, set);

        // Exclude the current character
        sequences(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {  
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        sequences(str, 0, "", set);
    }
}
