object FtoC{
def main(args: Array[String])={
    var n = 51
    println(s"Wholesale cost for $n books is :  ${TotalWholeSale(n)}")
}

def ShippingCost(n:Int):Double = {
    return if (n>50 ) {(50)*3 + (n-50)*.75} else  n*3
}

def PriceForAll(n:Int):Double ={
    return n*24.95
}

def Discount(n:Int):Double = {
    return PriceForAll(n)*.4
}

def PriceAfterDiscount(n:Int):Double={
    return PriceForAll(n)-Discount(n)
}

def TotalWholeSale(n:Int):Double = {
    return PriceAfterDiscount(n)+ShippingCost(n)
}
     
}