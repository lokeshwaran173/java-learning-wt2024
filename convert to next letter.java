public class PromoteLetters {
    public static void main(String[] args) {
        String str = "india";
        String promotedString = promoteLetters(str);
        System.out.println("Original String: " + str);
        System.out.println("Promoted String: " + promotedString);
    }

    private static String promoteLetters(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                chars[i] = promoteLetter(chars[i]);
            }
        }

        return new String(chars);
    }

    private static char promoteLetter(char c) {
        if (c >= 'a' && c < 'z') {
            return (char) (c + 1);
        } else if (c == 'z') {
            return 'a';
        } else if (c >= 'A' && c < 'Z') {
            return (char) (c + 1);
        } else if (c == 'Z') {
            return 'A';
        } else {
            return c; // Not a letter, return as is
        }
    }
}


