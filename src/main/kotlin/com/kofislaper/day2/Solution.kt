package com.kofislaper.day2

class Solution {
    fun calculateChecksum(inputRows: List<List<Int>>): Int {
        return inputRows.map { (it.max() ?: 0) - (it.min() ?: 0) }.sum()
    }

    fun calculateDivisibleNumbers(inputRows: List<List<Int>>): Int {
        return inputRows.map { divideDivisableValues(it) }.sum()
    }

    private fun divideDivisableValues(elements: List<Int>): Int {
//        return elements
//                .map { a ->
//                    val b = elements.find { a % it == 0 && a != it }
//                    if (b != null) a / b else 0
//                }
//                .find { it != 0 } ?: 0

        return elements.fold(0) { acc, a ->
            val b = elements.find { a % it == 0 && a != it }
            if (b != null) a / b else acc
        }
    }
}