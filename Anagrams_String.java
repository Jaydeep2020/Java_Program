import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String s1 = "jayd";
        String s2 = "dyja";
        boolean result = areAnagrams(s1, s2);
        System.out.println(result);
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; // Different lengths, not anagrams
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
