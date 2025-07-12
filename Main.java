import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,course;
        int age ,rollNum;
        double GPA;
        int choice;
        int searchRoll,updateChoice;
        boolean isTrue = true;
        StudentManager studentManager = new StudentManager();
        Student std1;
        while (isTrue){
            System.out.println("""
                    Welcome to Student Management System

                    1) Add Student

                    2) View All Students

                    3) Search Student by Roll No

                    4) Update Student

                    5) Delete Student

                    6) Exit
                    """);
            System.out.print("Enter Choices : ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                System.out.println("Enter Details : ");
                System.out.print("Name : ");
                name = sc.nextLine();
                System.out.print("Age : ");
                age = sc.nextInt();
                System.out.print("Roll Number : ");
                rollNum = sc.nextInt();
                sc.nextLine();
                System.out.print("Course : ");
                course = sc.nextLine();
                System.out.print("GPA : ");
                GPA = sc.nextDouble();
                sc.nextLine();
                std1 = new Student(name,age,rollNum,course,GPA);
                studentManager.addStudent(std1);
            } else if (choice == 2){
                studentManager.viewStudent();
            } else if (choice == 3) {
                System.out.print("Write roll number of student whom you want to search : ");
                searchRoll = sc.nextInt();
                studentManager.searchStudent(searchRoll);
            } else if (choice == 4) {
                System.out.print("Write roll number of student whom details you want to update : ");
                searchRoll = sc.nextInt();
                System.out.print("What details you want to update : " +
                        "1)\nName" +
                        "2)\nAge" +
                        "3)\nCourse" +
                        "4)\nGPA");
                updateChoice = sc.nextInt();
                sc.nextLine();
                studentManager.updateStudent(searchRoll,updateChoice,sc);
            } else if (choice == 5) {
                System.out.print("Write roll number of student whom you want to delete from the list : ");
                searchRoll = sc.nextInt();
                studentManager.deleteStudent(searchRoll);
            } else{
                System.out.println("Exit");
                isTrue = false;
            }
        }
    }
}