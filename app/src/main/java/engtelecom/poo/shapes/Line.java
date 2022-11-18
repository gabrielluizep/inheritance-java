package engtelecom.poo.shapes;

public class Line extends Shape {
  private double finalCoordinate;

  double getLength() {
    return 0;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a line");
  }
}
