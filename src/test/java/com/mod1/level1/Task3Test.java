package com.mod1.level1;

import org.junit.jupiter.api.Test;

import static com.mod1.level1.Task3.func3;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @org.junit.jupiter.api.Test
    void TestFunc() {
        double actual = func3(0,0,1,1,2,2);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void TestFunc2() {
        double actual = func3(3,0,5 ,6,0,1);
        double expected = 10;
        assertEquals(expected,actual);
    }
}