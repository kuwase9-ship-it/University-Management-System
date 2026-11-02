package Lab1;

public abstract class Student extends Person {
    protected int id;
    protected String regNo;
    protected double gpa;
    public Student(int id, String regNo, String fullName, String email, double gpa) {
        super(fullName, email); this.id=id; this.regNo=regNo; this.gpa=gpa;
    }
    public Student(String regNo, String fullName, String email) {
        super(fullName, email); this.regNo=regNo;
    }
    public abstract double calculateGPA(); // Lab 1.2 polymorphism
    public String getRegNo() { return regNo; }
    public int getId() { return id; }
    @Override public String toString() {
        return String.format("%s [%s] - %s - GPA: %.2f", fullName, regNo, email, calculateGPA());
    }
    @Override public String getRole() { return "Student"; }
}
