public class Medicine implements Comparable<Medicine> {

    private int id;
    private String name;
    private double price;
    private int quantity;
    private MedicineType type;
    private boolean prescriptionRequired;
    private Supplier supplier;

    public Medicine(
            int id,
            String name,
            double price,
            int quantity,
            MedicineType type,
            boolean prescriptionRequired,
            Supplier supplier
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
        this.prescriptionRequired = prescriptionRequired;
        this.supplier = supplier;
    }

    public void displayInfo() {
        System.out.println("\n----- Medicine Information -----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Type: " + type);
        System.out.println(
                "Prescription Required: "
                        + prescriptionRequired
        );

        if (supplier != null) {
            System.out.println(
                    "Supplier: " + supplier.getName()
            );
            System.out.println(
                    "Supplier Address: "
                            + supplier.getAddress()
            );
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public MedicineType getType() {
        return type;
    }

    public boolean isPrescriptionRequired() {
        return prescriptionRequired;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
