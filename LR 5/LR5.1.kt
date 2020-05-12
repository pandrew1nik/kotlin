fun main(args: Array<String>){
    for (n: Int in 2..9) {
        var y: Double = 0.0
        var u: Double = (n - 2) / ((n * n) + 16).toDouble()
        y += u
        println("Sum = $y")
    }
}