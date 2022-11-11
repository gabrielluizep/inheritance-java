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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((serial == null) ? 0 : serial.hashCode());
    result = prime * result + ((model == null) ? 0 : model.hashCode());
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    long temp;
    temp = Double.doubleToLongBits(weight);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + Arrays.hashCode(dimensions);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Phone other = (Phone) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (serial == null) {
      if (other.serial != null)
        return false;
    } else if (!serial.equals(other.serial))
      return false;
    if (model == null) {
      if (other.model != null)
        return false;
    } else if (!model.equals(other.model))
      return false;
    if (color == null) {
      if (other.color != null)
        return false;
    } else if (!color.equals(other.color))
      return false;
    if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
      return false;
    if (!Arrays.equals(dimensions, other.dimensions))
      return false;
    return true;
  }

}
