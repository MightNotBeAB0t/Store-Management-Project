public class StoreRunner {
  public static void main(String[] args) {

    // Customer 1: Bought an Airsoft Gun
    AirsoftGuns Customer1 = new AirsoftGuns(true, "Black", true, true, 3200.0);

    // Customer 2: Bought Ammunition
    Ammunition Customer2 = new Ammunition(false, true, false, true, 0.25);

    //Prints out the orders
    System.out.println("Customer Orders:\n");

    System.out.println("Customer Order #1:");
    System.out.println(Customer1);

    System.out.println("\nCustomer Order #2:");
    System.out.println(Customer2);

    System.out.println("\nThank you for shopping at Pat's Airsoft Store!!");
  }
}
