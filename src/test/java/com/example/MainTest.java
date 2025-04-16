package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import com.example.core.StringUtils;

public class MainTest {

    @Test
    public void testStringReverse() {
        assertEquals("987654321", StringUtils.reverse("123456789"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testNullString() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testSpecialCharacters() {
        assertEquals("!@#$%", StringUtils.reverse("%$#@!"));
    }
}