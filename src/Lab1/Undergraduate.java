package Lab1;

public class Undergraduate extends Student {

    public Undergraduate(String regNo, String fullName, String email) {
        super(regNo, fullName, email);
    }

    public Undergraduate(int id, String regNo, String fullName, String email, double gpa) {
        super(id, regNo, fullName, email, gpa);
    }

    @Override
    public double calculateGPA() {
        return gpa; // Lab 1.2 polymorphism
    }
}