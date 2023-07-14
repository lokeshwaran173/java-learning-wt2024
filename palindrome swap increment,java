public class StringManipulation {
    public static void main(String[] args) {
        String originalString = "INDIA";
        String incrementedString = incrementString(originalString);
        String swappedString = swapString(incrementedString);
        String incrementedSwappedString = incrementString(swappedString);
        String palindromeString = makePalindrome(incrementedSwappedString);
        String convertedString = convertFirstLastToUppercase(incrementedSwappedString);

        System.out.println("Original String: " + originalString);
        System.out.println("Incremented String: " + incrementedString);
        System.out.println("Swapped String: " + swappedString);
        System.out.println("Incremented Swapped String: " + incrementedSwappedString);
        System.out.println("Palindrome String: " + palindromeString);
        System.out.println("Converted String: " + convertedString);
    }

    private static String incrementString(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                chars[i]++;
            }
        }

        return new String(chars);
    }

    private static String swapString(String str) {
        char[] chars = str.toCharArray();

        char temp = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;

        return new String(chars);
    }

    private static String makePalindrome(String str) {
        StringBuilder palindromeBuilder = new StringBuilder(str);
        palindromeBuilder.append(new StringBuilder(str).reverse().substring(1));
        return palindromeBuilder.toString();
    }

    private static String convertFirstLastToUppercase(String str) {
        char[] chars = str.toCharArray();

        if (chars.length >= 1) {
            chars[0] = Character.toUpperCase(chars[0]);
        }

        if (chars.length >= 2) {
            chars[chars.length - 1] = Character.toUpperCase(chars[chars.length - 1]);
        }

        return new String(chars);
    }
}
