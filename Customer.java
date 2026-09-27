public class Customer extends User {

    public Customer(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
    }

    public Sale purchaseMedicine(
            Medicine medicine,
            int quantity,
            Pharmacist pharmacist
    ) throws InvalidMedicineException {

        return processPurchase(medicine, quantity, pharmacist, null);
    }

    public Sale purchaseMedicine(
            Medicine medicine,
            int quantity,
            Pharmacist pharmacist,
            Prescription prescription
    ) throws InvalidMedicineException {

        return processPurchase(
                medicine,
                quantity,
                pharmacist,
                prescription
        );
    }

    private Sale processPurchase(
            Medicine medicine,
            int quantity,
            Pharmacist pharmacist,
            Prescription prescription
    ) throws InvalidMedicineException {

        if (medicine == null) {
            throw new InvalidMedicineException(
                    "Medicine cannot be null."
            );
        }

        if (pharmacist == null) {
            throw new InvalidMedicineException(
                    "Pharmacist cannot be null."
            );
        }

        if (quantity <= 0) {
            throw new InvalidMedicineException(
                    "Quantity must be greater than zero."
            );
        }

        if (medicine.getPrice() <= 0) {
            throw new InvalidMedicineException(
                    "Invalid medicine price."
            );
        }

        if (medicine.getQuantity() < quantity) {
            throw new InvalidMedicineException(
                    "Insufficient medicine quantity."
            );
        }

        if (medicine.isPrescriptionRequired()) {

            if (prescription == null) {
                throw new InvalidMedicineException(
                        "A valid prescription is required."
                );
            }

            if (!prescription.isValid()) {
                throw new InvalidMedicineException(
                        "Prescription is not valid."
                );
            }
        }

        medicine.setQuantity(
                medicine.getQuantity() - quantity
        );

        return new Sale(
                this,
                pharmacist,
                medicine,
                quantity,
                SaleStatus.COMPLETED
        );
    }
}
