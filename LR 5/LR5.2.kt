import java.lang.Math.pow

fun main(args: Array<String>){
    var p = 1.0
    for (n:Int in 1..10){
        var u: Double = 1*2*3*4*5*6*7*8*9*10.toDouble()
        var p: Double = pow(u,1.0/n).toDouble()
        p *= u
        println("Serednie geometrychne = $p")
    }
}