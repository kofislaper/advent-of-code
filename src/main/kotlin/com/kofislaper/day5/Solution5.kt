package com.kofislaper.day5

import java.io.File

class Solution5 {
    fun countJumpsBeforeExit(offsets: MutableList<Int>): Int {

        tailrec fun jump(position: Int, jumps: Int): Int {
            if (position >= offsets.size || position < 0) {
                return jumps
            }
            val jump = offsets[position]
            offsets[position]++
            return jump(position + jump, jumps + 1)
        }
        return jump(0, 0)
    }

    fun countJumpsBeforeExit2(offsets: MutableList<Int>): Int {

        tailrec fun jump(position: Int, jumps: Int): Int {
            if (position >= offsets.size || position < 0) {
                return jumps
            }
            val jump = offsets[position]
            if (jump >= 3) {
                offsets[position]--
            } else {
                offsets[position]++
            }
            return jump(position + jump, jumps + 1)
        }
        return jump(0, 0)
    }

}

fun main(args: Array<String>) {
    val input = File("src/main/kotlin/com/kofislaper/day5/input.txt").inputStream().bufferedReader().use { it.readLines() }

    val offsets = input.map { it.toInt() }
    println(Solution5().countJumpsBeforeExit(offsets.toMutableList()))
    println(Solution5().countJumpsBeforeExit2(offsets.toMutableList()))

    println()
}