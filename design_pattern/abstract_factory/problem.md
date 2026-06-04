## Problem 

* If you want to create objects from same/related family, i.e company name, style, ..., then using abstract factory will help. 
* Multiple product types (Chair, Sofa, Table) across multiple families (Modern, Victorian), not just many variants of one product.
* It's an interface to declare how to make each family (related objects).

```
Abstract Factory:
    Creates families of related/compatible objects.

Factory Method:
    Creates one product.
```
## Implementation 

>The factory interface doesn't create objects itself. It declares methods for creating each product in a family.

* Abstract class to create objects. 
```java
interface FurnitureFactory {
 //Products
  Chair createChair();
  Sofa createSofa();
}
```

* Families to produce related objects
```java
//Modern family
class ModernFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModrenChair();
    }

    public Sofa createSofa() {
        return new ModrenSofa();
    }
}
```

```java 
// Victorian family
class VictorianFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }

    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
```
## Resources 


[Guru](https://refactoring.guru/design-patterns/abstract-factory)
