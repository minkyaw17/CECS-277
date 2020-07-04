public class Main {
    public static void main(String[] args) {
        Student myStudent = new Student();
        GPA myGPA = new GPA();
        Grades Grade1 = new Grades();
        Grades Grade2 = new Grades();
        Grades Grade3 = new Grades();
        Grades Grade4 = new Grades();
        Classes myClass = new Classes();

        myStudent.setFirstName("Min");
        myStudent.setLastName("Kyaw");

        Grade1.setGradePoints(4);
        Grade2.setGradePoints(3);
        Grade3.setGradePoints(2);
        Grade4.setGradePoints(3);

        myStudent.addClass(myClass.COMPUTERSCIENCE);
        myStudent.addClass(myClass.ENGLISH);
        myStudent.addClass(myClass.MATH);
        myStudent.addClass(myClass.SCIENCE);

        myStudent.addGrade(Grade1);
        myStudent.addGrade(Grade2);
        myStudent.addGrade(Grade3);
        myStudent.addGrade(Grade4);

        System.out.println("Student Name: " + myStudent.getFirstName() + " " + myStudent.getLastName());
        System.out.println("Student GPA: " + myGPA.GPACalculator(myStudent.getGrades()));
//        System.out.println(myClass.COMPUTERSCIENCE);


//        myStudent.addGrade(new Grades(Classes.COMPUTERSCIENCE, 4));

    }
}
