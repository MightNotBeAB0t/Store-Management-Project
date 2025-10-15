public class PatAirsoft {

  // Instance variables
  private boolean isOnSale;
  private boolean inStock;
  private double weight;

  // No-argument constructor
  public PatAirsoft() {
    isOnSale = false;
    inStock = false;
    weight = 0.0;
  }

  // Parameterized constructor
  public PatAirsoft(boolean isOnSale, boolean inStock, double weight) {
    this.isOnSale = isOnSale;
    this.inStock = inStock;
    this.weight = weight;
  }

  // Getters and setters
  public boolean getIsOnSale() {
    return isOnSale;
  }

  public void setIsOnSale(boolean isOnSale) {
    this.isOnSale = isOnSale;
  }

  public boolean getInStock() {
    return inStock;
  }

  public void setInStock(boolean inStock) {
    this.inStock = inStock;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // toString
  public String toString() {
    return "[On Sale: " + isOnSale + ", In Stock: " + inStock + ", Weight: " + weight + " g]";
  }
}
