package com.example.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"));
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(null));
        assertTrue(StringUtils.isPalindrome(""));
    }
}