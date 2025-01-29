import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String s = "jaydeep";
        char[] ch = reverseVowel(s);
        System.out.println(Arrays.toString(ch)); // Expected output: ['j', 'e', 'y', 'd', 'a', 'e', 'p']
    }

    public static char[] reverseVowel(String str) {
        int i = 0;
        int j = str.length() - 1;
        char[] ch = str.toCharArray();

        while (i < j) {
            if (!isVowel(ch[i])) {
                i++;
            } else if (!isVowel(ch[j])) {
                j--;
            } else {
                // Swap vowels
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                // Move both pointers
                i++;
                j--;
            }
        }
        return ch;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Handle uppercase vowels
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
