package com.mod1.level1;

import static com.mod1.level1.Task1.func1;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @org.junit.jupiter.api.Test
    void TestFunc1() {
        int[] myArray = {1, 2, 1, 5};
        int actual = func1(myArray);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void TestFunc12() {
        int[] myArray = {1, 1, 1, 1, 1, 1, 100};
        int actual = func1(myArray);
        int expected = 100;
        assertEquals(expected,actual);
    }
}