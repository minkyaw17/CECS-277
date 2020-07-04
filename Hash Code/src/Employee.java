public class Employee implements Comparable<Employee> {
    private String FName;
    private String LName;
    private int ID;

    /**
     * default constructor
     */
    public Employee() {
        FName = "";
        LName = "";
        ID = 0;
    }

    /**
     * second constructor with parameters
     * @param fName
     * @param lName
     * @param ID
     */
    public Employee(String fName, String lName, int ID) {
        this.FName = fName;
        this.LName = lName;
        this.ID = ID;
    }

    /**
     * setter for first name
     * @param FName
     */
    public void setFName(String FName) {
        this.FName = FName;
    }

    /**
     * getter for first name
     * @return FName
     */
    public String getFName() {
        return FName;
    }

    /**
     * setter for last name
     * @param LName
     */
    public void setLName(String LName) {
        this.LName = LName;
    }

    /**
     * getter for last name
     * @return LName
     */
    public String getLName() {
        return LName;
    }

    /**
     * setter for ID
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * getter for ID
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * returning the formatted version of private data members
     * @return String
     */
    public String toString() {
        return "ID:" + ID + " " +  "LastName:" + LName + " " + "FirstName:" + FName + " ";
    }

    /**
     * sorting method
     * @param E
     * @return
     */
    public int compareTo(Employee E) {
        if (LName.compareTo(E.LName) == 0) {
            if(FName.compareTo(E.FName) == 0) {
                return this.ID - E.ID;
            }
            return this.FName.compareTo(E.FName);
        }
        return this.LName.compareTo(E.LName);
    }

    /**
     * equals method to check if the attributes of the Employee class is
     * @param E
     * @return
     */
    public boolean equals(Employee E) {
        return FName.equals(E.FName) && LName.equals(E.LName) && ID == E.ID;
    }

    /**
     * hashCode of the object
     * @return h
     */
    public int hashCode() {
        final int HASH_MULTIPLIER = 29;
        int h = HASH_MULTIPLIER * FName.hashCode() + LName.hashCode();
        h = HASH_MULTIPLIER * h + ((Integer)ID).hashCode();
        return h;
    }

}
