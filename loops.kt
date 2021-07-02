fun main(){
    val guestsPerFamily = listOf(2, 4, 1, 3)
    var total = 0
    var index = 0

    while(index < guestsPerFamily.size){
        total += guestsPerFamily[index]
        index++
    }
    println("Total guests: ${total}")

    val names = listOf("Santhosh", "Sanjana", "Vimala", "Santhanam")

    for (name in names){
        println("${name}: ${name.length}")
    }
}