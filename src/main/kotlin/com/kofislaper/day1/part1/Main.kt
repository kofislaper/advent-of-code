package com.kofislaper.day1.part1

import java.io.File

fun main(args: Array<String>) {

    val input = File("src/main/kotlin/com/kofislaper/day1/input.txt").inputStream().bufferedReader().use { it.readLine() }
    val elements = input.split("").filterNot { it.isEmpty() }.map { e -> e.toInt() }

    val solution = Solution()
    println(solution.sumElementsEqualToNext(elements))
}