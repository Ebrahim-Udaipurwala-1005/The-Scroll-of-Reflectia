package de.tum.ise;

public class Main {
    public static void main(String[] args) {
        /// TODO: Test your code here. However, this is not part of the grade.
// 1. **Basic Palindromes**
        System.out.println(Helper.findLongestChant("a"));          // Expected: "a" (Single character is always a palindrome)
        System.out.println(Helper.findLongestChant("aa"));         // Expected: "aa" (Even length, same characters)
        System.out.println(Helper.findLongestChant("aba"));        // Expected: "aba" (Odd-length palindrome)
        System.out.println(Helper.findLongestChant("abba"));       // Expected: "abba" (Even-length palindrome)

// 2. **Non-palindromic Strings**
        System.out.println(Helper.findLongestChant("ab"));         // Expected: "a" (No palindrome longer than 1 character)
        System.out.println(Helper.findLongestChant("abc"));        // Expected: "a" (No palindromes longer than single character)
        System.out.println(Helper.findLongestChant("abcdefg"));    // Expected: "a" (Single-character palindromes only)

// 3. **Palindromes at the Start, Middle, and End**
        System.out.println(Helper.findLongestChant("racecar"));    // Expected: "racecar" (Full string is a palindrome)
        System.out.println(Helper.findLongestChant("abracecarab")); // Expected: "racecar" (Palindrome in the middle)
        System.out.println(Helper.findLongestChant("abccba"));     // Expected: "abccba" (Even-length palindrome covering the entire string)

// 4. **Multiple Palindromes in One String**
        System.out.println(Helper.findLongestChant("bananas"));    // Expected: "anana" (Longest palindrome in the middle)
        System.out.println(Helper.findLongestChant("abcdedcba"));  // Expected: "abcdedcba" (Whole string is a palindrome)

// 5. **Edge Cases**
// Empty string:
        System.out.println(Helper.findLongestChant(""));           // Expected: "" (Empty string, no palindrome)

// Single character:
        System.out.println(Helper.findLongestChant("z"));          // Expected: "z" (Single character is always a palindrome)

// String of repeated characters:
        System.out.println(Helper.findLongestChant("zzzzzz"));     // Expected: "zzzzzz" (All characters the same, entire string is a palindrome)

// String with no repeated characters:
        System.out.println(Helper.findLongestChant("abcdefg"));    // Expected: "a" (No palindromes longer than 1 character)

// Large String Example:
        System.out.println(Helper.findLongestChant("abacabadabacaba")); // Expected: "abacabadabacaba" (Entire string is a palindrome)

// 6. **Complex Example with Substrings**
        System.out.println(Helper.findLongestChant("madamracecarlevel")); // Expected: "madam" (First longest palindrome)
        System.out.println(Helper.findLongestChant("abcdeffedcba"));     // Expected: "deffed" (Longest even-length palindrome)

    }
}
