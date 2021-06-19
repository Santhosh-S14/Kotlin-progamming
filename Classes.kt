fun main(){
    val myFirstDice = Dice()
    val n = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${n}")
}
class Dice{
    var sides = 6
    fun roll(): Int{
        val diceNumber = 1..6
        val randomNumber = diceNumber.random()
        return randomNumber
    }
}