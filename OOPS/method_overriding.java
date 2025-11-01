public class OOPS {
  public static void main(String args[]) {
  Dog d1  = new Dog();
  d1.eat();
  }
}

class Animal {
  void eat() {
    System.out.println("eats anything");
  }
}

class Dog extends Animal {
  void eat() {
    System.out.println("eats grass");
  }
}
