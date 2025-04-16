package com.example.core;

public class StringUtils {
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String cleaned = input.toLowerCase().replaceAll("\\s+", "");
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}