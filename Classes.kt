fun main(){
    val myFirstDice = Dice()
    println(myFirstDice.sides)
    myFirstDice.roll()
}
class Dice{
    var sides = 6
    fun roll(){
        val diceNumber = 1..6
        println(diceNumber.random())
    }
}