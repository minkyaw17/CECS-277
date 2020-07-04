import java.util.Date;
public class Staff extends Employee {
    private double HourlyRate;

    public Staff() {
        super();
        HourlyRate = 0.0;
    }

    public Staff(double rate) {
        HourlyRate = rate;
    }

    public void setHourlyRate(double rate) {
        HourlyRate = rate;
    }

    public double getHourlyRate(){
        return HourlyRate;
    }

    public double monthlyEarning() {
        return getHourlyRate() * STAFF_MONTHLY_HOURS_WORKED;
        // or * 160 as said in the assignment
    }

    public String toString() {
        String Fname = this.getFirstName();
        String Lname = this.getLastName();
        String ID = this.getIDNumber();
        char Sex = this.getSex();
        Date D = this.getBirthDate();


        return "\nLast Name: " + Lname + "\nFirst Name: " + Fname +
                "\nID: " + ID +
                "\nSex: " + Sex +
                "\nBirth Date: " + D +
                "\nHourly Rate: $" + this.getHourlyRate() +
                "\nFull Time Monthly Salary: $" + this.monthlyEarning() + "\n";

    }

    //"ID Employee Number: " + this.getIDNumber() +
    //                "\nEmployee Name: " + name +
    //                "\nBirth Date: " + this.getBirthDate()
    //                + "\nFull Time Monthly Salary: " + this.monthlyEarning();
    // ID Employee number :_________
    // Employee name: __________
    // Birth date: _______
    // Full Time
    // Monthly Salary: _________


}
