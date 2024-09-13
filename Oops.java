class Pen{           //creating class in the java.
    String color;
    int tip;

    public void printColor(){
        System.out.println(this.color);
    }
    public void printTip(){
        System.out.println(this.tip);
    }
}

public class Oops{
    public static void main(String[] args) {
        Pen p1 = new Pen();  // creating the  objects in the java.
        p1.color = "blue";
        p1.tip =5;

        Pen p2 = new Pen();
        p2.tip = 7;


        p1.printColor();
        p2.printTip();
    }
}