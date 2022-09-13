import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){
        Scanner entry3 = new Scanner(System.in);
        float Guille, Luis, Juan, total;

        System.out.println("Dinero que tiene Guille:");
        Guille = entry3.nextFloat();

        Luis = Guille / 2;
        Juan = (Luis + Guille)/2;

        total = Guille + Luis + Juan;
        System.out.println("Luis tiene: "+Luis);
        System.out.println("Juan tiene:"+Juan);
        System.out.println("Los tres tienen: "+total);

    }
}
