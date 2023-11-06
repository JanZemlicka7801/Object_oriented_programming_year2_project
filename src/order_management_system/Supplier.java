package order_management_system;

//@autor - Jan Zemlicka

/**
 * The Supplier class represents a supplier in the order management system.
 * It stores information about the supplier including name, address, amount owed, and credit limit.
 */
public class Supplier {
    private String supplierName;
    private String supplierAddress;
    private float amountOwed;
    private float creditLimit;

    /**
     * Default constructor initializes supplier with unknown name, unknown address,
     * zero amount owed, and zero credit limit.
     */
    public Supplier(){
        supplierName = "Unknown";
        supplierAddress = "Unknown";
        amountOwed = 0;
        creditLimit = 0;
    }

    /**
     * Parameterized constructor initializes supplier with specified name, address,
     * amount owed, and credit limit.
     *
     * @param Name     The name of the supplier.
     * @param Address  The address of the supplier.
     * @param Owed     The amount owed to the supplier.
     * @param Limit    The credit limit for the supplier.
     */
    public Supplier(String Name, String Address, float Owed, float Limit){
        this.supplierName = Name;
        this.supplierAddress = Address;
        this.amountOwed = Owed;
        this.creditLimit = Limit;
    }

    /**
     * Sets the name of the supplier.
     *
     * @param Name The new name of the supplier.
     * @return True if the name is successfully set, false otherwise.
     */
    public boolean setSupplierName(String Name){
        return !Name.equalsIgnoreCase(this.supplierName);
    }

    /**
     * Sets the address of the supplier.
     *
     * @param Address The new address of the supplier.
     * @return True if the address is successfully set, false otherwise.
     */
    public boolean setSupplierAddress(String Address){
        return !Address.equalsIgnoreCase(this.supplierAddress);
    }

    /**
     * Sets the amount owed to the supplier.
     *
     * @param amountOwed The new amount owed to the supplier.
     * @return True if the amount owed is non-negative and successfully set, false otherwise.
     */
    public boolean setAmountOwed(float amountOwed) {
        if ((amountOwed >= 0) && (amountOwed != this.amountOwed)) {
            this.amountOwed = amountOwed;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets the credit limit for the supplier.
     *
     * @param creditLimit The new credit limit for the supplier.
     * @return True if the credit limit is non-negative and successfully set, false otherwise.
     */
    public boolean setCreditLimit(float creditLimit) {
        if ((creditLimit >= 0) && (creditLimit != this.creditLimit)) {
            this.creditLimit = creditLimit;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gets the name of the supplier.
     *
     * @return The name of the supplier.
     */
    public String getSupplierName(){
        return this.supplierName;
    }

    /**
     * Gets the address of the supplier.
     *
     * @return The address of the supplier.
     */
    public String getSupplierAddress(){
        return this.supplierAddress;
    }

    /**
     * Gets the amount owed to the supplier.
     *
     * @return The amount owed to the supplier.
     */
    public float getAmountOwed(){
        return this.amountOwed;
    }

    /**
     * Gets the credit limit for the supplier.
     *
     * @return The credit limit for the supplier.
     */
    public float getCreditLimit(){
        return this.creditLimit;
    }

    /**
     * Increases the amount owed to the supplier by a specified amount.
     *
     * @param amount The amount to increase the owed amount.
     */
    public void increaseAmountOwed(float amount){
        this.amountOwed += amount;
    }

    /**
     * Decreases the amount owed to the supplier by a specified amount.
     *
     * @param amount The amount to decrease the owed amount.
     */
    public void decreaseAmountOwed(float amount){
        this.amountOwed -= amount;
    }

    /**
     * Overrides the toString() method to provide a string representation of the Supplier object.
     *
     * @return A string representation of the Supplier object including name, address, amount owed, and credit limit.
     */
    @Override
    public String toString() {
        return "Supplier: " + supplierName + ", Address: " + supplierAddress + ", Amount Owed: " + amountOwed + ", Credit Limit: " + creditLimit;
    }
}

