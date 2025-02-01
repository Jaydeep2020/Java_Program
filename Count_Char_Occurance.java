class Main {
    public static void main(String[] args) {
        String str = "aaabbbcccaaa";
        StringBuilder s = countOccurance(str);
        System.out.print(s);
    }

    public static StringBuilder countOccurance(String s) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++; // Increment count if characters match
            } else {
                sb.append(s.charAt(i)).append(count); // Append character and count
                count = 1; // Reset count to 1 for next character
            }
        }

        // Append the last character and its count
        sb.append(s.charAt(s.length() - 1)).append(count);

        return sb;
    }
}
