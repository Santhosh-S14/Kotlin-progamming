fun main(){
    val numbers = listOf(0, 3, 4, 6, 8, 0, 2, 8)
    println("Numbers: $numbers")

    val setOfNos = numbers.toSet()
    println("Set: $setOfNos")

    val s = setOf(1, 2, 3)
    val ms = mutableSetOf(3, 2, 1)
    println(s == ms)

    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    println(peopleAges)

    //Working with collections
    peopleAges.forEach { print("${it.key} is ${it.value}, ") }

    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )

    var fnames = peopleAges.filter { it.key.length < 4 }
    println(fnames)
}