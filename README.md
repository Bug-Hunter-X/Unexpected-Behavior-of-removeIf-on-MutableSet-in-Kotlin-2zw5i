# Unexpected Behavior of removeIf on MutableSet in Kotlin

This repository demonstrates an unexpected behavior when using the `removeIf` function with a `MutableSet` in Kotlin.  The `removeIf` function is available for `MutableList` and `MutableMap`, but not for `MutableSet`. Attempting to use it will not result in a compilation error, but will not remove any elements.

The `bug.kt` file shows the incorrect usage and the unexpected output. The `bugSolution.kt` file demonstrates the correct approach using `removeAll`.