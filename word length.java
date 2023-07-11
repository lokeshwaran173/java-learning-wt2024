public class WordLength {
    public static void main(String[] args) {
        String input = "java is a programming language";
        String[] words = input.split(" ");

        for (String word : words) {
            int length = word.length();
            System.out.println(word + " - Length: " + length);
        }
    }
}
