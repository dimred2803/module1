package com.mod1.level2;

import org.junit.jupiter.api.Test;

import static com.mod1.level2.Task22.maxDepth;
import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @org.junit.jupiter.api.Test
    void TestMaxDepth() {
        TreeNode t = new TreeNode(2);
        int actual = maxDepth(t);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestMaxDepth2() {
        TreeNode t = new TreeNode(2);
        t.left = new TreeNode(6);
        int actual = maxDepth(t);;
        int expected = 2;
        assertEquals(expected, actual);
    }
}