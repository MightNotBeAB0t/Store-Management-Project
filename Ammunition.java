public class Ammunition extends PatAirsoft {

  private boolean isTracer;
  private boolean isBiodegradable;

  public Ammunition() {
    super();
    isTracer = false;
    isBiodegradable = false;
  }

  public Ammunition(boolean isTracer, boolean isBiodegradable, boolean isOnSale, boolean inStock, double weight) {
    super(isOnSale, inStock, weight);
    this.isTracer = isTracer;
    this.isBiodegradable = isBiodegradable;
  }

  public boolean getIsTracer() {
    return isTracer;
  }

  public void setIsTracer(boolean isTracer) {
    this.isTracer = isTracer;
  }

  public boolean getIsBiodegradable() {
    return isBiodegradable;
  }

  public void setIsBiodegradable(boolean isBiodegradable) {
    this.isBiodegradable = isBiodegradable;
  }

  public String toString() {
    return "Ammunition [Tracer: " + isTracer + ", Biodegradable: " + isBiodegradable + ", On Sale: " + getIsOnSale() + ", In Stock: " + getInStock() + ", Weight: " + getWeight() + " g]";
  }
}
