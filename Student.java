class Student extends Person{
    private int rollNumber;
    private String course;
    private double GPA;

    Student(String name,int age,int rollNumber,String course,double GPA){
        super(name,age);
        this.rollNumber = rollNumber;
        this.course = course;
        this.GPA = GPA;
    }

    @Override
    void displayDetails() {
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Course : " + course);
        System.out.println("GPA : " + GPA);
    }

    @Override
    public String toString() {
        return    "--------------------------------------------------" +
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nRoll Number: " + rollNumber +
                "\nCourse: " + course +
                "\nGPA: " + GPA +
                "\n--------------------------------------------------";
    }


    public int getRollNumber() {
        return rollNumber;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }


}