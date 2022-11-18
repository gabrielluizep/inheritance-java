package engtelecom.poo.shapes;

public class Ellipse extends Bidimensional {
  private double[] focus;
  private double center;
  private double height;

  @Override
  public void draw() {
    System.out.println("Drawing an ellipse");
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
