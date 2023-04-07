package com.example.factorial

class FactorialSimple {
    fun factorial(n: Int): Int {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        return result
    }

}