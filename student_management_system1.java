
class Student {
    int id;
    String name;
    String course;
    int marks;

    Student() {
        id = 0;
        name = "Unknown";
        course = "None";
        marks = 0;
    }
     Student(int id, String name, String course, int marks) {
        this.id = id;          
        this.name = name;
        this.course = course;
        this.marks = marks;
    }
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
       
    }
    void displayDetails(String course) {
        if (this.course.equalsIgnoreCase(course)) {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Course: " + this.course);
            System.out.println("Marks: " + marks);
      
        }
    }
}
    class StudentManagementSystem {
    public static void main(String[] args) 
    {
        Student student1 = new Student();
        Student student2 = new Student(1, "areena", "Java", 85);
        Student student3 = new Student(2, "yukti", "Python", 92);
        Student student4 = new Student(3, "priya", "Java", 78);

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