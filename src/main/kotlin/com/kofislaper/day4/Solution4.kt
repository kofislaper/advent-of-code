package com.kofislaper.day4

import java.io.File

fun main(args: Array<String>) {
    val input = File("src/main/kotlin/com/kofislaper/day4/input.txt").inputStream().bufferedReader().use { it.readLines() }
    val lines: List<List<String>> = input.map { it.split(" ") }

    println(Solution4().countLinesWithoutDuplicates(lines))
    println(Solution4().countLinesWithoutAnagrams(lines))
}


class Solution4 {
    fun countLinesWithoutDuplicates(lines: List<List<String>>) = lines.count { it.distinct().size == it.size }

    fun countLinesWithoutAnagrams(lines: List<List<String>>) = lines.count { containsNoAnagrams(it) }

    private fun containsNoAnagrams(line: List<String>): Boolean {
        val linesWithSortedWords = line
                .map { it.toCharArray() }
                .map { it.sortedArray() }
                .map { it.joinToString(separator = "") }

        return linesWithSortedWords.distinct().size == line.size
    }

}
