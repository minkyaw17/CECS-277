import java.util.Date;

public class PartTime extends Staff {
    private int HoursperWeek;

    public PartTime() {
        super();
        HoursperWeek = 0;
    }

    public PartTime(int HPW) {
        HoursperWeek = HPW;
    }

    public void setHoursperWeek(int HPW){
        this.HoursperWeek = HPW;
    }

    public int getHoursperWeek() {
        return HoursperWeek;
    }

    public double monthlyEarning(){
        return this.getHourlyRate() * HoursperWeek * 4;
    }

    public String toString() {
        String Fname = this.getFirstName();
        String Lname = this.getLastName();
        String ID = this.getIDNumber();
        char Sex = this.getSex();
        Date D = this.getBirthDate();
        int HPM = this.getHoursperWeek() * 4;

        return "\nLast Name: " + Lname + "\nFirst Name: " + Fname +
                "\nID: " + ID +
                "\nSex: " + Sex +
                "\nBirth Date: " + D +
                "\nHourly Rate: $" + this.getHourlyRate() +
                "\nHours Worked Per Week: " + this.getHoursperWeek() +
                "\nFull Time Monthly Salary: $" + this.monthlyEarning() + "\n";
    }
}

// "ID Employee Number: " + this.getIDNumber() +
//                "\nEmployee Name: " + name +
//                "\nBirth Date: " + this.getBirthDate()
//                + "\nHours worked per month: " + HPM +
//                "\nFull Time Monthly Salary: " + this.monthlyEarning();

//        ID Employee number :_________
//        Employee name: __________
//        Birth date: _______
//        Hours works per month: ______
//        Monthly Salary: _________
