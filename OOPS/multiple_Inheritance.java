public class OOPS {
  public static void main(String args[]) {

    // Dog object
    Dog leo = new Dog();
    leo.breed = "Bulldog";
    leo.color = "Brown"; // inherited property
    leo.eat();           // inherited method
    System.out.println("Breed: " + leo.breed);
    System.out.println("Color: " + leo.color);

    // Fish object
    Fish nemo = new Fish();
    nemo.name = "Goldfish";
    nemo.eat();            // inherited method
    System.out.println("Fish Name: " + nemo.name);
  }
}

// Base (Parent) Class
class Animal {
  String color;

  void eat() {
    System.out.println("eats food");
  }
}

// Derived Class 1
class Fish extends Animal {
  String name;
}

// Derived Class 2
class Dog extends Animal {
  String breed;
}
