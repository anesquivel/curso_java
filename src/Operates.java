import java.util.Scanner;

public class Operates {

    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);
        float num1, num2, suma, resta, mult, div;

        System.out.println("Digit two numbers: ");
        num1 = entry.nextFloat();
        num2 = entry.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("Suma results is: "+ suma);
        System.out.println("Resta results is: "+resta);
        System.out.println("Mult results is: "+mult);
        System.out.println("Div results is: "+div);

        double base  = 5, exponente = 2;
        double res = Math.pow(base, exponente);
        System.out.println(res);

        double num = Math.random();
        System.out.println(num);

        double numDecimal = 5.46;
        long result = Math.round(numDecimal);
        System.out.println(result);
    }
}
