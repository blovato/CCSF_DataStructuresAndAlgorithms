package module_11_hashing;


import java.util.Objects;

public class Student {

    private int id;
    private String firstName, lastName;
    private boolean paidFees;

    public Student(int id, String firstName, String lastName, boolean paidFees) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.paidFees = paidFees;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean hasPaidFees() {
        return paidFees;
    }

    public String toString() {
        return firstName + " " + lastName + " (ID: " + id + ")" + (paidFees ? "" : " (Fees Owed)");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student e = (Student) obj;
            return id == e.getId();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, paidFees);
    }

}
