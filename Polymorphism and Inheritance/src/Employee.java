import java.net.IDN;
import java.util.Calendar;
import java.util.Date;
import java.util.Comparator;

// do Javadocs for only one class

/**
 * creating an abstract class that implements EmployeeInfo Interface
 * amd implements a compareTo method that compares Employee ID by ascending order
 */
public abstract class Employee implements EmployeeInfo, Comparable<Employee> {
    private String LastName;
    private String FirstName;
    private String IDNumber;
    private char Sex;
    private Calendar BirthDate;

    /**
     * Default constructor using super()
     */
    public Employee() {
        super();
    }

    /**
     * Second constructor with parameters
     * @param lName for Last Name
     * @param fName for First Name
     * @param IDNum for ID Number of Employee
     * @param S for Sex
     * @param bDate for Birthday
     */
    public Employee(String lName, String fName, String IDNum, char S, Calendar bDate) {
        this.LastName = lName;
        this.FirstName = fName;
        this.IDNumber = IDNum;
        this.Sex = S;
        this.BirthDate = bDate;
    }

    /**
     *
     * @return converted String of every private data member
     */
    public String toString() {
        String name = FirstName + " " + LastName;
        return "\nID Employee Number: " + IDNumber + "\nEmployee Name: " + name + "\nBirth Date: " + BirthDate;
    }

    /**
     * Setting the Last Name of employee to lastName
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    /**
     * Getting the Last Name of employee
     * @return LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * Setting the First Name of employee to firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    /**
     * Getting the First Name of employee
     * @return FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * Setting the ID Number of employee to IDNumber
     * @param IDNumber
     */
    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    /**
     * Getting the ID Number of employee
     * @return IDNumber
     */
    public String getIDNumber() {
        return IDNumber;
    }

    /**
     * Setting the Sex of employee to Sex
     * @param Sex
     */
    public void setSex(char Sex) {
        this.Sex = Sex;
    }

    /**
     * Getting the Sex of employee
     * @return
     */
    public char getSex() {
        return Sex;
    }

    /**
     * Setting the Birthday of employee to birthDate
     * @param birthDate
     */
    public void setBirthDate(Calendar birthDate) {
        this.BirthDate = birthDate;
    }

    /**
     * Getting the Birthday of employee
     * @return BirthDate.getTime()
     */
    public Date getBirthDate() {
        return BirthDate.getTime();
        // changed type to Date in order to return the full date
    }

    /**
     * Abstract method to be implemented in all the other classes
     * that extends from this Employee class
     * @return double
     */
    abstract public double monthlyEarning();

    /**
     * Comparing the ID Number in ascending order
     * @param e
     * @return
     */

    // method for D.
    public int compareTo(Employee e) {

        if (e == null)
            return 0;

        if (IDNumber.compareTo(e.IDNumber) == 0)
            return 0;

        else if (IDNumber.compareTo(e.IDNumber) > 0)
            return 1;

        else
            return -1;

    }
}
