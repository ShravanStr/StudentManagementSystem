import java.util.ArrayList;
import java.util.Scanner;

class StudentManager{
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void viewStudent(){
        if(students.isEmpty()){
            System.out.println("No data found!!");
        }
        for(Student student : students){
            System.out.println(student);
        }
    }

    public void updateStudent(int rollNumber, int updateChoice, Scanner sc){
        if(students.isEmpty()){
            System.out.println("No data found");
        }
        for(Student student : students){
            if(student.getRollNumber() == rollNumber){
                switch (updateChoice){
                    case 1 :
                        System.out.print("Enter new name : ");
                        String newName = sc.nextLine();
                        student.setName(newName);
                        break;
                    case 2 :
                        System.out.print("Enter new age : ");
                        int newAge = sc.nextInt();
                        student.setAge(newAge);
                        sc.nextLine();
                        break;
                    case 3 :
                        System.out.print("Enter new course : ");
                        String newCourse = sc.nextLine();
                        student.setCourse(newCourse);
                        break;
                    case 4 :
                        System.out.print("Enter new GPA : ");
                        double newGPA = sc.nextDouble();
                        student.setGPA(newGPA);
                        sc.nextLine();
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
                System.out.println("Student updated.");
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public void deleteStudent(int rollNumber){
        if(students.isEmpty()){
            System.out.println("No data found");
        }
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRollNumber() == rollNumber){
                System.out.println("--------------------------------------------------");
                students.remove(i);
                System.out.println("Student with roll number " + rollNumber + " deleted.");
                System.out.println("--------------------------------------------------");
                return; // immediately exit the method after the student is found and deleted.
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public void searchStudent(int rollNumber){
        if(students.isEmpty()){
            System.out.println("No data found");
        }
        for(Student student : students){
            if(student.getRollNumber() == rollNumber){
                System.out.println("--------------------------------------------------");
                student.displayDetails();
                System.out.println("--------------------------------------------------");
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

}