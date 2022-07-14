package com.mod1.level2;

import org.junit.jupiter.api.Test;

import static com.mod1.level2.Task21.func21;
import static org.junit.jupiter.api.Assertions.*;

class Task21Test {

    @org.junit.jupiter.api.Test
    void TestFunc21() {
        String s = "{(iiiii())}";
        boolean actual = func21(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestFunc212() {
        String s = "{(iiiii(}";
        boolean actual = func21(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestFunc213() {
        String s = "";
        boolean actual = func21(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}