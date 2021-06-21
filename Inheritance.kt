fun main(){
    val squareCabin = SquareCabin(6)
    val roundHut = RoundHut(3)

    with(squareCabin){
        println("Sqaure Cabin")
        println("Capacity : ${capacity}")
        println("Building Material : ${buildingMaterial}")
        println("Has Room? : ${hasRoom()}")
        println()
    }

    with(roundHut){
        println("Round Hut")
        println("Capacity : ${capacity}")
        println("Building Material : ${buildingMaterial}")
        println("Has Room? : ${hasRoom()}")
        println()
    }
}

abstract class Dwelling(private var residents: Int){
    abstract val buildingMaterial : String
    abstract val capacity : Int

    fun hasRoom(): Boolean{
        return residents < capacity
    }
}

class SquareCabin(residents: Int) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
}

class RoundHut(residents: Int) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 4
}