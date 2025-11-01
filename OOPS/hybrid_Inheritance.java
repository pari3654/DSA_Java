// Base class
class Animal {
  void eat() {
    System.out.println("Animal eats food");
  }
}

// Child class 1
class Dog extends Animal {
  void bark() {
    System.out.println("Dog barks");
  }
}

// Child class 2
class Fish extends Animal {
  void swim() {
    System.out.println("Fish swims");
  }
}

// Another child (Multilevel)
class Puppy extends Dog {
  void weep() {
    System.out.println("Puppy weeps");
  }
}

public class OOPS {
  public static void main(String args[]) {
    Puppy p = new Puppy();
    p.eat();   // from Animal
    p.bark();  // from Dog
    p.weep();  // from Puppy
  }
}
