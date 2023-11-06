package order_management_system;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;

/**
 * The Delivery class represents a delivery of items in the inventory management system.
 * It includes information such as item reference, delivery date, and quantity of items delivered.
 * The class provides methods to retrieve and modify these attributes, allowing for proper
 * management of item deliveries within the system.
 */

public class Delivery {

    private Item itemRef;
    private LocalDate date;
    private int quantity;

    /**
     * Default constructor initializes delivery attributes with default values.
     * The item reference is set to "Unknown," the delivery date is set to the current date,
     * and the quantity is set to 0.
     */

    public Delivery(){
        itemRef = null;
        this.date = LocalDate.now();
        quantity = 0;
    }

    /**
     * Parameterized constructor initializes delivery attributes with specified values.
     *
     * @param itemRef The reference code of the item being delivered.
     * @param date    The date of the delivery.
     * @param quantity The quantity of items delivered.
     */

    public Delivery(Item itemRef, LocalDate date, int quantity){
        this.quantity = quantity;
        this.date = date;
        this.itemRef = itemRef;
    }

    /**
     * Gets the item reference of the delivery.
     *
     * @return The item reference of the delivery.
     */

    public Item getItemRef() {
        return itemRef;
    }

    /**
     * Gets the date of the delivery.
     *
     * @return The date of the delivery.
     */

    public LocalDate getDate() {
        return date;
    }

    /**
     * Gets the quantity of items delivered.
     *
     * @return The quantity of items delivered.
     */

    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the item reference of the delivery.
     *
     * @param itemRef The new item reference for the delivery.
     * @return True if the item reference is successfully updated, false otherwise.
     */

    public boolean setItemRef(Item itemRef) {
        this.itemRef = itemRef;
        return true;
    }

    /**
     * Sets the delivery date.
     *
     * @param date The new delivery date.
     * @return True if the date is successfully updated, false otherwise.
     */

    public boolean setDate(LocalDate date) {
        this.date = date;
        return true;
    }

    /**
     * Sets the quantity of items delivered.
     *
     * @param quantity The new quantity of items delivered.
     * @return True if the quantity is successfully updated, false otherwise.
     */

    public boolean setQuantity(int quantity) {
        this.quantity = quantity;
        return true;
    }

    /**
     * Calculates the total cost of the delivery based on the given unit cost price.
     *
     * @param unitCostPrice The unit cost price of the item being delivered.
     * @return The total cost of the delivery.
     */

    public double calculateDeliveryCost(double unitCostPrice){
        return quantity * unitCostPrice;
    }

    /**
     * Overrides the toString() method to provide a string representation of the delivery object.
     * The representation includes all delivery attributes.
     *
     * @return A string representation of the delivery object.
     */

    @Override
    public String toString() {
        return "Delivery{" + "itemRef=" + itemRef + ", date=" + date + ", quantity=" + quantity + '}';
    }

    
}
