```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val doubledEmptyList = emptyList.map { it * 2 }
    println(doubledEmptyList) // Output: []

    val nullableList: List<Int>? = null
    val doubledNullableList = nullableList?.map { it * 2 } ?: emptyList<Int>()
    println(doubledNullableList) // Output: []
}
```