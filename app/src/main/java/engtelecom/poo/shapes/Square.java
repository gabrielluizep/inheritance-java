package engtelecom.poo.shapes;

public class Square extends Bidimensional {
  private double length;

  @Override
  public void draw() {
    System.out.println("Drawing a square");
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
