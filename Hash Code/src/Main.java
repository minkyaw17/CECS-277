import java.util.*;

public class Main {
    public static void main(String [] args) {
        Map <Integer, Employee> Employee = new TreeMap<Integer, Employee>();
        Map <Employee, Integer> Performance = new TreeMap<Employee, Integer>();

        boolean t = true;
        while (t) {
        int input = PrintMenuAndGetChoice();
        switch(input) {
            case 1:
                add(Employee, Performance);
                break;

            case 2:
                modify(Employee, Performance);
                break;

            case 3:
                remove(Employee, Performance);
                break;

            case 4:
                print(Performance);
                break;

            case 5:
                t = false;
                break;

            default:
                System.out.println("Please enter a valid input: ");
                break;
            }

        }

    }

    public static int PrintMenuAndGetChoice() {
        System.out.println("\n1. Add Employee");
        System.out.println("2. Modify Performance");
        System.out.println("3. Remove");
        System.out.println("4. Print");
        System.out.println("5. Exit");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void add(Map <Integer, Employee> EmployeeMap, Map<Employee, Integer> PerformanceMap) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the First Name of the Employee to add: ");
        String FName = in.next();
        System.out.println("Please enter the Last Name of the Employee to add: ");
        String LName = in.next();
        System.out.println("Please enter the ID of the Employee to add: ");
        int ID = in.nextInt();
        System.out.println("Please enter the Performance of the Employee to add: ");
        int Performance = in.nextInt();
//        System.out.println("ID: " + ID + "Last Name: " + LName + "First Name: " + FName + "Performance: " + Performance);
        while (EmployeeMap.containsKey(ID)) {
            System.out.println("The ID you entered already exists! Please enter a different one. ");
            ID = in.nextInt();
        }

        Employee myEmployee = new Employee(FName, LName, ID);
        EmployeeMap.put(myEmployee.getID(), myEmployee);
        PerformanceMap.put(myEmployee, Performance);

    }

    public static void remove(Map <Integer, Employee> EmployeeMap, Map<Employee, Integer> PerformanceMap) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please select an Employee to remove: ");
        int ID = in.nextInt();
        PerformanceMap.remove(EmployeeMap.get(ID));
        EmployeeMap.remove(ID);
    }

    public static void modify(Map <Integer, Employee> EmployeeMap, Map<Employee, Integer> PerformanceMap) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an Employee ID to modify the performance: ");
        int ID = in.nextInt();
        while (!EmployeeMap.containsKey(ID)) {
            System.out.println("The employee you are trying to modify the performance of doesn't exist. Please enter a valid ID: ");
            ID = in.nextInt();
        }

        System.out.println("Enter the new performance of the Employee: ");
        int Performance = in.nextInt();
        PerformanceMap.put(EmployeeMap.get(ID), Performance);
    }

    public static void print(Map<Employee, Integer> PerformanceMap) {
        Set<Employee> EmployeeList = PerformanceMap.keySet();
        for (Employee e: EmployeeList) {
            System.out.println(e.toString() + "Performance:" + PerformanceMap.get(e));
        }
    }
}
