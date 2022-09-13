import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){
        Scanner entry2 = new Scanner(System.in);
        int hoursWorked;
        float salary, totalSalary;

        System.out.println("Enter the salary per hour total:");
        salary = entry2.nextFloat();
        System.out.println("Enter the hours worked: ");
        hoursWorked =  entry2.nextInt();

        totalSalary = salary * hoursWorked;

        System.out.println("Total Salary: "+totalSalary);
    }
}
