package basicalgo

fun main() {
    var fact = 1
    for (i in 2..6) {
        fact *= i
    }
    print("Factorial number:  ($fact)")
}