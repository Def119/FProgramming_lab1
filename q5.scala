object RunningTime{
def main(args: Array[String])={
    var distance = 2+3+2;
    println(s"Total time of running for ${distance}km is : ${TotalTime(2,3)}mins")

}

def EasyPace(distance: Double): Double = {
    return distance*8 + distance*8
}
def Tempo(distance: Double):Double = {
    return distance*7
}

def TotalTime(easy: Double,tempo: Double):Double = {
    return EasyPace(easy) + Tempo(tempo)
}
}
