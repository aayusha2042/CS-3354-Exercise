/**
 * Represents a university student.
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
     * Creates a Student object.
     *
     * @param id the student's ID
     * @param name the student's name
     * @param major the student's major
     * @param gpa the student's GPA
     */
    public Student(int id, String name, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    /**
     * Returns the student ID.
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
     * Changes the student's major.
     *
     * @param major the new major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Changes the student's GPA.
     *
     * @param gpa the new GPA
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Compares students by name for natural ordering.
     *
     * @param other the student to compare with
     * @return a negative, zero, or positive value based on name comparison
     */
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    /**
     * Checks whether two Student objects have the same student ID.
     *
     * @param obj the object being compared
     * @return true if both students have the same ID, otherwise false
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.id == other.id;
        }

        return false;
    }

    /**
     * Returns a hash code based on the student ID.
     *
     * @return the student's ID as the hash code
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    /**
     * Returns the student information as a String.
     *
     * @return student information
     */
    @Override
    public String toString() {
        return "Student[id=" + id
                + ", name=" + name
                + ", major=" + major
                + ", gpa=" + gpa + "]";
    }
}