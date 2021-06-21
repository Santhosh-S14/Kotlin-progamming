fun main(){
    val dwelling = Dwelling(2) //cannot be instantiated
}

abstract class Dwelling(private var residents: Int){
    abstract val buildingMaterial : String
    abstract val capacity : Int

    fun hasRoom(): Boolean{
        return residents < capacity
    }
}