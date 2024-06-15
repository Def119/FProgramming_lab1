object DiskArea {
  def main(args: Array[String]) ={
    val radius = 5
    println(s"The area of a disk with radius $radius is ${Area(radius)}")
  }

  def Area(radius: Double): Double = {
   return math.Pi * radius * radius
  }
}
