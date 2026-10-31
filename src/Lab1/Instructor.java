package Lab1;
public class Instructor extends Person {
    private String staffId; private String department;
    public Instructor(String staffId, String fullName, String email, String department) {
        super(fullName, email); this.staffId=staffId; this.department=department;
    }
    @Override public String getRole() { return "Instructor"; }
    @Override public String toString() { return staffId + " | " + fullName + " | " + department; }
}
