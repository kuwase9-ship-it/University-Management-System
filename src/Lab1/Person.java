package Lab1;

public abstract class Person {
    protected String fullName;
    protected String email;
    public Person(String fullName, String email) {
        this.fullName = fullName; this.email = email;
    }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public abstract String getRole();
}
