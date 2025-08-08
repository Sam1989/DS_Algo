package basicalgo

import com.sun.tools.javac.Main

fun main() {
    if(primeNumber(3)){
        println("PrimeNumber")
    } else {
        println("Not PrimeNumber")
    }
}

fun primeNumber(value: Int): Boolean {
    return if (value > 3 ) {
        value %2 != 0
    } else {
        true
    }
}
