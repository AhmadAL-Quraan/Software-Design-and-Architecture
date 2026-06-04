/*
- Abstract Factory provides an interface for 
creating families of related or dependent objects 
without specifying their concrete classes. 

- related objects doesn't means related in interface or same class
it means same style or category.
*/
interface Chair {
  String sitOn();
}

interface Sofa {
  String lieOn();
}

// Part of victorian family
class VictorianChair implements Chair {
  public String sitOn() {
    return "Sitting";
  }
}

// part of modren family
class ModrenChair implements Chair {
  public String sitOn() {
    return "Sitting";
  }
}

// Part of victorian family
class VictorianSofa implements Sofa {
  public String lieOn() {
    return "Laying on";
  }
}

// part of modren family
class ModrenSofa implements Sofa {
  public String lieOn() {
    return "laying on";
  }
}

/*
 * - Now make the factory interface which will be used to make
 * our family related objects.
 */

interface FurnitureFactory {
  Chair createChair();

  Sofa createSofa();
}

// Same family (victorian)
class VictorianFamilyFactory implements FurnitureFactory {
  public Chair createChair() {
    return new VictorianChair();
  }

  public Sofa createSofa() {
    return new VictorianSofa();
  }
}

// Same family (Modren)
class ModrenFamilyFactory implements FurnitureFactory {
  public Chair createChair() {
    return new ModrenChair();
  }

  public Sofa createSofa() {
    return new ModrenSofa();
  }
}
