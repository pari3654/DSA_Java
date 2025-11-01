public class OOPS {
  public static void main(String args[]) {
    Dog d = new Dog();
    d.eat();  // from Animal
    d.bark(); // from Dog

    Fish f = new Fish();
    f.eat();  // from Animal
    f.swim(); // from Fish
  }
}

class Animal {
  void eat() {
    System.out.println("Animal eats food");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Dog barks");
  }
}

class Fish extends Animal {
  void swim() {
    System.out.println("Fish swims");
  }
}

