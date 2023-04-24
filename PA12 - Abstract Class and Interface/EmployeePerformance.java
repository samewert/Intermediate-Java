package PA12;

public class EmployeePerformance extends Employee {
    
    private static final long serialVersionUID = -4040427425598331466L;
    public int rating;
    
    public EmployeePerformance(String id, String name, int rating) {
        super(id, name);
        this.rating = rating;
    }
    
    public String toString() {
        return String.format("%s, %d", super.toString(), rating);
    }
}
