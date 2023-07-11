public class TotalWordLength {
    public static void main(String[] args) {
        String input = "India is my country";
        String[] words = input.split(" ");

        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }

        System.out.println("Total Length: " + totalLength);
    }
}
