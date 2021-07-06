open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10){
    override fun toString() : String{
        return name
    }
}

class Vegetables(vararg val toppings : String) : Item("Vegetables", 5){
    override fun toString() : String{
        if (toppings.isEmpty()){
            return "$name Chef's choice"
        }
        else{
            return name + " " + toppings.joinToString()
        }
    }
}

class Orders(val orderNo : Int){
    private val items = mutableListOf<Item>()
    
    fun addItem(newItem : Item){
        items.add(newItem)
    }

    fun addAll(allItems: List<Item>){
        items.addAll(allItems)
    }

    fun print(){
        println("Order #${orderNo}")
        var total = 0
        for (item in items) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }

}

fun main() {
    val order1 = Orders(1)
    order1.addItem(Noodles())
    order1.print()

    println()

    val order2 = Orders(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    order2.print()

    println()

    val order3 = Orders(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    order3.print()
}