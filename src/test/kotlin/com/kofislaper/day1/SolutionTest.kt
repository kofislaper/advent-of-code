package com.kofislaper.day1

import org.junit.Test
import kotlin.test.assertEquals


class SolutionTest {
    @Test
    fun sumOfElementsEqualToNext_shouldBeZero_whenNoElementEqualToNext() {
        val solution = Solution()

        val sumElementsEqualToNext = solution.sumElementsEqualToNext(listOf(1, 2, 3))

        assertEquals(0, sumElementsEqualToNext)
    }

    @Test
    fun sumOfElementsEqualToNext_shouldBeEqualToSize_whenAllElementsEqual() {
        val solution = Solution()

        val sumElementsEqualToNext = solution.sumElementsEqualToNext(listOf(1, 1, 1, 1))

        assertEquals(4, sumElementsEqualToNext)
    }

    @Test
    fun sumOfElementsEqualToNext_shouldBeNumber_whenOnlyOneMatch() {
        val solution = Solution()

        val sumElementsEqualToNext = solution.sumElementsEqualToNext(listOf(9, 1, 2, 1, 2, 1, 2, 9))

        assertEquals(9, sumElementsEqualToNext)
    }

    @Test
    fun sumOfElementsEqualToOneInNextHalf_shouldBeZero_whenNoElementEqualToNext() {
        val solution = Solution()

        val sumElementsEqualToNext = solution.sumElementsEqualToOneInNextHalfOfList(listOf(1, 2, 3))

        assertEquals(0, sumElementsEqualToNext)
    }

    @Test
    fun sumOfElementsEqualToOneInNextHalf_shouldBeEqualToSize_whenAllElementsEqual() {
        val solution = Solution()

        val sumElementsEqualToNext = solution.sumElementsEqualToOneInNextHalfOfList(listOf(1, 1, 1, 1))

        assertEquals(4, sumElementsEqualToNext)
    }

    @Test
    fun sumOfElementsEqualToOneInNextHalf_shouldBeNumber_accordingToExamples() {
        val solution = Solution()

        val example1Value = solution.sumElementsEqualToOneInNextHalfOfList(listOf(1, 2, 1, 2))
        assertEquals(6, example1Value)

        val example2Value = solution.sumElementsEqualToOneInNextHalfOfList(listOf(1, 2, 2, 1))
        assertEquals(0, example2Value)

        val example3Value = solution.sumElementsEqualToOneInNextHalfOfList(listOf(1, 2, 3, 1, 2, 3))
        assertEquals(12, example3Value)

        val example4Value = solution.sumElementsEqualToOneInNextHalfOfList(listOf(1, 2, 1, 3, 1, 4, 1, 5))
        assertEquals(4, example4Value)
    }


}
