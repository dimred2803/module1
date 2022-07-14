package com.mod1.level1;

import org.junit.jupiter.api.Test;

import static com.mod1.level1.Task2.func2;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @org.junit.jupiter.api.Test
    void TestFunc() {
        String actual = func2 (2, 3,4,2);
        String expected = "Yes!";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestFunc1() {
        String actual = func2 (1, 1,8,8);
        String expected = "No!";
        assertEquals(expected, actual);
    }
}