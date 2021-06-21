fun main(){
    val squareCabin = SquareCabin(6)
    val roundHut = RoundHut(3)
    val roundTower = RoundTower(4)

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

    with(roundTower) {
        println("\nRound Tower")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
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

open class RoundHut(residents: Int) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 4
}

class RoundTower(residents: Int, val floors: Int = 2) : RoundHut(residents){
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
}
