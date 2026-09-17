package Vowelss;
import java.util.TreeSet;
import java.util.Comparator;

public class vowelcountsort {

    // Method to count vowels in a string
    static int countVowels(String s) {
        int count = 0;
        String lower = s.toLowerCase();
        for (char c : lower.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Highest vowels first -> descending; tie -> alphabetical (ascending)
        TreeSet<String> set = new TreeSet<>(
            (s1, s2) -> {
                int v1 = countVowels(s1);
                int v2 = countVowels(s2);
                if (v1 != v2) {
                    return v2 - v1; // descending by vowel count
                } else {
                    return s1.compareTo(s2); // ascending alphabetically
                }
            }
        );

        set.add("banana");   // 3 vowels
        set.add("apple");    // 2 vowels
        set.add("umbrella"); // 3 vowels
        set.add("sky");      // 0 vowels
        set.add("orange");   // 3 vowels

        System.out.println("Strings sorted by vowel count (highest first), alphabetical if tied:");
        for (String s : set) {
            System.out.println(s + " -> vowels: " + countVowels(s));
        }
    }
}