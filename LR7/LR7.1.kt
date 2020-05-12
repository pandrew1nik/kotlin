fun main(args: Array<String>){
    var C = arrayOf(1.6,2.1,-3.1,0.0,1.1,-2.2,3.7,8.9,9.2)
    var s = 0.0
    for (n in C){
        if (n > 0){
            s += n
            println("Kilkist` dodatnih elementiv masyvu = $s")
        }
    }
}