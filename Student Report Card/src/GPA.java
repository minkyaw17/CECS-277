import java.util.ArrayList;

/**
 * Class to calculate the GPA of the student
 */
public class GPA {
    /**
     * method for calculating the GPA of a student
     * @param grades
     * @return GPA
     */
    public double GPACalculator(ArrayList<Grades> grades) {
        double totalPts = 0.0;
        for (Grades grades1: grades) {
            totalPts += grades1.getGradePoints();
        }

        double GPA = totalPts/grades.size();
        return GPA;
    }
}
