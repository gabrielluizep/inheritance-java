package engtelecom.poo.products;

import java.util.Arrays;

public class Phone {

  protected String id;
  protected String serial;
  protected String model;
  protected String color;
  protected double weight;
  protected double[] dimensions;

  public Phone(String id, String serial, String model, String color, double weight, double[] dimensions) {
    this.id = id;
    this.serial = serial;
    this.model = model;
    this.color = color;
    this.weight = weight;
    this.dimensions = dimensions;
  }

  public String ring() {
    return "trim trim, trim trim";
  }

  @Override
  public String toString() {
    return "Telephone [id=" + id + ", serial=" + serial + ", model=" + model + ", color=" + color + ", weight=" + weight
        + ", dimensions=" + Arrays.toString(dimensions) + "]";
  }
}
