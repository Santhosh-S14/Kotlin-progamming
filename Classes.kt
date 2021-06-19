fun main(){
    val myFirstDice = Dice(6)
    val n = myFirstDice.roll()
    println("Your ${myFirstDice.nSides} sided dice rolled ${n}!")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.nSides} sided dice rolled ${mySecondDice.roll()}!")
}
class Dice(val nSides: Int){
    fun roll(): Int{
        val diceNumber = 1..nSides
        val randomNumber = diceNumber.random()
        return randomNumber
    }
}