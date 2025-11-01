public class OOPS {
  public static void main(String args[]) {
  Horse h = new Horse();
  h.eat();
  h.walk();
  
  }
}

abstract class Animal {
 
  Animal() { //constructor
    System.out.println("animal constructor called");
  }
  void eat() { //function 
    System.out.println("animal eats");
  }

  abstract void walk();
}

class Horse extends Animal {
  Horse() {
    System.out.println("Horse constructor called");
  }
  void walk() {
    System.out.println("walks on 4 legs");
  }
}
