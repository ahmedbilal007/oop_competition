public class Prescription {

    private int id;
    private PrescriptionStatus status;

    public Prescription(
            int id,
            PrescriptionStatus status
    ) {
        this.id = id;
        this.status = status;
    }

    public boolean isValid() {
        return status == PrescriptionStatus.VALID;
    }

    public int getId() {
        return id;
    }

    public PrescriptionStatus getStatus() {
        return status;
    }
}
