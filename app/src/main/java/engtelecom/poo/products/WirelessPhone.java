package engtelecom.poo.products;

public class WirelessPhone extends Phone {

  private double frequency;
  private int channelsQuantity;
  private double operationDistance;

  public WirelessPhone(String id, String serial, String model, String color, double weight, double[] dimensions,
      double frequency, int channelsQuantity, double operationDistance) {
    super(id, serial, model, color, weight, dimensions);
    this.frequency = frequency;
    this.channelsQuantity = channelsQuantity;
    this.operationDistance = operationDistance;
  }

  public void setChannelsQuantity(int channelsQuantity) {
    this.channelsQuantity = channelsQuantity;
  }

  @Override
  public String toString() {
    return "WirelessPhone [frequency=" + frequency + ", channelsQuantity=" + channelsQuantity + ", operationDistance="
        + operationDistance + "]" + " " + super.toString();
  }

}
