package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testStringReverse() {
        // Test normal string reversal
        assertEquals("987654321", com.example.core.StringUtils.reverse("123456789"));
        
        // Test empty string
        assertEquals("", com.example.core.StringUtils.reverse(""));
        
        // Test single character
        assertEquals("a", com.example.core.StringUtils.reverse("a"));
        
        // Test null input
        assertNull(com.example.core.StringUtils.reverse(null));
        
        // Test string with spaces
        assertEquals("cba ", com.example.core.StringUtils.reverse(" abc"));
    }
}