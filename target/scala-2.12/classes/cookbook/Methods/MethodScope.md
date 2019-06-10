# Controlling Method Scope

## Object-private scope

- the most restrictive access
- method is only available to the *current instance* of the object

```
private[this] def...
```

## Private

- available to its class but not subclasses
- user cannot call private method

```$xslt
private def ...
```

## Protected

- makes the method available to subclasses

```$xslt
class Animal {
    protected def breathe {}
}

class Dog extends Animal {
    breathe // will compile
}

class Jungle {
    val a = new Animal
    a.breathe
}   // error: won't complie
```

## Package

- available to all members of a package

```$xslt
class Foo {
    private[model] def doX {}
}

class Bar {
    val f = new Foo
    f.doX // will compile
}
```

## Public

- default
- no access modifier