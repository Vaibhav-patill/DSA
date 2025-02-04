public class RemoveDuplicates {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        // basecase
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // work
        char currentChar = Character.toLowerCase(str.charAt(idx));
        if (map[currentChar - 'a']) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(str.charAt(idx)), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnaCollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}