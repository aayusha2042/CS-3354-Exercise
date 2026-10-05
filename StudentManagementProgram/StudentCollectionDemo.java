import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Demonstrates Java Collections using Student objects.
 *
 * @author Aayusha Adhikari
 * @version 1.0
 */
public class StudentCollectionDemo {

    /**
     * Runs the Student Collection Management System.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println(
                "========== STUDENT COLLECTION MANAGEMENT SYSTEM ==========");

        // Create an ArrayList of students
        List<Student> students = new ArrayList<Student>();

        students.add(new Student(101, "Maya", "Computer Science", 3.8));
        students.add(new Student(102, "Daniel", "Biology", 2.3));
        students.add(new Student(103, "Sophia", "Business", 3.5));
        students.add(new Student(104, "Ethan", "Mathematics", 2.1));
        students.add(new Student(105, "Olivia", "Nursing", 3.9));
        students.add(new Student(106, "Noah", "Engineering", 3.2));

        System.out.println("\n1. Original Student List");

        for (Student student : students) {
            System.out.println(student);
        }
System.out.println("\n2. ArrayList Operations");

        Student newStudent = new Student(107, "Liam", "Chemistry", 3.4);
        students.add(newStudent);
        System.out.println("Added: " + newStudent);

        System.out.println("Student at index 0: " + students.get(0));

        Student replacementStudent =
                new Student(108, "Emma", "Psychology", 3.6);

        students.set(1, replacementStudent);
        System.out.println("Replaced student at index 1 with: "
                + replacementStudent);

        System.out.println("Contains Liam: "
                + students.contains(newStudent));

        System.out.println("Number of students: "
                + students.size());

        System.out.println("Is the list empty? "
                + students.isEmpty());

        Student removedStudent = students.remove(2);
        System.out.println("Removed: " + removedStudent);

        System.out.println("Number of students after removal: "
                + students.size());


// 3. For-Each Traversal
System.out.println("\n3. For-Each Traversal");

for (Student student : students) {
    System.out.println(student);
}

// 4. Iterator Traversal
System.out.println("\n4. Iterator Traversal");

Iterator<Student> iterator = students.iterator();

while (iterator.hasNext()) {
    System.out.println(iterator.next());
}

// 5. Lambda / forEach Traversal
System.out.println("\n5. Lambda / forEach Traversal");

students.forEach(s -> System.out.println(s));
  // 6. Students Sorted by Name
System.out.println("\n6. Students Sorted by Name");

Collections.sort(students);

for (Student student : students) {
    System.out.println(student);
}


// 7. Students Sorted by GPA
System.out.println("\n7. Students Sorted by GPA");

Comparator<Student> byGPA =
        (s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa());

Collections.sort(students, byGPA);

for (Student student : students) {
    System.out.println(student);
}


// 8. Students Sorted by ID
System.out.println("\n8. Students Sorted by ID");

Comparator<Student> byID =
        (s1, s2) -> Integer.compare(s1.getId(), s2.getId());

Collections.sort(students, byID);

for (Student student : students) {
    System.out.println(student);
}   
    // 9. Filtering Students Using Iterator
System.out.println("\n9. Filtering Students Using Iterator");

System.out.println("Before filtering:");
for (Student student : students) {
    System.out.println(student);
}

Iterator<Student> filterIterator = students.iterator();

while (filterIterator.hasNext()) {
    Student student = filterIterator.next();

    if (student.getGpa() < 2.5) {
        System.out.println("Removing: " + student);
        filterIterator.remove();
    }
}

System.out.println("After filtering:");
for (Student student : students) {
    System.out.println(student);
}


// 10. HashSet and Duplicate Student Test
System.out.println("\n10. HashSet and Duplicate Student Test");

Student duplicateStudent =
        new Student(101, "Alex", "History", 3.0);

// ArrayList allows both objects
List<Student> duplicateList = new ArrayList<Student>();

duplicateList.add(students.get(0));
duplicateList.add(duplicateStudent);

System.out.println("ArrayList with duplicate ID:");
for (Student student : duplicateList) {
    System.out.println(student);
}

System.out.println("ArrayList size: " + duplicateList.size());

// HashSet checks equals() and hashCode()
Set<Student> studentSet = new HashSet<Student>();

studentSet.add(students.get(0));

boolean addedDuplicate = studentSet.add(duplicateStudent);

System.out.println("\nTrying to add another student with ID 101...");
System.out.println("Was duplicate added to HashSet? " + addedDuplicate);
System.out.println("HashSet size: " + studentSet.size());

for (Student student : studentSet) {
    System.out.println(student);
}


// 11. LinkedList and TreeSet
System.out.println("\n11. LinkedList and TreeSet");

// LinkedList example
LinkedList<Student> linkedStudents =
        new LinkedList<Student>(students);

System.out.println("LinkedList:");
for (Student student : linkedStudents) {
    System.out.println(student);
}

Student firstStudent =
        new Student(109, "Ava", "Physics", 3.7);

linkedStudents.addFirst(firstStudent);

System.out.println("\nAfter adding a student to the beginning:");
for (Student student : linkedStudents) {
    System.out.println(student);
}

linkedStudents.removeFirst();

System.out.println("\nAfter removing the first student:");
for (Student student : linkedStudents) {
    System.out.println(student);
}


// TreeSet example
Set<Student> treeSet = new TreeSet<Student>();

treeSet.addAll(students);

System.out.println("\nTreeSet - Students Sorted by Name:");

for (Student student : treeSet) {
    System.out.println(student);
}

System.out.println(
        "\n========== END OF PROGRAM ==========");
    
    }// main ends here

} // class ends here


