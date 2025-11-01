public class OOPS {
  public static void main(String args[]) {
  Child c1 = new Child();
  c1.read();
  c1.write();
  }
}

interface Father {
 void read();
}

interface Mother{
void write();
}

class Child  implements Father, Mother {
 public void read() {
    System.out.println("Child is reading");
  }
 public void write() {
    System.out.println("Child is writing");
  }
  
}
