package engtelecom.poo.carGame;

public interface Car {
  public static final String name = "Car";

  public void brake(int intensity);

  public default void turnOff() {
    System.out.println("Desligando carro.");
  }
}
