public class Pharmacist extends User {

    private String license;

    public Pharmacist(
            int id,
            String name,
            String license
    ) {
        super(id, name);
        this.license = license;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pharmacist ID: " + id);
        System.out.println("Pharmacist Name: " + name);
        System.out.println("License: " + license);
    }

    public String getLicense() {
        return license;
    }
}
