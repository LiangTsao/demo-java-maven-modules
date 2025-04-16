package com.example.service;

import com.example.core.StringUtils;

public class TextProcessingService {
    public String processText(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Invalid input";
        }

        if (StringUtils.isPalindrome(input)) {
            return "Text is a palindrome: " + input;
        } else {
            String reversed = StringUtils.reverse(input);
            return "Reversed text: " + reversed;
        }
    }
}