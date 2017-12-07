package com.kofislaper.day6

import org.junit.Assert.*
import org.junit.Test

class Solution6Test {
    @Test
    fun testExample1() {
        val countRebalances = Solution6().countRebalances(mutableListOf(0, 2, 7, 4))
        assertEquals(5, countRebalances)
    }
    @Test
    fun testExample2() {
        val countRebalances = Solution6().countRebalancesToTheSameState(mutableListOf(0, 2, 7, 4))
        assertEquals(4, countRebalances)
    }
}