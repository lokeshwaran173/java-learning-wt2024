public class SwapString {
    public static void main(String[] args) {
        String str = "joejb";
        String swappedString = swapString(str);
        System.out.println("Original String: " + str);
        System.out.println("Swapped String: " + swappedString);
    }

    private static String swapString(String str) {
        if (str.length() != 6) {
            throw new IllegalArgumentException("String length must be 6.");
        }

        char[] chars = str.toCharArray();

        char temp = chars[0];
        chars[0] = chars[2];
        chars[2] = temp;

        return new String(chars);
    }
}
