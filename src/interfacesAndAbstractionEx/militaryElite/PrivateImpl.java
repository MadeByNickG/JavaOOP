package interfacesAndAbstractionEx.militaryElite;

public class PrivateImpl extends SoldierImpl {
    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getFirstName() {
        return "";
    }

    @Override
    public String getLastName() {
        return "";
    }
}
