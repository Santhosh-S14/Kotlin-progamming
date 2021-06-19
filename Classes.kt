fun main(){
    val myFirstDice = Dice()
    val n = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${n}")

    myFirstDice.sides = 20
    println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.roll()}")
}
class Dice{
    var sides = 6
    fun roll(): Int{
        val diceNumber = 1..sides
        val randomNumber = diceNumber.random()
        return randomNumber
    }
}