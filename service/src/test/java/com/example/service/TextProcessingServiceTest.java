package com.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextProcessingServiceTest {
    private final TextProcessingService service = new TextProcessingService();

    @Test
    void testProcessTextWithPalindrome() {
        String input = "racecar";
        String result = service.processText(input);
        assertEquals("Text is a palindrome: " + input, result);
    }

    @Test
    void testProcessTextWithNonPalindrome() {
        String input = "hello";
        String result = service.processText(input);
        assertEquals("Reversed text: olleh", result);
    }

    @Test
    void testProcessTextWithInvalidInput() {
        assertEquals("Invalid input", service.processText(null));
        assertEquals("Invalid input", service.processText(""));
        assertEquals("Invalid input", service.processText("   "));
    }
}