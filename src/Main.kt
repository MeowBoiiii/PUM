fun Czypodzielna3i5(liczba: Int): Int {
    var i = 1
    var liczbaa = ""
    while (i <= liczba) {
        /*if (i % 3 == 0 && i % 5 == 0) {
            println("Trzypiec")
        } else if (i % 3 == 0) {
            println("Trzy")
        } else if (i % 5 == 0) {
            println("Piec")
        }*/
     if (i % 3 == 0) {
         liczbaa=liczbaa+"trzy"
    }
        if (i % 5 == 0) {
            liczbaa=liczbaa+"piec"
    }
        if(i % 7 == 0) {
            liczbaa = liczbaa + "siedem"
        }
        if(i % 11 == 0) {
            liczbaa = liczbaa + "jedenascie"
        }
        if(i % 13 == 0) {
            liczbaa = liczbaa + "trzynascie"
        }
        if (i%3!=0 && i%5!=0 && i%7!=0 && i%11!=0 && i%13!=0) {
            println(i)
        }
        else {
            println(liczbaa)
        }
        liczbaa=""
        i=i+1
    }
return liczba
}
fun zad2aledzialajace(s :String): Boolean {
    val s2 = s.reversed();
    return s == s2;
}
/*fun zad2(slowo: String) :Boolean{
var j=0
    while (j<slowo.length)
    {
      if(slowo[j]==slowo[slowo.length-j]) {
          j = j + 1
      }
        else{
            return true
      }
    }
    return false
}
*/
fun zad3(num: Int) {
    for (i in 0 until num) {
        for (j in 0 until num - i - 1) { // wyrownanie
            print("  ")
        }

        var numer = 1 // Pierwsza liczba to zawsze 1
        for (k in 0..i) {
            print("$numer   ")
            numer = numer * (i - k) / (k + 1) // Wzór na kolejną liczbę
        }
        println("") // następny wiersz
    }
}

fun zad4(num:Int):String {
    var suma = 0
    for (i in 1..<num) {
        if(num%i==0)
            suma+=i
    }
    if(suma == num)
        return "doskonala"
    if(suma > num)
        return "obfita"
    return "niedomiarowa"
}


fun zad5(num:String):Boolean {
    var suma = 0
    var x = 0
    var n  = num.toInt()
    while (n>0) {
        x = 1
        for(i in 1..num.length)
            x *= n%10
        suma += x
        n /= 10
    }
    return suma.toString() == num
}

fun main() {
    //println("Hello World!")\
    println("Podaj liczbe do sprawdzenia")
    /*var naszaliczba= readln().toInt()
    Czypodzielna3i5(naszaliczba)*/


    //println(zad2aledzialajace("abuhba"))

    //zad3(4)
    //println(zad4(28))

    //println(zad5("153"))

}