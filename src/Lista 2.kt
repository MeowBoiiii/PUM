//val r: (String, Int) -> String = { s, i -> s.repeat(i) }

fun main(){
// zad 1
    powtarzaj("2razy", 2)
    powtarzaj("ab", 10)

// zad 2
    val lista = List(10) {it+1}
    println(lista.tail)
    println(lista.head)

// zad 3
    println(isSorted(listOf(1, 2, 3, 4)) { i: Int, j: Int -> i < j })
    println(isSorted(listOf(4, 3, 2, 1)) { i: Int, j: Int -> i == j })
    println(isSorted(listOf(1, 1, 1, 1)) { i: Int, j: Int -> i == j })
    println(isSorted(listOf("abcd", "dfgh", "poiuyt", "xx")) { i: String, j: String -> i.first() < j.first() })

// zad 4
    println(tailToHead(lista))
    //val pustaLista = listOf<Int>()
    //println(tailToHead(pustaLista))
}
// zad 5
val powtarzaj = {s:String, i:Int -> println(s.repeat(i)) }

// wszystko po za pierwszym
val <T> List<T>.tail: List<T>
    get() = this.drop(1)
// pierwszy
val <T> List<T>.head: List<T>
    get() = this.take(1)

fun <A> isSorted(lst: List<A>, order: (A, A) -> Boolean): Boolean {
    for (i in 0 ..< lst.size - 1) {
        if (!order(lst[i], lst[i + 1])) {
            return false
        }
    }
    return true
}
// ostatni element na początek listy
fun <A> tailToHead(lst: List<A>): List<A> {
    if (lst.isEmpty())
        throw Error("Pusta lista")

    val ostatni = lst.last()
    val resztaListy = lst.dropLast(1)
    return listOf(ostatni) + resztaListy
}
fun <A> setHead(lst: List<A>, item: A): List<A>{
    val resztalisty = lst.drop(1)
    return listOf(item) + resztalisty
}