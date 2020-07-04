public class SimpleNameToFullNameAdapter implements FullNameInterface {
    private SimpleName name;
    private String firstName;
    private String lastName;

    public SimpleNameToFullNameAdapter(SimpleName name) {
        this.name = name;
        firstName = name.getName().split(" ")[0];
        lastName = name.getName().split(" ")[1];
    }

    public void setFirstName(String f) {
        this.firstName = f;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String l) {
        this.lastName = l;
    }

    public String getLastName() {
        return lastName;
    }
}