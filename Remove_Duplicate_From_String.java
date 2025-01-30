import java.util.HashMap;

class Main {
    public static void main(String[] args){
        String inputString = "aaabbbaaacdeee";
        removeDuplicates(inputString);
    }

    public static void removeDuplicates(String inputString){
        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] charArray = inputString.toCharArray();
        for(char ch : charArray){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);
            }else{
                charMap.put(ch, 1);
            }
        }
        System.out.println(charMap);
        for(char ch : charMap.keySet()){
            if(charMap.get(ch) >= 2){
                System.out.print(ch + " ");
            }
        }
    }
}
