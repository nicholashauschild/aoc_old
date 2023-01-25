package aoc

fun main() {
    val input = readLines("input/day1_2015.txt")

    var level = 0
    var characterIdx = 1
    for (mapLine: String in input) {
        // part 1
//        level += mapLine.map {
//            when (it) {
//                '(' -> 1
//                ')' -> -1
//                else -> 0
//            }
//        }.sum()

        // part 2
        for (upDownIndicator: Char in mapLine) {
            level += when (upDownIndicator) {
                '(' -> 1
                ')' -> -1
                else -> 0
            }

            if(level < 0) {
                break
            }
            ++characterIdx
        }
    }
    println(characterIdx)
}