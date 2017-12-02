package com.kofislaper.day2

import java.io.File

fun main(args: Array<String>) {
    val input = File("src/main/kotlin/com/kofislaper/day2/input.txt").inputStream().bufferedReader().use { it.readLines() }
    val inputRows = input
            .map { it.split(" ", "\t") }
            .map { it.map { it.toInt() } }

    val solution = Solution()
    println(solution.calculateChecksum(inputRows))
    println(solution.calculateDivisibleNumbers(inputRows))
}