package engtelecom.poo.shapes;

public class Circle extends Bidimensional {
  private double radius;

  @Override
  public void draw() {
    System.out.println("Drawing a circle");
  }

  @Override
  public double getArea() {
    return 0;
  }

  @Override
  public double getPerimeter() {
    return 0;
  }
}
