# LeetCode

This repository contains Java solutions to LeetCode problems, organized by algorithm categories.

## How to Run

### Build the project

```bash
./gradlew build
```

### Run the tests

```bash
./gradlew test
```

## Solved Problems

| #  | Problem                                                                                                                        | Category        | Difficulty | Solution                                                                                                             | Test Cases                                                                                                                 |
|----|--------------------------------------------------------------------------------------------------------------------------------|-----------------|------------|----------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| 1  | [Two Sum](https://leetcode.com/problems/two-sum)                                                                               | `Hash Table`    | Easy       | [Solution](problems/src/main/java/com/github/sava8n/leetcode/hash_table/TwoSum.java)                                 | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/hash_table/TwoSumTest.java)                                 |
| 2  | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers)                                                               | `Linked List`   | Medium     | [Solution](problems/src/main/java/com/github/sava8n/leetcode/linked_list/AddTwoNumbers.java)                         | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/linked_list/AddTwoNumbersTest.java)                         |
| 3  | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters) | `String`        | Medium     | [Solution](problems/src/main/java/com/github/sava8n/leetcode/string/LongestSubstringWithoutRepeatingCharacters.java) | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/string/LongestSubstringWithoutRepeatingCharactersTest.java) |
| 4  | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays)                                       | `Binary Search` | Hard       | [Solution](problems/src/main/java/com/github/sava8n/leetcode/binary_search/MedianOfTwoSortedArrays.java)             | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/binary_search/MedianOfTwoSortedArraysTest.java)             |
| 5  | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring)                                   | `String`        | Medium     | [Solution](problems/src/main/java/com/github/sava8n/leetcode/string/LongestPalindromicSubstring.java)                | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/string/LongestPalindromicSubstringTest.java)                |
| 6  | [Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion)                                                           | `String`        | Medium     | [Solution](problems/src/main/java/com/github/sava8n/leetcode/string/ZigzagConversion.java)                           | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/string/ZigzagConversionTest.java)                           |
| 7  | [Reverse Integer](https://leetcode.com/problems/reverse-integer)                                                               | `Math`          | Medium     | [Solution](problems/src/main/java/com/github/sava8n/leetcode/math/ReverseInteger.java)                               | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/math/ReverseIntegerTest.java)                               |
| 8  | [String to Integer](https://leetcode.com/problems/string-to-integer-atoi)                                                      | `String`        | Medium     | [Solution](problems/src/main/java/com/github/sava8n/leetcode/string/StringToInteger.java)                            | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/string/StringToIntegerTest.java)                            |
| 9  | [Palindrome Number](https://leetcode.com/problems/palindrome-number)                                                           | `Math`          | Easy       | [Solution](problems/src/main/java/com/github/sava8n/leetcode/math/PalindromeNumber.java)                             | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/math/PalindromeNumberTest.java)                             |
| 10 | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching)                                       | `DP`            | Hard       | [Solution](problems/src/main/java/com/github/sava8n/leetcode/dp/RegularExpressionMatching.java)                      | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/dp/RegularExpressionMatchingTest.java)                      |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water)                                           | `Array`         | Medium     | [Solution](problems/src/main/java/com/github/sava8n/leetcode/array/ContainerWithMostWater.java)                      | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/array/ContainerWithMostWaterTest.java)                      |
| 12 | [Integer to Roman](https://leetcode.com/problems/integer-to-roman)                                                             | `Math`          | Medium     | [Solution](problems/src/main/java/com/github/sava8n/leetcode/math/IntegerToRoman.java)                               | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/math/IntegerToRomanTest.java)                               |
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer)                                                             | `Math`          | Easy       | [Solution](problems/src/main/java/com/github/sava8n/leetcode/math/RomanToInteger.java)                               | [Test cases](problems/src/test/java/com/github/sava8n/leetcode/math/RomanToIntegerTest.java)                               |

## Contribution

Feel free to add new solutions or improve existing ones.
Please ensure that:
- new solutions follow the established package structure
- each solution includes a comment with a link to the LeetCode problem and its difficulty level
- tests are provided to validate the algorithm
