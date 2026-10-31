package Lab1;
public class Course {
    private int id; private String code; private String title; private int credits;
    public Course(int id, String code, String title, int credits) {
        this.id=id; this.code=code; this.title=title; this.credits=credits;
    }
    public Course(String code, String title, int credits) { this(0, code, title, credits); }
    public int getId() { return id; } public String getCode() { return code; }
    public String getTitle() { return title; }
    @Override public String toString() { return code + " - " + title + " ("+credits+"cr)"; }
}
