package com.kofislaper.day3

class Solution {
    fun calculateManhattanDistance(number: Int) {

        //4(a-1) -> na jednym okręgu
        var nextA = 0
        var elements = 1
        var currentelem = 0
        while (elements < number) {
            currentelem = 8 * (nextA + 1)
            elements += currentelem
            nextA += 1
        }
//        println(nextA)
        val length = nextA + 2
        val index = (currentelem - elements + number - 1) % (length + 1)


        val first = (length - 1 downTo ((nextA - 1) * 2) + 1).toList()
        val second = (length /  ((nextA -1) * 2) .. length + 2).toList()
        val eventual = first + second
        print(index)
        print(" ")
        println(eventual[index])

    }

}

fun main(args: Array<String>) {
//
//    Solution().calculateManhattanDistance(10)
//    Solution().calculateManhattanDistance(11)
//    Solution().calculateManhattanDistance(12)
//    Solution().calculateManhattanDistance(13)

    println()

    Solution().calculateManhattanDistance(26)
    Solution().calculateManhattanDistance(27)
    Solution().calculateManhattanDistance(28)
    Solution().calculateManhattanDistance(29)
    Solution().calculateManhattanDistance(30)
    Solution().calculateManhattanDistance(31)
}