object FtoC{
def main(args: Array[String])={
    var temp=35
    println(s"${temp} in Fahrenheit is : ${convertToF(temp)}")
}

def convertToF(C: Double): Double={
    return C*1.800 + 32
}
}