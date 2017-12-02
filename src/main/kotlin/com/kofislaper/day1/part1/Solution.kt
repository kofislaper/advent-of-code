package com.kofislaper.day1.part1

class Solution {
    fun sumElementsEqualToNext(elements: List<Int>): Long {
        val elementsStartingWithLast: List<Int> = listOf(elements.last()) + elements

        return elementsStartingWithLast.indices
                .take(elementsStartingWithLast.size - 1)
                .filter { elementsStartingWithLast[it] == elementsStartingWithLast[it + 1] }
                .map { elementsStartingWithLast[it].toLong() }
                .sum()
    }
}