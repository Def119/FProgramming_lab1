object FtoC{
def main(args: Array[String])={
    var radius = 5;
    println(s"Volume of a sphere with radius of $radius is : ${VolumeSphere(radius)}")

}

def VolumeSphere(radius: Double): Double = {
    return radius*radius*radius*math.Pi * 3/4
}
}