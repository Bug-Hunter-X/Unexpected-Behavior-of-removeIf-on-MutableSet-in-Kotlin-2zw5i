```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map.removeIf { it.key % 2 == 0 }
    println(map) // Output: {1=a, 3=c}

    // Correct usage for Set
    val set = mutableSetOf(1, 2, 3, 4, 5)
    val toRemove = set.filter { it % 2 == 0 }
    set.removeAll(toRemove)
    println(set) // Output: [1, 3, 5]
}
```