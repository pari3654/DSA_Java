public class OOPS {
  public static void main(String args[]) {
  Fish shark = new Fish();
  shark.eat();
  }
}

//Base class
class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }

}

//Derived class
class Fish extends Animal {
  String name;

  void breathe() {
    System.out.println("breathes");
  }
}


