package com.kofislaper.day4

import org.junit.Assert.*
import org.junit.Test

class Solution4Test {
    @Test
    fun shouldRetutnZero_whenAllLInesHaveDuplicates() {
        val input = listOf(
                listOf("aa", "aa"),
                listOf("bb", "bb", "cc")
        )

        val linesWithoutDuplicates = Solution4().countLinesWithoutDuplicates(input)
        assertEquals(0, linesWithoutDuplicates)
    }

    @Test
    fun shouldRetutnAll_whenNoDuplicates() {
        val input = listOf(
                listOf("aa"),
                listOf("bb", "cc")
        )

        val linesWithoutDuplicates = Solution4().countLinesWithoutDuplicates(input)
        assertEquals(2, linesWithoutDuplicates)
    }


    @Test
    fun shouldRetutnZero_whenAllLInesHaveAnagrams() {
        val input = listOf(
                listOf("aa", "aa"),
                listOf("abc", "cba"),
                listOf("abc", "cba", "aaa")
        )

        val linesWithoutAnagrams = Solution4().countLinesWithoutAnagrams(input)
        assertEquals(0, linesWithoutAnagrams)
    }

    @Test
    fun shouldRetutnAll_whenNoAnagrams() {
        val input = listOf(
                listOf("aa"),
                listOf("bb", "cc")
        )

        val linesWithoutAnagrams = Solution4().countLinesWithoutAnagrams(input)
        assertEquals(2, linesWithoutAnagrams)
    }
}