package com.filipearruda;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Sum sum = new Sum();
        assertEquals(2, sum.sum(1, 1));
    }
}