package com.kofislaper.day5

import org.junit.Assert.*
import org.junit.Test

class Solution5Test {
    @Test
    fun shouldExitOnRightAfter4Steps_whenPositiveValues() {
        val listOf = mutableListOf(1, 1, 1, 1)
        val jumpsBeforeExit = Solution5().countJumpsBeforeExit(listOf)
        assertEquals(4, jumpsBeforeExit)
    }

    @Test
    fun shouldExitOnRight_whenExampleData() {
        val listOf = mutableListOf(0, 3, 0, 1 , -3)
        val jumpsBeforeExit = Solution5().countJumpsBeforeExit(listOf)
        assertEquals(5, jumpsBeforeExit)
    }
    @Test
    fun shouldExitOnLeft_whenMinus1() {
        val listOf = mutableListOf(-1)
        val jumpsBeforeExit = Solution5().countJumpsBeforeExit(listOf)
        assertEquals(1, jumpsBeforeExit)
    }

    @Test
    fun shouldExitOnRight_whenExampleData2() {
        val listOf = mutableListOf(0, 3, 0, 1 , -3)
        val jumpsBeforeExit = Solution5().countJumpsBeforeExit2(listOf)
        assertEquals(10, jumpsBeforeExit)
    }
}