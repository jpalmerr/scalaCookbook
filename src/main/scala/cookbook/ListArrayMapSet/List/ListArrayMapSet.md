## List

- immutable
    - size not elements can change

Most operations on a list involve recursive algorithms, where the 
algorithm splits the list into head and tail components.

## Array (and ArrayBuffer)

"Arrays are a mutable, indexed collection of values".

- The class is mutable in that it's elements can be changed
- But once the side of an array is set, it can never grow or shrink

The recommendation with Scala:

- Vector Class
    - go to, *immutable*, indexed sequence class

- ArrayBuffer
    - go to, *mutable*, indexed sequence class
    
Convert to an Array when needed.

## Maps

- a collection of key/value pairs
- the efault map in Scala is *immutable*

## Set

- a collection that contains only unique elements

 If you attempt to add duplicate elements to a set, the set silently ignores the request.
      