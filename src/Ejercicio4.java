import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){
        Scanner entry4 = new Scanner(System.in);

        final float mensual = 1000, comision = 150;

        double totalComission, totalSalary, priceCars, totalPriceCars;
        int totalOfCars;

        System.out.println("Digit the amount of cars sold by the employee:");
        totalOfCars = entry4.nextInt();


        System.out.println("Digit the price of the car sold:");
        priceCars = entry4.nextFloat();


        totalComission  = totalOfCars * comision;
        totalPriceCars = priceCars * 0.05 * totalOfCars;
        totalSalary = totalComission + mensual + totalPriceCars;


        System.out.println("Salary total is: "+totalSalary);

    }

}
