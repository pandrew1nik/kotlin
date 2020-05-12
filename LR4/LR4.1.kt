fun main(args: Array<String>)
{
   var xp: Double = 0.1
   var xk: Double = 2.0
   var dx: Double = 0.4
   while (xp<xk)
   {
       var x: Double = xp
       var z: Double = ((x*x*x)+(2*x))/(3*Math.cos(Math.pow(x,0.5)+1))
       x += dx
       println("xp = $xp")
       println("z = $z")
   }
}
