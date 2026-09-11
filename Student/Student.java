//Class that works as blueprint for creating Student objects.
public class Student {

  // Variables to store information for each student.
  private String firstName;
  private String lastName;
  private String major;
  private double gpa;

  // To set  the student's first name.
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  // This returns the student's first name.
  public String getFirstName() {
    return firstName;
  }

  // To set the student's last name.
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // This returns the student's last name.
  public String getLastName() {
    return lastName;
  }

  // To set the student's major.
  public void setMajor(String major) {
    this.major = major;
  }

  // This returns the student's major.
  public String getMajor() {
    return major;
  }

  // To set the student's GPA.
  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  // This returns the student's GPA.
  public double getGpa() {
    return gpa;
  }

  // Default constructor.
  public Student() {
    this("", "", "", 0.0);
  }

  // Parameterized constructor.
  public Student(String firstName, String lastName, String major, double gpa) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.major = major;
    this.gpa = gpa;
  }

  public static void main(String[] args) {

    // student1 uses the default constructor.
    Student student1 = new Student();

    System.out.println("=== Student 1 ===");
    System.out.println("First name: " + student1.getFirstName());
    System.out.println("Last name: " + student1.getLastName());
    System.out.println("Major: " + student1.getMajor());
    System.out.println("GPA: " + student1.getGpa());

    // student2 uses the parameterized constructor.
    Student student2 = new Student("Peter", "Parker", "CS", 3.5);

    System.out.println("\n=== Student 2 ===");
    System.out.println("First name: " + student2.getFirstName());
    System.out.println("Last name: " + student2.getLastName());
    System.out.println("Major: " + student2.getMajor());
    System.out.println("GPA: " + student2.getGpa());

    // student3 uses my own values.
    Student student3 =
        new Student("Aayusha", "Adhikari", "Computer Science", 3.77);

    System.out.println("\n=== Student 3 ===");
    System.out.println("First name: " + student3.getFirstName());
    System.out.println("Last name: " + student3.getLastName());
    System.out.println("Major: " + student3.getMajor());
    System.out.println("GPA: " + student3.getGpa());

    // This setter changes student3's major.
    student3.setMajor("Data Science");

    System.out.println("\n=== Student 3 After Update ===");
    System.out.println("Updated major: " + student3.getMajor());
  }
}