fun main(){
    val numbers : List<Int> = listOf(1, 2, 3, 4, 5, 6)
    println("List: ${numbers}")
    println("Size: ${numbers.size}")

    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

    
    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")

    val colors = listOf("green", "red", "blue")

    println("List: ${colors}")
    println("Reversed List: ${colors.reversed()}")
    println("Sorted List: ${colors.sorted()}")
}