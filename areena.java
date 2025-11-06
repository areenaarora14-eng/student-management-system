// Class definition
class Student {
    // Data members (attributes)
    int id;
    String name;
    String course;
    int marks;

    // Default constructor
    Student() {
        // Assigning default values
        id = 0;
        name = "Unknown";
        course = "None";
        marks = 0;
    }

    // Parameterized constructor
    Student(int id, String name, String course, int marks) {
        this.id = id;           // 'this' keyword refers to current object
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    // Method overloading - displayDetails() without parameters
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("---------------------------");
    }

    // Method overloading - displayDetails() with course parameter
    void displayDetails(String course) {
        if (this.course.equalsIgnoreCase(course)) {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Course: " + this.course);
            System.out.println("Marks: " + marks);
            System.out.println("---------------------------");
        }
    }
}

// Main class
public class StudentManagementSystem {
    public static void main(String[] args) {
        // Creating student objects

        // Using default constructor
        Student student1 = new Student();

        // Using parameterized constructor
        Student student2 = new Student(101, "Rahul", "Java", 85);
        Student student3 = new Student(102, "Anjali", "Python", 92);
        Student student4 = new Student(103, "Amit", "Java", 78);

        System.out.println("Displaying all student details:\n");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();

        System.out.println("Displaying students enrolled in Java:\n");
        student1.displayDetails("Java");
        student2.displayDetails("Java");
        student3.displayDetails("Java");
        student4.displayDetails("Java");
    }
}