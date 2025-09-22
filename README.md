# H02E01 - The Scroll of Reflectia

This project is a solution to the "The Scroll of Reflectia" exercise for the **INHN0006 Introduction to Software Engineering** course by Prof. Dr. Stefan Wagner. The task involves solving a problem from the fictional Kingdom of Reflectia, where a "mirror chant" is a sequence of glyphs that reads the same forwards and backwards.

---

## Task: Find the longest mirror chant

The objective of this exercise is to implement the `findLongestChant(String s)` method within the `Helper` class. This method must find and return the **longest continuous fragment** of glyphs (a substring) that qualifies as a mirror chant.

### Example:
* **Input:** `s = "abbc"`
* **Output:** `"bb"`

### Constraints:
* `0 <= s.length <= 1000`
* `s` consists of only digits and lowercase English letters.
* `s` cannot be `NULL`.
