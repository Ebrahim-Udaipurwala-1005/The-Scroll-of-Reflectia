package de.tum.ise;

public class Helper {
    public static String findLongestChant(String s){
        /// TODO: Write your code here
        if (s.isEmpty()) {
            return "";
        }
        else {
            String longestMirrorChant = "";
            for (int i = 0; i < s.length(); i++) {
                String oddMirrorChant = expandAroundCenter(s, i, i);
                String evenMirrorChant = expandAroundCenter(s, i, i + 1);
                String longerMirrorChant = oddMirrorChant.length() > evenMirrorChant.length() ? oddMirrorChant : evenMirrorChant;
                if (longerMirrorChant.length() > longestMirrorChant.length()) {
                    longestMirrorChant = longerMirrorChant;
                }
            }
            return longestMirrorChant;
        }
    }

    private static boolean isMirrorChant(String s, int left, int right) {
        while (left < right) {
            if (s.toLowerCase().charAt(left) != s.toLowerCase().charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && isMirrorChant(s, left, right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
//        System.out.println(isMirrorChant("a"));        // true - single character
//        System.out.println(isMirrorChant("aa"));       // true - two same characters
//        System.out.println(isMirrorChant("aba"));      // true - odd-length palindrome
//        System.out.println(isMirrorChant("abba"));     // true - even-length palindrome
//
//        System.out.println(isMirrorChant("ab"));       // false - different characters
//        System.out.println(isMirrorChant("abc"));      // false - not mirrored
//        System.out.println(isMirrorChant("abcdba"));   // false - mirrored ends but different middle
//
//        System.out.println(isMirrorChant(""));         // true - empty string is trivially a palindrome
//        System.out.println(isMirrorChant("racecar"));  // true - classic palindrome
//        System.out.println(isMirrorChant("hello"));    // false - not a palindrome
    }
}
