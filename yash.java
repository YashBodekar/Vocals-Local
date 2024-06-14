import java.util.Scanner;

class Course {
    private int courseId;
    private String courseName;
    private int courseCount = 0;
    private Course[] courses;

    public Course() {
        courses = new Course[100]; // Assuming a maximum of 100 courses
    }

    public void addCourse(int courseId, String courseName) {
        courses[courseCount++] = new Course(courseId, courseName);
        System.out.println("Course added: " + courseName);
    }

    public void listCourses() {
        System.out.println("List of Courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].getCourseId() + " - " + courses[i].getCourseName());
        }
    }

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private int studentCount = 0;
    private Student[] students;

    public Student() {
        students = new Student[100]; // Assuming a maximum of 100 students
    }

    public void addStudent(int studentId, String studentName) {
        students[studentCount++] = new Student(studentId, studentName);
        System.out.println("Student added: " + studentName);
    }

    public void listStudents() {
        System.out.println("List of Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getStudentId() + " - " + students[i].getStudentName());
        }
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

public class yash {
    public static void main(String[] args) {
        System.out.println("**WELCOME TO VIDYALANKAR POLYTECHNIC**");
        Scanner scanner = new Scanner(System.in);
        Course course = new Course();
        Student student = new Student();
        char option, ch;

        do {
            System.out.println("**Menu***");
            System.out.println("1 => Add Students");
            System.out.println("2 => List Students");
            System.out.println("3 => Add Course");
            System.out.println("4 => List Courses");
            System.out.println("5 => Exit");
            System.out.println("********");
            option = scanner.next().charAt(0);

            switch(option) {
                case '1':
                     System.out.println("Enter Student ID:");
                    int studentId = scanner.nextInt();
                    System.out.println("Enter Student Name:");
                    String studentName = scanner.next();
                    student.addStudent(studentId, studentName);
                    break;
                case '2':
                    student.listStudents();
                    break;
                case '3':
                   
System.out.println("Enter Course ID:");
                    int courseId = scanner.nextInt();
                    System.out.println("Enter Course Name:");
                    String courseName = scanner.next();
                    course.addCourse(courseId, courseName);
                    break;
                case '4':
                   course.listCourses();
                    break;
                case '5':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option");
            }

            System.out.println("\nDo you want to continue? (y/n)");
            ch = scanner.next().charAt(0);
        } while(ch != 'n');
    }
}