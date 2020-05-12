import java.lang.Math.pow

fun main(args: Array<String>){
    var p:Double = 1.0
    for (k in 2..21){
        var k:Double = 9.0
        var u:Double = pow(-1.0,k)*(k+3)/(k+1).toDouble()
        p *= u
        println("Dobutok = $p")
    }
}