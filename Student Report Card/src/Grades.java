/**
 * Creating a class Grades that
 * gets the Grade Points of the Student
 * and the class names
 */

public class Grades {
    private String ClassName;
    private double GradePoints;

    /**
     * default constructor
     */
    public Grades() {
        ClassName = "";
        GradePoints = 0.0;
    }

    /**
     * second constructor with parameters
     * @param className for ClassName
     * @param gradePoints for GradePoints
     */
    public Grades(String className, double gradePoints) {
        ClassName = className;
        GradePoints = gradePoints;
    }

    /**
     * setter for ClassName
     * @param className
     */
    public void setClassName(String className) {
        this.ClassName = className;
    }

    /**
     * getter for ClassName
     * @return ClassName
     */
    public String getClassName() {
        return ClassName;
    }


    /**
     * setter for GradePoints
     * @param gradePoints
     */
    public void setGradePoints(double gradePoints) {
        this.GradePoints = gradePoints;
    }

    /**
     * getter for GradePoints
     * @return GradePoints
     */
    public double getGradePoints() {
        return GradePoints;
    }
}
