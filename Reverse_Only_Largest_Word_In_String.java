public class ReverseMaxLengthWord {
    public static void main(String[] args) {
        String str = "I love programming in Java";
        System.out.println("Original: " + str);
        System.out.println("Modified: " + reverseMaxLengthWord(str));
    }

    public static String reverseMaxLengthWord(String str) {
        String[] words = str.split(" ");
        int maxLength = 0, index = -1;

        // Find the longest word
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                index = i;
            }
        }

        // Reverse the longest word
        if (index != -1) {
            words[index] = new StringBuilder(words[index]).reverse().toString();
        }

        // Join the words back into a string
        return String.join(" ", words);
    }
}
