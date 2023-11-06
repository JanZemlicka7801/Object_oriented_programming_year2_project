package order_management_system;

import java.time.LocalDate;

/**
 * Version1App class demonstrates an order management system where suppliers provide items,
 * deliveries are made, and the amounts owed to suppliers and stock quantities are updated accordingly.
 */
public class Version1App {
    /**
     * Main method of the Version1App class.
     * Initializes suppliers, items, and deliveries, updates amounts owed and stock quantities,
     * and displays relevant information.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
    //Supplier objects
    Supplier s1 = new Supplier("SUPP111", "A91N4V8", 850, 3000);
    Supplier s2 = new Supplier("SUPP893", "A87E7Z9", 500, 3000);
    Supplier s3 = new Supplier("SUPP150", "A93Q7S1", 725,3000);
    Supplier s4 = new Supplier("SUPP999", "A97I8U9", 999,3000);
    Supplier s5 = new Supplier("SUPP001", "A91A1S1", 1078,3000);


    //Item objects
    Item i1 = new Item("Creatin", 100, 50, 100, 32.5, s3, false);
    Item i2 = new Item("Protein", 214, 25, 100, 27.85, s4, false);
    Item i3 = new Item("Pre-workout", 40, 20, 100, 56.20, s2, false);
    Item i4 = new Item("Vitamin D", 400, 50, 100, 11.75, s1, false);
    Item i5 = new Item("Vitamin E", 415, 50, 100, 19.90, s5, false);

    //Delivery objects
    Delivery d1 = new Delivery(i3, LocalDate.now(),71);
    Delivery d2 = new Delivery(i4, LocalDate.now(),150);
    Delivery d3 = new Delivery(i1, LocalDate.now(), 600);

    // Display amounts owed before delivery to suppliers
    System.out.println("Amount owed before delivery to 3 suppliers: SUPP111 " + s1.getAmountOwed() + ", SUPP893 " + s2.getAmountOwed() + ", SUPP150 " + s3.getAmountOwed() + " .");

    //When an item is delivered the quantityInStock and amount owed fields should be updated
    i3.increaseQuantityInStock(d1.getQuantity());
    i4.increaseQuantityInStock(d2.getQuantity());
    i1.increaseQuantityInStock(d3.getQuantity());

    s1.increaseAmountOwed((float) (d2.getQuantity()*i4.getUnitCostPrice()));
    s3.increaseAmountOwed((float) (d3.getQuantity()*i1.getUnitCostPrice()));
    s2.increaseAmountOwed((float) (d1.getQuantity()*i3.getUnitCostPrice()));


    // Display amounts owed after delivery to suppliers
    System.out.println("Amount owed after delivery to 3 suppliers: SUPP111 " + s1.getAmountOwed() + ", SUPP893 " + s2.getAmountOwed() + ", SUPP150 " + s3.getAmountOwed() + " .");

    //Display the cost of d1.
    System.out.println(d1.calculateDeliveryCost(56.20));
    }
}
