public class  OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // craeted a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(6);
        System.out.println(p1.tip);
    }

}

class Pen {
  // attributes 
  String color;
  int tip;
  //function 
  void setColor(String newColor) {
    color = newColor;
  }

  void setTip(int newTip) {
    tip = newTip;
  }
}

