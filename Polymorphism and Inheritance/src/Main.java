import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Main {
    @SuppressWarnings("null")

    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        //Last name:  Allen
        //First name: Paita
        //ID: 123
        //Sex: M
        //Birth date: 2/23/59
        //Hourly rate: $50.00

        Staff Staff1 = new Staff();
        Staff1.setFirstName("Paita");
        Staff1.setLastName("Allen");
        Staff1.setIDNumber("123");
        Staff1.setSex('M');
        Calendar C = Calendar.getInstance();
        C.set(1959,1,23);
        Staff1.setBirthDate(C);
        Staff1.setHourlyRate(50.0);
        System.out.println(Staff1.toString());
        employees.add(Staff1);
        System.out.println();

        //Last name: Zapata
        //First Name: Steven
        //ID: 456
        //Sex: F
        //Birth date: 7/12/64
        //Hourly rate: $35.00

        Staff Staff2 = new Staff();
        Staff2.setFirstName("Steven");
        Staff2.setLastName("Zapata");
        Staff2.setIDNumber("456");
        Staff2.setSex('F');
        C = Calendar.getInstance();
        C.set(1964, 6,12);
        Staff2.setBirthDate(C);
        Staff2.setHourlyRate(35.0);
        System.out.println(Staff2.toString());
        employees.add(Staff2);
        System.out.println();

        //Last name:Rios
        //First name:Enrique
        //ID: 789
        //Sex: M
        //Birth date: 6/2/70
        //Hourly rate: $40.00

        Staff Staff3 = new Staff();
        Staff3.setFirstName("Enrique");
        Staff3.setLastName("Rios");
        Staff3.setIDNumber("789");
        Staff3.setSex('M');
        C = Calendar.getInstance();
        C.set(1970, 5,2);
        Staff3.setBirthDate(C);
        Staff3.setHourlyRate(40.0);
        System.out.println(Staff3.toString());
        employees.add(Staff3);
        System.out.println();

        //Last name: Johnson
        //First name: Anne
        //ID: 243
        //Sex: F
        //Birth date: 4/27/62
        //Level: Full
        //Degree: Ph.D
        //Major: Engineering
        //Reseach: 3

        Faculty Faculty1 = new Faculty();
        Faculty1.setFirstName("Anne");
        Faculty1.setLastName("Johnson");
        Faculty1.setIDNumber("243");
        Faculty1.setSex('F');
        C = Calendar.getInstance();
        C.set(1962, 3, 27);
        Faculty1.setBirthDate(C);
        Faculty1.setLevel(Faculty.Level.FU);
        Education E1 = new Education();
        E1.setDegree(Education.Degree.PhD);
        E1.setMajor("Engineering");
        E1.setResearch(3);
        Faculty1.setEdu(E1);
        System.out.println(Faculty1.toString());
        employees.add(Faculty1);

        System.out.println();

        //Last name: Bouris
        //First name: William
        //ID: 791
        //Sex: F
        //Birth date: 3/14/75
        //Level: Associate
        //Degree: Ph.D
        //Major: English
        //Reseach: 1

        Faculty Faculty2 = new Faculty();
        Faculty2.setFirstName("William");
        Faculty2.setLastName("Bouris");
        Faculty2.setIDNumber("791");
        Faculty2.setSex('F');
        C = Calendar.getInstance();
        C.set(1975, 2, 14);
        Faculty2.setBirthDate(C);
        Faculty2.setLevel(Faculty.Level.AO);
        Education E2 = new Education();
        E2.setDegree(Education.Degree.PhD);
        E2.setMajor("English");
        E2.setResearch(1);
        Faculty2.setEdu(E2);
        System.out.println(Faculty2.toString());
        employees.add(Faculty2);
        System.out.println();

        //Last name: Andrade
        //First name: Christopher
        //ID: 623
        //Sex: F
        //Birth date: 5/22/80
        //Level: Assistant
        //Degree: MS
        //Major: Physical Education
        //Research: 0

        Faculty Faculty3 = new Faculty();
        Faculty3.setFirstName("Christopher");
        Faculty3.setLastName("Andrade");
        Faculty3.setIDNumber("623");
        Faculty3.setSex('F');
        C = Calendar.getInstance();
        C.set(1980, 4, 22);
        Faculty3.setBirthDate(C);
        Faculty3.setLevel(Faculty.Level.AS);
        Education E3 = new Education();
        E3.setDegree(Education.Degree.MS);
        E3.setMajor("Physical Education");
        E3.setResearch(0);
        Faculty3.setEdu(E3);
        System.out.println(Faculty3.toString());
        employees.add(Faculty3);
        System.out.println();

        // Last name: Guzman
        //First name: Augusto
        //ID: 455
        //Sex: F
        //Birth date: 8/10/77
        //Hourly rate: $35.00
        //Hours worked per week: 30

        PartTime PT1 = new PartTime();
        PT1.setFirstName("Augusto");
        PT1.setLastName("Guzman");
        PT1.setIDNumber("455");
        PT1.setSex('F');
        C = Calendar.getInstance();
        C.set(1977, 7, 10);
        PT1.setBirthDate(C);
        PT1.setHourlyRate(35.0);
        PT1.setHoursperWeek(30);
        System.out.println(PT1.toString());
        employees.add(PT1);
        System.out.println();

        //Last name: Depirro
        //First name: Martin
        //ID: 678
        //Sex: F
        //Birth date: 9/15/87
        //Hourly rate: $30.00
        //Hours worked per week:15

        PartTime PT2 = new PartTime();
        PT2.setFirstName("Martin");
        PT2.setLastName("Depirro");
        PT2.setIDNumber("678");
        PT2.setSex('F');
        C = Calendar.getInstance();
        C.set(1987, 8, 15);
        PT2.setBirthDate(C);
        PT2.setHourlyRate(30.0);
        PT2.setHoursperWeek(15);
        System.out.println(PT2.toString());
        employees.add(PT2);
        System.out.println();

        //Last name: Aldaco
        //First name: Marque
        //ID: 945
        //Sex: M
        //Birth date: 11/24/88
        //Hourly rate: $20.00
        //Hours worked per week: 35

        PartTime PT3 = new PartTime();
        PT3.setFirstName("Aldaco");
        PT3.setLastName("Marque");
        PT3.setIDNumber("945");
        PT3.setSex('M');
        C = Calendar.getInstance();
        C.set(1988, 10, 24);
        PT3.setBirthDate(C);
        PT3.setHourlyRate(20.0);
        PT3.setHoursperWeek(35);
        System.out.println(PT3.toString());
        employees.add(PT3);
        System.out.println();

        double sumOfPTSalary = PT1.monthlyEarning() + PT2.monthlyEarning() + PT3.monthlyEarning();
        double sumOfStaffSalary = Staff1.monthlyEarning() + Staff2.monthlyEarning() + Staff3.monthlyEarning();
        double sumOfFacultySalary = Faculty1.monthlyEarning() + Faculty2.monthlyEarning() + Faculty3.monthlyEarning();
        double sumOfallEmployeesSalary = sumOfPTSalary + sumOfStaffSalary + sumOfFacultySalary;

        System.out.println("B. Total Monthly Salary for all Part-Time Workers: $" + sumOfPTSalary);
        System.out.println("C. Total Monthly Salary for all Employees: $" + sumOfallEmployeesSalary);

        System.out.println("\nD. Sorted by ID");
        Collections.sort(employees);
        System.out.println(employees);

        System.out.println("\nE. Sorted by Last Name");
        Collections.sort(employees, new LNameComparator());
        System.out.println(employees);

        //Cloning first Faculty Member
        Faculty C1 = (Faculty) Faculty1.clone();
        C1.setFirstName("Min");
        C1.setLastName("Kyaw");
        C1.setIDNumber("018");
        C1.setSex('M');
        C1.setLevel(Faculty.Level.AS);
        C = Calendar.getInstance();
        C.set(1999, 9, 10);
        C1.setBirthDate(C);
        Education EC = new Education();
        EC.setDegree(Education.Degree.MS);
        EC.setResearch(2);
        EC.setMajor("Computer Science");
        C1.setEdu(EC);

        System.out.println("F. Verification of Clone");
        System.out.println(Faculty1.toString());
        System.out.println(C1.toString());

    }
}
