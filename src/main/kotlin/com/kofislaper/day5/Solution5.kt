package com.kofislaper.day5

import java.io.File

class Solution5 {
    fun countJumpsBeforeExit(offsets: MutableList<Int>): Int {

        fun incrementBy1(): (Int) -> Int = { i -> i + 1 }

        return jump(0, 0, offsets, incrementBy1())
    }

    fun countJumpsBeforeExit2(offsets: MutableList<Int>): Int {
        fun conditionalIncrement(): (Int) -> Int = { i -> if (i >= 3) i - 1 else i + 1 }

        return jump(0, 0, offsets, conditionalIncrement())
    }

    private tailrec fun jump(position: Int, jumps: Int, offsets: MutableList<Int>, increment: (Int) -> Int): Int {
        if (position >= offsets.size || position < 0) {
            return jumps
        }
        val jump = offsets[position]
        offsets[position] = increment(offsets[position])
        return jump(position + jump, jumps + 1, offsets, increment)
    }

}

fun main(args: Array<String>) {
    val input = File("src/main/kotlin/com/kofislaper/day5/input.txt").inputStream().bufferedReader().use { it.readLines() }

    val offsets = input.map { it.toInt() }
    println(Solution5().countJumpsBeforeExit(offsets.toMutableList()))
    println(Solution5().countJumpsBeforeExit2(offsets.toMutableList()))

    println()
}