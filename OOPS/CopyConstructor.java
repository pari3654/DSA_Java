class Student {
  String name;
  int roll;

  //  Normal Constructor
  Student(String name, int roll) {
    this.name = name;
    this.roll = roll;
  }

  //  Copy Constructor
  Student(Student s2) {
    this.name = s2.name;
    this.roll = s2.roll;
  }
}

public class OOPS {
  public static void main(String args[]) {
    Student s1 = new Student("Pari", 101); // normal constructor
    Student s2 = new Student(s1);          // copy constructor

    System.out.println("s1 name: " + s1.name + ", roll: " + s1.roll);
    System.out.println("s2 name: " + s2.name + ", roll: " + s2.roll);
  }
}
