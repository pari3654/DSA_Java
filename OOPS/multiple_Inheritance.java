public class OOPS {
  public static void main(String args[]) {

    Dog leo = new Dog();
    leo.breed = "Bulldog";
    System.out.println(leo.breed);
    leo.eat(); // inherited from Animal class
  }
}

// Base class 
class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }
}

// Derived class 1
class Fish extends Animal {
  String name;
}

// Derived class 2
class Dog extends Animal {
  String breed;
}
