fun main (args: Array<String>) {
    val a: Double = 1.77
    val b: Double = -0.62
    val x: Double = Math.pow(Math.sin(Math.exp(-b)), 4.0) + Math.abs(a * b)
    val y: Double = Math.log(Math.abs(a - b)) + Math.log10(Math.PI/a)
    val r: Double = (Math.cos((x + y) / (x - y)*(x - y))) / (Math.sin((x + y) / (x - y)*(x - y)))
    println(r)
}