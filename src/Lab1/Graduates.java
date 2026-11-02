package Lab1;

public class Graduates extends Student {
    public Graduates(String regNo, String fullName, String email) {
        super(regNo, fullName, email);
    }
    public Graduates(int id, String regNo, String fullName, String email, double gpa) {
        super(id, regNo, fullName, email, gpa);
    }
    @Override
    public double calculateGPA() {
        return gpa * 1.1; // graduate gets bonus for example
    }
}