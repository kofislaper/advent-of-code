package com.kofislaper.day2

import org.junit.Assert.*
import org.junit.Test

class SolutionTest {
    @Test
    fun checksum_shouldBeZero_whenAllRowsContainEqualValues() {
        val input = listOf(
                listOf(0, 0),
                listOf(1, 1),
                listOf(2, 2)
        )
        val solution = Solution()
        val result = solution.calculateChecksum(input)
        assertEquals(0, result)
    }

    @Test
    fun checksum_shouldBeNumber_accordingToExample() {
        val input = listOf(
                listOf(5, 1, 9, 5),
                listOf(7, 5, 3),
                listOf(2, 4, 6, 8)
        )
        val solution = Solution()
        val result = solution.calculateChecksum(input)
        assertEquals(18, result)
    }


    @Test
    fun sumOfDivisable_ShouldBeNumber_accordingToExample() {
        val input = listOf(
                listOf(5, 9, 2, 8),
                listOf(9, 4, 7, 3),
                listOf(3, 8, 6, 5)
        )
        val solution = Solution()
        val result = solution.calculateDivisibleNumbers(input)
        assertEquals(9, result)
    }


}