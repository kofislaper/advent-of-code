package com.kofislaper.day1.part1

import org.junit.Test
import kotlin.test.assertEquals


class SolutionTest {
    @Test
    fun shouldBeZero_whenNoElementEqualToNext() {
        val solution = Solution()

        val sumElementsEqualToNext = solution.sumElementsEqualToNext(listOf(1, 2, 3))

        assertEquals(0, sumElementsEqualToNext)
    }

    @Test
    fun shouldBeEqualToSize_whenAllElementsEqual() {
        val solution = Solution()

        val sumElementsEqualToNext = solution.sumElementsEqualToNext(listOf(1, 1, 1, 1))

        assertEquals(4, sumElementsEqualToNext)
    }

    @Test
    fun shouldBeNumber_whenOnlyOneMatch() {
        val solution = Solution()

        val sumElementsEqualToNext = solution.sumElementsEqualToNext(listOf(9, 1, 2, 1, 2, 1, 2, 9))

        assertEquals(9, sumElementsEqualToNext)
    }
}
