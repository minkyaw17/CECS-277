import java.util.ArrayList;

/**
 * Creating a Student class that will add
 * classes and grades into this object
 */
public class Student {
    private String FirstName;
    private String LastName;
    private ArrayList<String> Classes;
    private ArrayList<Grades> Grades;

    /**
     * default constructor
     */
    public Student() {
        FirstName = "";
        LastName = "";
    }

    /**
     * second constructor
     * @param FName
     * @param LName
     */
    public Student(String FName, String LName) {
        FirstName = FName;
        LastName = LName;
    }

    /**
     * setter for FirstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    /**
     * getter for FirstName
     * @return FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * setter for LastName
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    /**
     * getter for LastName
     * @return LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * setter for classes to be added
     * @param classes
     */
    public void setClasses(ArrayList<String> classes) {
        this.Classes = classes;
    }

    /**
     * getter for classes
     * @return Classes
     */
    public ArrayList<String> getClasses() {
        return Classes;
    }

    /**
     * setter for grades to be added
     * @param grades
     */
    public void setGrades(ArrayList<Grades> grades) {
        this.Grades = grades;
    }

    /**
     * getter for grades
     * @return Grades
     */
    public ArrayList<Grades> getGrades() {
        return Grades;
    }

    /**
     * method to add a class to the student object
     * @param ClassName
     */
    public void addClass(String ClassName) {
        if (Classes == null) {
            Classes = new ArrayList<String>();
        }
        Classes.add(ClassName);
    }

    /**
     * method to add grade points to the student object
     * @param GradePoint
     */
    public void addGrade(Grades GradePoint) {
        if (Grades == null) {
            Grades = new ArrayList<Grades>();
        }
        Grades.add(GradePoint);
    }
}
