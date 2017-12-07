package com.kofislaper.day6

import java.io.File

class Solution6 {
    fun countRebalances(blocks: MutableList<Int>):Int {
        val ordersSet = HashSet<MutableList<Int>>()

        var rebalances = 0
        while (ordersSet.add(blocks)) {
            val maxWithIndex = blocks.withIndex().maxBy { it.value }


            var valueToDistribute = maxWithIndex?.value ?: 0
            var index = maxWithIndex?.index ?: 0 % blocks.size
            blocks[index] = 0
            index++

            (valueToDistribute downTo 1).forEach {
                index %= blocks.size
                blocks[index]++
                valueToDistribute--
                index++
            }

            rebalances++

        }
        return rebalances
    }

    fun countRebalancesToTheSameState(blocks: MutableList<Int>):Int {
        countRebalances(blocks)
        return countRebalances(blocks)
    }
}

fun main(args: Array<String>) {
    val input = File("src/main/kotlin/com/kofislaper/day6/input.txt").inputStream().bufferedReader().use { it.readLine() }
    val ints = input.split("\t").map { it.toInt() }
    println(Solution6().countRebalances(ints.toMutableList()))
    println(Solution6().countRebalancesToTheSameState(ints.toMutableList()))
}