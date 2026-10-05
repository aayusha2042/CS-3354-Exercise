/**
 * Represents a university student.
 * Stores the student's identification number, name, major, and GPA.
 *
 * @author Aayusha Adhikari
 * @version 1.0
 */
public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private String major;
    private double gpa;

    /**
     * Constructs a Student with the given profile information.
     *
     * @param id the student's unique ID
     * @param name the student's full name
     * @param major the student's academic major
     * @param gpa the student's grade point average
     */
    public Student(int id, String name, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    /**
     * Returns the student's ID.
     *
     * @return the student ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the student's name.
     *
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the student's major.
     *
     * @return the student's major
     */
    public String getMajor() {
        return major;
    }

    /**
     * Returns the student's GPA.
     *
     * @return the student's GPA
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Updates the student's major.
     *
     * @param major the new major to assign
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Updates the student's GPA.
     *
     * @param gpa the new GPA to assign
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Compares this student to another student by name.
     * This allows Java to sort students alphabetically by name.
     *
     * @param other the student to compare against
     * @return a negative value if this student comes before the other,
     *         zero if they are equal in name, or a positive value otherwise
     */
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    /**
     * Compares this student to another object based on ID.
     * Students are considered equal if they have the same ID.
     *
     * @param obj the object to compare with
     * @return true if the objects represent the same student, otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.id == other.id;
        }

        return false;
    }

    /**
     * Generates a hash code for this student based on the ID.
     *
     * @return the hash code for this student
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    /**
     * Returns a string representation of the student.
     *
     * @return the student's information as a formatted string
     */
    @Override
    public String toString() {
        return "Student[id=" + id
                + ", name=" + name
                + ", major=" + major
                + ", gpa=" + gpa + "]";
    }
}