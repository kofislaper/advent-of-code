package com.kofislaper.day1.part2

class Solution {

    fun sumElementsEqualToAnyInNextHalfOfList(elements: List<Int>): Long {
        val joined: List<Int> = elements + elements

        return elements.indices
                .filter { joined[it] == joined[it + elements.size / 2] }
                .map { joined[it].toLong() }
                .sum()
    }
}