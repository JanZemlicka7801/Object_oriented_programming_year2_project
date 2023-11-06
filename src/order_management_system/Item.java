package order_management_system;

import java.util.ArrayList;
import java.util.Random;

//@autor - Jan Zemlicka

/**
 * The Item class represents a product in the inventory management system.
 * It encapsulates information such as item name, unique ID, quantity in stock, reorder level,
 * reorder quantity, unit cost price, supplier reference, and order flag.
 */
public class Item {
    private String itemName;
    private int uniqueId;
    private int quantityInStock;
    private int reorderLevel;
    private int reOrderQuantity;
    private double unitCostPrice;
    private Supplier supplierRef;
    private boolean onOrderFlag;

    /**
     * Default constructor initializes item attributes with default values.
     */

    private static ArrayList<Integer> idCount = new ArrayList<>();
    public Item(){
        Random rc = new Random();
        int num;
        itemName = "Unknown";
        quantityInStock = 0;
        reorderLevel = 0;
        reOrderQuantity = 0;
        unitCostPrice = 0;
        supplierRef = null;
        onOrderFlag = false;
        do {
            num = rc.nextInt(0,Integer.MAX_VALUE);
        } while (idCount.contains(num));
        this.uniqueId = num;
        idCount.add(num);
    }

    /**
     * Parameterized constructor initializes item attributes with specified values.
     *
     * @param name           The name of the item.
     * @param stock          The quantity of the item in stock.
     * @param level          The reorder level of the item.
     * @param quantity       The reorder quantity of the item.
     * @param price          The unit cost price of the item.
     * @param ref            The supplier reference of the item.
     * @param flag           The order flag indicating if the item is on order.
     */

    public Item(String name, int stock, int level, int quantity, double price, Supplier ref, boolean flag){
        Random rc = new Random();
        this.itemName = name;
        this.quantityInStock = stock;
        this.reorderLevel = level;
        this.reOrderQuantity = quantity;
        this.unitCostPrice = price;
        this.supplierRef = ref;
        this.onOrderFlag = flag;
        int num;
        do {
            num = rc.nextInt(0,Integer.MAX_VALUE);
        } while (idCount.contains(num));
        this.uniqueId = num;
        idCount.add(num);
    }

    /**
     * Gets the name of the item.
     *
     * @return The name of the item.
     */

    public String getItemName() {
        return itemName;
    }

    /**
     * Gets the unique id of the item.
     *
     * @return The unique id of the item.
     */

    public int getUniqueId() {
        return uniqueId;
    }

    /**
     * Gets the quantity in stock of the item.
     *
     * @return The quantity in stock of the item.
     */
    public int getQuantityInStock() {
        return quantityInStock;
    }

    /**
     * Gets the reorder level of the item.
     *
     * @return The reorder level of the item.
     */
    public int getReorderLevel() {
        return reorderLevel;
    }

    /**
     * Gets the reorder quantity of the item.
     *
     * @return The reorder quantity of the item.
     */
    public int getReOrderQuantity() {
        return reOrderQuantity;
    }

    /**
     * Gets the cost price per unit of the item.
     *
     * @return The cost price per unit of the item.
     */
    public double getUnitCostPrice() {
        return unitCostPrice;
    }

    /**
     * Gets the supplier reference of the item.
     *
     * @return The supplier reference of the item.
     */
    public Supplier getSupplierRef() {
        return supplierRef;
    }

    /**
     * Checks if the item is on order.
     *
     * @return True if the item is on order, false otherwise.
     */
    public boolean isOnOrderFlag() {
        return onOrderFlag;
    }


    /**
     * Sets the item name if it is different from the current name.
     *
     * @param itemName The new name for the item.
     * @return True if the name is successfully updated, false otherwise.
     */
    public boolean setItemName(String itemName) {
        if (!this.itemName.equalsIgnoreCase(itemName)) {
            this.itemName = itemName;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets the quantity in stock if it is different from the current quantity.
     *
     * @param quantityInStock The new quantity in stock for the item.
     * @return True if the quantity is successfully updated, false otherwise.
     */
    public boolean setQuantityInStock(int quantityInStock) {
        if (this.quantityInStock != quantityInStock) {
            this.quantityInStock = quantityInStock;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets the reorder level if the given level is non-negative and different from the current level.
     *
     * @param reorderLevel The new reorder level for the item.
     * @return True if the reorder level is successfully updated, false otherwise.
     */
    public boolean setReorderLevel(int reorderLevel) {
        if (reorderLevel >= 0 && reorderLevel != this.reorderLevel) {
            this.reorderLevel = reorderLevel;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets the reorder quantity if the given quantity is non-negative and different from the current quantity.
     *
     * @param reOrderQuantity The new reorder quantity for the item.
     * @return True if the reorder quantity is successfully updated, false otherwise.
     */
    public boolean setReOrderQuantity(int reOrderQuantity) {
        if (reOrderQuantity >= 0 && reOrderQuantity != this.reOrderQuantity) {
            this.reOrderQuantity = reOrderQuantity;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets the unit cost price if it is positive and different from the current price.
     *
     * @param unitCostPrice The new unit cost price for the item.
     * @return True if the unit cost price is successfully updated, false otherwise.
     */
    public boolean setUnitCostPrice(double unitCostPrice) {
        if (unitCostPrice > 0 && unitCostPrice != this.unitCostPrice) {
            this.unitCostPrice = unitCostPrice;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets the supplier reference if it is different from the current reference, ignoring case.
     *
     * @param supplierRef The new supplier reference for the item.
     * @return True if the supplier reference is successfully updated, false otherwise.
     */
    public boolean setSupplierRef(Supplier supplierRef) {
        if (!supplierRef.equals(this.supplierRef)) {
            this.supplierRef = supplierRef;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets the on-order flag if it is different from the current flag.
     *
     * @param onOrderFlag The new on-order flag for the item.
     * @return True if the on-order flag is successfully updated, false otherwise.
     */
    public boolean setOnOrderFlag(boolean onOrderFlag) {
        if (this.onOrderFlag != onOrderFlag) {
            this.onOrderFlag = onOrderFlag;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Increases the quantity in stock by the given amount if the amount is non-negative.
     *
     * @param quantity The quantity to increase by.
     * @return True if the quantity is successfully increased, false otherwise.
     */
    public boolean increaseQuantityInStock(int quantity) {
        if (quantity >= 0) {
            this.quantityInStock += quantity;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Decreases the quantity in stock by the given amount if the amount is non-negative and
     * does not exceed the current quantity in stock.
     *
     * @param quantity The quantity to decrease by.
     * @return True if the quantity is successfully decreased, false otherwise.
     */
    public boolean decreaseQuantityInStock(int quantity) {
        if (quantity >= 0 && this.quantityInStock >= quantity) {
            this.quantityInStock -= quantity;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Overrides the toString() method to provide a string representation of the item object.
     *
     * @return A string representation of the item including all its attributes.
     */

    @Override
    public String toString() {
        return "Item{" + "itemName=" + itemName + ", uniqueId=" + uniqueId + ", quantityInStock=" + quantityInStock + ", reorderLevel=" + reorderLevel + ", reOrderQuantity=" + reOrderQuantity + ", unitCostPrice=" + unitCostPrice + ", supplierRef=" + supplierRef + ", onOrderFlag=" + onOrderFlag + ", idCount=" + idCount + '}';
    }
    
}
