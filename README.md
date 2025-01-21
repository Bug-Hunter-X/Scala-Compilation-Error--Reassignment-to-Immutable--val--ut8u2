# Scala Immutability Error

This example demonstrates a common error in Scala: attempting to reassign a `val`.  In Scala, `val`s are immutable, meaning their values cannot be changed after initialization.  The code attempts to change the value of the `name` variable, resulting in a compilation error.

The solution shows how to use a `var` instead for mutable values. Note that using `var`s is generally discouraged for promoting immutability and reducing unexpected side effects unless absolutely needed.