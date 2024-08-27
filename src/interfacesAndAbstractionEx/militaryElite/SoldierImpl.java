package interfacesAndAbstractionEx.militaryElite;

public abstract class SoldierImpl implements Soldier{
    private int id;
    private String firstName;
    private String lastName;

    public SoldierImpl(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
