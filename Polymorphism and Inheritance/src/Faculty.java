import java.util.Date;

public class Faculty extends Employee implements Cloneable {
    public enum Level {
        AS,
        AO,
        FU
    }


    private Level level;
    private Education edu;

    public Faculty() {
        super();
    }

    public Faculty(Level lvl, Education Edu) {
        this.level = lvl;
        this.edu = Edu;
    }

    public void setLevel(Level lvl){
        this.level = lvl;
    }

    public Level getLevel() {
        return level;
    }

    public void setEdu(Education edu) {
        this.edu = edu;
    }

    public Education getEdu() {
        return edu;
    }

    @SuppressWarnings("null")
    @Override
    public double monthlyEarning() {
        switch (level) {
            case AS:
                return FACULTY_MONTHLY_SALARY;
            case AO:
                return FACULTY_MONTHLY_SALARY * 1.5;
            case FU:
                return FACULTY_MONTHLY_SALARY * 2.0;
        }
        return 0;
    }

    String professor;

    public String toString() {
        String Fname = this.getFirstName();
        String Lname = this.getLastName();
        String ID = this.getIDNumber();
        char Sex = this.getSex();
        Date D = this.getBirthDate();

        switch (level) {
            case AS:
                professor = "Assistant Professor";
                break;
            case AO:
                professor = "Associate Professor";
                break;
            case FU:
                professor = "Full Time Professor";
                break;
        }
        return "\nLast Name: " + Lname + "\nFirst Name: " + Fname +
                "\nID: " + ID +
                "\nSex: " + Sex +
                "\nBirth Date: " + D +
                "\nLevel: " + professor +
                "\nFull Time Monthly Salary: $" + this.monthlyEarning() + "\n" +
                edu.toString();
    }

//    Faculty FClone = new Faculty();
    public Object clone() throws CloneNotSupportedException {
        Faculty FC = (Faculty) super.clone();
//        FC = new Faculty();
        return FC;
    }

    // ID Employee number :_________
    //Employee name: __________
    //Birth date: _______
    //XXXXX Professor where  XXXXX can be Assistant, Associate or Full
    //Monthly Salary: _________

}
