public class Sale {

    private static int nextId = 1;

    private int id;
    private Customer customer;
    private Pharmacist pharmacist;
    private Medicine medicine;
    private int quantity;
    private SaleStatus status;

    public Sale(
            Customer customer,
            Pharmacist pharmacist,
            Medicine medicine,
            int quantity,
            SaleStatus status
    ) {
        this.id = nextId++;
        this.customer = customer;
        this.pharmacist = pharmacist;
        this.medicine = medicine;
        this.quantity = quantity;
        this.status = status;
    }

    public double getTotalAmount() {
        return medicine.getPrice() * quantity;
    }

    public void displayInfo() {
        System.out.println("\n----- Sale Information -----");
        System.out.println("Sale ID: " + id);
        System.out.println("Customer: " + customer.name);
        System.out.println("Pharmacist: " + pharmacist.name);
        System.out.println("Medicine: " + medicine.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println(
                "Price per Unit: " + medicine.getPrice()
        );
        System.out.println(
                "Total Amount: " + getTotalAmount()
        );
        System.out.println("Status: " + status);
    }

    public SaleStatus getStatus() {
        return status;
    }
}
