import kotlin.math.PI

//Area of a circle
fun main(){
    print("Enter the radius of the circle:")
    val radius :Double = readln().toDouble()
    val area : Double = PI * radius * radius
    print("The area of the circle is $area")
}
