public class AirsoftGuns extends PatAirsoft {

  private boolean usesBattery;
  private String color;

  public AirsoftGuns() {
    super();
    usesBattery = false;
    color = "";
  }

  public AirsoftGuns(boolean usesBattery, String color, boolean isOnSale, boolean inStock, double weight) {
    super(isOnSale, inStock, weight);
    this.usesBattery = usesBattery;
    this.color = color;
  }

  public boolean getUsesBattery() {
    return usesBattery;
  }

  public void setUsesBattery(boolean usesBattery) {
    this.usesBattery = usesBattery;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    return "Airsoft Gun [Color: " + color + ", Battery Powered: " + usesBattery + ", On Sale: " + getIsOnSale() + ", In Stock: " + getInStock() + ", Weight: " + getWeight() + " g]";
  }
}
