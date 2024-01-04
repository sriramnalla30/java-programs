abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }
  abstract double area();
}

class Circle extends Shape {
    int rad;

    Circle(String color, int rad) {
        super(color); // Call the superclass constructor with the color parameter
        this.rad = rad;
    }

    double area() {
        return 3.14 * this.rad * this.rad;
    }
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(String color, int length, int width) {
        super(color); // Call the superclass constructor with the color parameter
        this.length = length;
        this.width = width;
    }

    double area() {
        return this.length * this.width;
    }
}

class Triangle extends Shape {
    int height;
    int base;

    Triangle(String color, int height, int base) {
        super(color); // Call the superclass constructor with the color parameter
        this.height = height;
        this.base = base;
    }
    double area() {
        return 0.5 * this.base * this.height;
    }
}

public class shapes_classes {
    public static void main(String[] args) {
     Shape shape[]=new Shape[3];
      shape[0]=new Circle("blue",3);
      shape[1]=new Triangle("red",2,2);
      shape[2]=new Rectangle("green",2,2);
      for(Shape s :shape){
        System.out.println("area is "+s.area());
      }  
      
    }
}
